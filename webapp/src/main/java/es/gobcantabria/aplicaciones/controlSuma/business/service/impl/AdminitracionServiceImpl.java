package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atlassian.jira.rpc.soap.client.JiraSoapService;
import com.atlassian.jira.rpc.soap.client.RemoteAuthenticationException;
import com.atlassian.jira.rpc.soap.client.RemoteException;
import com.atlassian.jira.rpc.soap.client.RemotePermissionException;
import com.atlassian.jira.rpc.soap.client.RemoteProject;
import com.atlassian.jira.rpc.soap.client.RemoteProjectRole;
import com.atlassian.jira.rpc.soap.client.RemoteProjectRoleActors;
import com.atlassian.jira.rpc.soap.client.RemoteRoleActors;
import com.atlassian.jira.rpc.soap.client.RemoteUser;
import com.atlassian.jira_soapclient.SOAPSession;
import com.atlassian.jira_soapclient.SOAPClient.Timing;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.InventarioDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.dao.PersonaDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.dao.RolDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Rol;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioWithJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RespuestaSincronizadoJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolesWithJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.AdministracionHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.AdministracionService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.InventarioService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.PersonaService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.RolService;
import es.gobcantabria.aplicaciones.controlSuma.util.Utilidades;
import es.gobcantabria.aplicaciones.controlSuma.web.Enum.RolesEnum;
import es.gobcantabria.aplicaciones.jirawsuma.JiraWSumaInterface;
import es.gobcantabria.aplicaciones.jirawsuma.impl.JiraWSumaImpl;

/**
 * Clase que implementa los métodos del Servicio de Administración
 * 
 * @author malba
 * 
 */
@Service

public class AdminitracionServiceImpl implements AdministracionService {

	@Autowired
	private InventarioDAO inventarioDAO;

	@Autowired
	private RolDAO rolDAO;

	@Autowired
	private AdministracionHelper administracionHelper;

	@Autowired
	private PersonaService personaService;

	@Autowired
	private InventarioService inventarioService;

	@Autowired
	private RolService rolService;

	@Override
	public RespuestaSincronizadoJiraDTO ComprobarSincronizacionWithJira() {

		Map<String, Inventario> mapInventario = new HashMap<String, Inventario>();
		RespuestaSincronizadoJiraDTO respuesta = new RespuestaSincronizadoJiraDTO();
		List<InventarioWithJiraDTO> listaRespuesta = new ArrayList<InventarioWithJiraDTO>();
		JiraWSumaInterface wsJira = new JiraWSumaImpl(
				Utilidades.getinstanceJiraconfiguration());

		List<Inventario> listaInventario = inventarioDAO
				.executeQuery("Inventario.findAllActivos");
		List<RemoteProject> proyectosJira = wsJira.findAllProject();

		for (Inventario inventario : listaInventario) {
			if (!mapInventario.containsKey(inventario.getCodJira())) {
				mapInventario.put(inventario.getCodJira(), inventario);
			}
		}
		respuesta.setnProyectosActivosInventario(listaInventario.size());
		respuesta.setnProyectosSincronizadosJiraInicial(mapInventario.size());

		int cont = 0;
		for (RemoteProject pJira : proyectosJira) {

			if (!mapInventario.containsKey(pJira.getKey())) {
				// No existe, se debe crear el proyecto
				// Inventario inv= crearInventario(pJira);
				// mapInventario.put(inv.getCodJira(), inv);
				cont++;
				listaRespuesta.add(administracionHelper
						.cargarInventarioWithJiraDTO(pJira, "No"));
			} else {
				listaRespuesta.add(administracionHelper
						.cargarInventarioWithJiraDTO(
								mapInventario.get(pJira.getKey()), "Sí"));
			}

		}
		respuesta.setnProyectosPendienteSincronizados(cont);
		respuesta.setListaProyectos(listaRespuesta);

		return respuesta;

	}

	private Inventario crearInventario(RemoteProject pJira) {
		Inventario inv = new Inventario();
		System.out.println(pJira.getKey());
		inv.setActivo(1);
		inv.setCodJira(pJira.getKey());
		inv.setCodInventario(pJira.getKey());
		inv.setNombreInventario(pJira.getName());
		inv.setDescripcion(pJira.getDescription());

		StringBuilder obs = new StringBuilder();
		obs.append("- Otra información obtenida de JIRA");
		obs.append(" \n ");
		obs.append("  -> Lider del Proyecto: " + pJira.getLead());
		obs.append(" \n ");
		obs.append("  -> URL del Proyecto " + pJira.getUrl());

		inv.setObservaciones(obs.toString());

		inventarioDAO.create(inv);

		return inv;

	}

	@Override
	public RespuestaSincronizadoJiraDTO ComprobarCrearEnInventario() {
		Map<String, Inventario> mapInventario = new HashMap<String, Inventario>();
		RespuestaSincronizadoJiraDTO respuesta = new RespuestaSincronizadoJiraDTO();
		List<InventarioWithJiraDTO> listaRespuesta = new ArrayList<InventarioWithJiraDTO>();
		JiraWSumaInterface wsJira = new JiraWSumaImpl(
				Utilidades.getinstanceJiraconfiguration());

		List<Inventario> listaInventario = inventarioDAO
				.executeQuery("Inventario.findAllActivos");
		List<RemoteProject> proyectosJira = wsJira.findAllProject();

		for (Inventario inventario : listaInventario) {
			if (!mapInventario.containsKey(inventario.getCodJira())) {
				mapInventario.put(inventario.getCodJira(), inventario);
			}
		}

		int cont = 0;
		for (RemoteProject pJira : proyectosJira) {

			if (!mapInventario.containsKey(pJira.getKey())) {
				// No existe, se debe crear el proyecto
				Inventario inv = crearInventario(pJira);
				mapInventario.put(inv.getCodJira(), inv);
				cont++;
			}
			listaRespuesta.add(administracionHelper
					.cargarInventarioWithJiraDTO(
							mapInventario.get(pJira.getKey()), "Sí"));

		}
		respuesta.setnProyectosPendienteSincronizados(0);
		respuesta.setnProyectosActivosInventario(mapInventario.size());
		respuesta.setnProyectosSincronizadosJiraInicial(mapInventario.size());
		respuesta.setListaProyectos(listaRespuesta);

		return respuesta;

	}

	@Override
	public RespuestaSincronizadoJiraDTO ComprobarSincronizacionWithJiraRoles() {

		Map<String, Rol> mapRoles = new HashMap<String, Rol>();
		RespuestaSincronizadoJiraDTO respuesta = new RespuestaSincronizadoJiraDTO();
		List<RolesWithJiraDTO> listaRespuesta = new ArrayList<RolesWithJiraDTO>();

		JiraWSumaInterface wsJira = new JiraWSumaImpl(
				Utilidades.getinstanceJiraconfiguration());

		List<Rol> listaRoles = rolDAO.executeQuery("Rol.findAll");
		List<RemoteProjectRole> rolesJira = wsJira.findAllRoles();

		for (Rol rol : listaRoles) {
			if (!mapRoles.containsKey(rol.getNombre())) {
				mapRoles.put(rol.getNombre(), rol);
			}
		}
		respuesta.setnRoles(listaRoles.size());
		respuesta.setnRolesSincronizadosJiraInicial(mapRoles.size());

		int cont = 0;
		for (RemoteProjectRole rJira : rolesJira) {

			if (!mapRoles.containsKey(rJira.getName())) {
				// No existe, se debe crear el proyecto
				// Inventario inv= crearInventario(pJira);
				// mapInventario.put(inv.getCodJira(), inv);
				cont++;
				listaRespuesta.add(administracionHelper.cargarRolWithJiraDTO(
						rJira, "No"));
			} else {
				listaRespuesta.add(administracionHelper.cargarRolWithJiraDTO(
						mapRoles.get(rJira.getName()), "Sí"));
			}

		}
		respuesta.setnRolesPendienteSincronizados(cont);
		respuesta.setListaRoles(listaRespuesta);

		return respuesta;

	}

	@Override
	public RespuestaSincronizadoJiraDTO ComprobarCrearRoles(
			List<String> listaRolesSincronizar) {
		Map<String, Rol> mapRoles = new HashMap<String, Rol>();
		RespuestaSincronizadoJiraDTO respuesta = new RespuestaSincronizadoJiraDTO();
		List<RolesWithJiraDTO> listaRespuesta = new ArrayList<RolesWithJiraDTO>();

		JiraWSumaInterface wsJira = new JiraWSumaImpl(
				Utilidades.getinstanceJiraconfiguration());

		List<Rol> listaRoles = rolDAO.executeQuery("Rol.findAll");

		respuesta.setnRolesSincronizadosJiraInicial(listaRoles.size());

		List<RemoteProjectRole> rolesJira = wsJira.findAllRoles();
		Map<String, RemoteProjectRole> mapRemoteProjectRole = new HashMap<String, RemoteProjectRole>();
		for (RemoteProjectRole i : rolesJira)
			mapRemoteProjectRole.put(i.getName(), i);
		for (Rol i : listaRoles) {
			mapRoles.put(i.getNombre(), i);
			listaRespuesta.add(administracionHelper.cargarRolWithJiraDTO(
					mapRoles.get(i.getNombre()), "Sí"));
		}

		// Se recorre la lista seleccionada
		for (String rolNombre : listaRolesSincronizar) {

			RemoteProjectRole jRol = mapRemoteProjectRole.get(rolNombre);
			Rol rol = mapRoles.get(rolNombre);
			if (rol == null) {
				// Sincronización Total
				respuesta.setnRolesSincronizadosJiraInicial(respuesta
						.getnRolesSincronizadosJiraInicial() + 1);
				rol = new Rol();
				rol.setDescripcion(jRol.getDescription());
				rol.setNombre(jRol.getName());
				rol.setCodJira(jRol.getId());
				rolDAO.create(rol);
				mapRoles.put(rolNombre, rol);
				listaRespuesta.add(administracionHelper.cargarRolWithJiraDTO(
						mapRoles.get(rol.getNombre()), "Sí"));

			}
		}

		int cont = 0;

		for (RemoteProjectRole rJira : rolesJira) {

			if (!mapRoles.containsKey(rJira.getName())) {
				cont++;
				listaRespuesta.add(administracionHelper.cargarRolWithJiraDTO(
						rJira, "No"));
			}
		}

		respuesta.setnRoles(mapRoles.size());
		respuesta.setnRolesPendienteSincronizados(cont);
		respuesta.setListaRoles(listaRespuesta);
		return respuesta;

	}

	@Override
	public RespuestaSincronizadoJiraDTO crearPersonas(
			Map<String, Long> listaRolesSincronizar) throws Exception {
		RespuestaSincronizadoJiraDTO respuesta = new RespuestaSincronizadoJiraDTO();

		SOAPSession soapSession = new SOAPSession(Utilidades
				.getinstanceJiraconfiguration().getUrl());
		soapSession.connect(Utilidades.getinstanceJiraconfiguration()
				.getUserName(), Utilidades.getinstanceJiraconfiguration()
				.getPassword());
		JiraSoapService jiraSoapService = soapSession.getJiraSoapService();
		String authToken = soapSession.getAuthenticationToken();
		List<InventarioDTO> listaInventario = inventarioService.findByActivos();
		Map<String, RemoteProjectRole> listaRolesJira = new HashMap<String, RemoteProjectRole>();
		Map<String, RolDTO> listaRoles = new HashMap<String, RolDTO>();
		RemoteProjectRole roleJira;
		RemoteProjectRoleActors actores;
		RolDTO roleDto;
		boolean create;
		for (String codJira : listaRolesSincronizar.keySet()) {
			RemoteProjectRole role = jiraSoapService.getProjectRole(authToken,
					listaRolesSincronizar.get(codJira));
			listaRolesJira.put(codJira, role);
			roleDto = rolService.getByCodJira(role.getId());
			listaRoles.put(codJira, roleDto);
		}

		int cont = 0;
		for (InventarioDTO inventario : listaInventario) {

			if (cont == 100)
				break;
			RemoteProject proyectoJ = jiraSoapService.getProjectByKey(
					authToken, inventario.getCodJira());
			if (proyectoJ!=null){
				
			
			
			for (String tipo : RolesEnum.getListSinDesarrollo()) {
				roleJira = listaRolesJira.get(tipo);
				roleDto = listaRoles.get(tipo);
				create = true;
				if (roleJira != null && roleDto != null) {
					actores = jiraSoapService.getProjectRoleActors(authToken,
							roleJira, proyectoJ);
					for (RemoteUser user : actores.getUsers()) {
						PersonaDTO per = new PersonaDTO();
						per.setCodJira(user.getName());
						per.setCodPersona(user.getName());
						per.setEmail(user.getEmail());
						per = Utilidades.convertirNombre(user.getFullname(),
								per);
						per.setRol(roleDto);
						per = personaService.comprobarOrSavePersona(per);
						if (create) {
							if (tipo.equals(RolesEnum.ANALISTAFUNCIONALGOB.toString())){
								inventario.setResponsableGob(per);
							}else if (tipo.equals(RolesEnum.ANALISTAFUNCIONALSUMA.toString())){
								inventario.setResponsableSUMA(per);
							}else if (tipo.equals(RolesEnum.USUARIOFINAL.toString())){
								inventario.setUsuarioFinal(per);
							}
							
							create = false;
						} else {
							// Si hay mas personas como analista funcional, se
							// debería añadir en algún sitio

						}
					}

				}
			}
			// Guardamos los desarrolladores
			roleJira = listaRolesJira.get(RolesEnum.DESARROLLADORES.toString());
			roleDto = listaRoles.get(RolesEnum.DESARROLLADORES.toString());
			if (roleJira != null && roleDto != null) {
				actores = jiraSoapService.getProjectRoleActors(authToken,
						roleJira, proyectoJ);
				roleDto = listaRoles.get(RolesEnum.DESARROLLADORES.toString());
				List<PersonaDTO> desarrolladores = new ArrayList<PersonaDTO>();
				for (RemoteUser user : actores.getUsers()) {
					PersonaDTO per = new PersonaDTO();
					per.setCodJira(user.getName());
					per.setCodPersona(user.getName());
					per.setEmail(user.getEmail());
					per = Utilidades.convertirNombre(user.getFullname(), per);
					per.setRol(roleDto);
					per = personaService.comprobarOrSavePersona(per);
					desarrolladores.add(per);

				}
				inventario.setDesarrolladores(desarrolladores);

			}
			inventarioService.updateInventario(inventario);

			cont++;
			}
		}
		System.out.println("************************************************"+cont);
		return respuesta;

	}

}
