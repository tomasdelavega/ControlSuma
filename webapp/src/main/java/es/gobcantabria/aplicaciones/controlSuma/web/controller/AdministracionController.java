package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.RespuestaSincronizadoJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.service.AdministracionService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.InventarioService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.RolService;
import es.gobcantabria.aplicaciones.controlSuma.util.Constantes;
import es.gobcantabria.aplicaciones.controlSuma.web.Enum.RolesEnum;
import es.gobcantabria.aplicaciones.controlSuma.web.model.InventarioModel;
import es.gobcantabria.aplicaciones.controlSuma.web.model.JiraModel;

/**
 * Controlador para la tareas de administración
 * 
 * @author malba
 * 
 */
@Controller
@RequestMapping(value = "/auth/administracion")
public class AdministracionController {

	@Autowired
	private MessageSource messages;

	@Autowired
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private AdministracionService administracionService;

	@Autowired
	private RolService rolService;

	@Autowired
	private InventarioService inventarioService;

	@RequestMapping(value = "/jira/projects", method = RequestMethod.GET)
	public String mostrarInventarioCompleto(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {
		logger.debug("Entrando en la Adminitracion Carga Automática de Jia");
		RespuestaSincronizadoJiraDTO respuesta = administracionService
				.ComprobarSincronizacionWithJira();
		model.put("Sincronizar", true);

		model.put("listAplicaciones", respuesta.getListaProyectos());
		if (respuesta.getnProyectosActivosInventario() == 0) {
			model.put("ProyectosActivos", "0 Aplicaciones Activas");
		} else {
			model.put("ProyectosActivos",
					respuesta.getnProyectosActivosInventario()
							+ " Aplicaciones Activas");
		}
		if (respuesta.getnProyectosSincronizadosJiraInicial() == 0) {
			model.put("ProyectosSincronizadosInicial",
					"0 Aplicaciones Sincronizadas");
		} else {
			model.put("ProyectosSincronizadosInicial",
					respuesta.getnProyectosSincronizadosJiraInicial()
							+ " Aplicaciones Sincronizadas");
		}
		if (respuesta.getnProyectosPendienteSincronizados() == 0) {
			model.put("ProyectosPendienteSincronizar",
					"0 Proyectos Pendiente de Sincronizar");
			model.put("Sincronizar", false);

		} else {
			model.put("ProyectosPendienteSincronizar",
					respuesta.getnProyectosPendienteSincronizados()
							+ " Proyectos Pendiente de Sincronizar");

		}

		return Constantes.ADMINISTRACION_CARGA_PROYECTOS_JIRA;
	}

	@RequestMapping(value = "/jira/projects", method = RequestMethod.POST)
	public String mostrarProyectosjira(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {
		logger.debug("Entrando en la Adminitracion Carga Automática de Jira");

		RespuestaSincronizadoJiraDTO respuesta = administracionService
				.ComprobarCrearEnInventario();
		model.put("Sincronizar", true);
		model.put("listAplicaciones", respuesta.getListaProyectos());

		if (respuesta.getnProyectosActivosInventario() == 0) {
			model.put("ProyectosActivos", "0 Aplicaciones Activas");
		} else {
			model.put("ProyectosActivos",
					respuesta.getnProyectosActivosInventario()
							+ " Aplicaciones Activas");
		}

		if (respuesta.getnProyectosSincronizadosJiraInicial() == 0) {
			model.put("ProyectosActivos", "0 Aplicaciones Sincronizadas");
		} else {
			model.put("ProyectosActivos",
					respuesta.getnProyectosSincronizadosJiraInicial()
							+ " Aplicaciones Sincronizadas");
		}
		if (respuesta.getnProyectosPendienteSincronizados() == 0) {
			model.put("ProyectosPendienteSincronizar",
					"0 Proyectos Pendiente de Sincronizar");
			model.put("Sincronizar", false);
		} else {
			model.put("ProyectosPendienteSincronizar",
					respuesta.getnProyectosPendienteSincronizados()
							+ " Proyectos Pendiente de Sincronizar");
		}

		return Constantes.ADMINISTRACION_CARGA_PROYECTOS_JIRA;
	}

	@RequestMapping(value = "/jira/roles", method = RequestMethod.GET)
	public String mostrarRolesJira(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {
		logger.debug("Entrando en la Adminitracion carga Automática Roles JIRA");
		RespuestaSincronizadoJiraDTO respuesta = administracionService
				.ComprobarSincronizacionWithJiraRoles();

		model.put("listRoles", respuesta.getListaRoles());
		model.put("Sincronizar", true);

		if (respuesta.getnRoles() == 0) {
			model.put("Roles", "0 Roles ");
		} else {
			model.put("Roles", respuesta.getnRoles() + " Roles");
		}

		if (respuesta.getnRolesSincronizadosJiraInicial() == 0) {
			model.put("RolesSincronizados", "0 Roles Sincronizados");
		} else {
			model.put("RolesSincronizados",
					respuesta.getnRolesSincronizadosJiraInicial()
							+ " Roles Sincronizados");
		}
		if (respuesta.getnRolesPendienteSincronizados() == 0) {
			model.put("RolesPendienteSincronizar",
					"0 Roles Pendiente de Sincronizar");
			model.put("Sincronizar", false);

		} else {
			model.put("RolesPendienteSincronizar",
					respuesta.getnRolesPendienteSincronizados()
							+ " Roles Pendiente de Sincronizar");
		}
		model.put("pagination", respuesta.getListaRoles().size());
		return Constantes.ADMINISTRACION_CARGA_ROLES_JIRA;
	}

	@RequestMapping(value = "/jira/roles", method = RequestMethod.POST)
	public String guardarRolesJira(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {
		logger.debug("Entrando en la Adminitracion Carga Automática de Jira");
		String template = Constantes.ADMINISTRACION_CARGA_ROLES_JIRA;
		RespuestaSincronizadoJiraDTO respuesta = null;
		respuesta = administracionService.ComprobarCrearRoles(form
				.getRolesSeleccionados());
		// form = new JiraModel();

		model.put("Sincronizar", true);
		model.put("listRoles", respuesta.getListaRoles());

		if (respuesta.getnRoles() == 0) {
			model.put("Roles", "0 Roles Activos ");
		} else {
			model.put("Roles", respuesta.getnRoles() + " Roles Activos");
		}
		if (respuesta.getnRolesSincronizadosJiraInicial() == 0) {
			model.put("RolesSincronizados", "0 Roles Sincronizados");
		} else {
			model.put("RolesSincronizados",
					respuesta.getnRolesSincronizadosJiraInicial()
							+ " Roles Sincronizados");
		}
		if (respuesta.getnRolesPendienteSincronizados() == 0) {
			model.put("RolesPendienteSincronizar",
					"0 Roles Pendiente de Sincronizar");
			model.put("Sincronizar", false);

		} else {
			model.put("RolesPendienteSincronizar",
					respuesta.getnRolesPendienteSincronizados()
							+ " Roles Pendiente de Sincronizar");
		}

		model.put("pagination", respuesta.getListaRoles().size());

		return template;

	}

	@RequestMapping(value = "/jira/personas", method = RequestMethod.GET)
	public String mostrarRolesPersonas(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {

		String template = Constantes.ADMINISTRACION_CARGA_PERSONA;

		List<RolDTO> listaRoles = rolService.findAll();

		Long nProyectos = inventarioService.contarInventario();

		model.put("listaRoles", listaRoles);
		model.put("nProyectos", nProyectos);

		return template;

	}

	@RequestMapping(value = "/jira/personas", method = RequestMethod.POST)
	public String guardarRolesPersonas(
			@ModelAttribute("form") @Valid JiraModel form,
			BindingResult result, ModelMap model) {
		String template = Constantes.ADMINISTRACION_CARGA_PERSONA;

		// crear hilo

		RespuestaSincronizadoJiraDTO respuesta = null;

		Map<String, Long> listaRolesSincronizar = new HashMap<String, Long>();
		if (form.getAnalistafuncionalSUMA() != null) {
			listaRolesSincronizar.put(
					RolesEnum.ANALISTAFUNCIONALSUMA.toString(),
					form.getAnalistafuncionalSUMA());
		}
		if (form.getAnalistafuncionalGob() != null) {
			listaRolesSincronizar.put(
					RolesEnum.ANALISTAFUNCIONALGOB.toString(),
					form.getAnalistafuncionalGob());
		}
		if (form.getDesarrolladores() != null) {
			listaRolesSincronizar.put(RolesEnum.DESARROLLADORES.toString(),
					form.getDesarrolladores());
		}
		if (form.getUsuarioFinal() != null) {
			listaRolesSincronizar.put(RolesEnum.USUARIOFINAL.toString(),
					form.getUsuarioFinal());
		}

		if (!listaRolesSincronizar.isEmpty()) {
			try {
				respuesta = administracionService
						.crearPersonas(listaRolesSincronizar);
				model.put(Constantes.MENSAJE_INFO, messages.getMessage(
						"cargarjira.form.personas.info.correcto", null, null));
			} catch (Exception e) {
				model.put(Constantes.MENSAJE_ERROR,
						messages.getMessage("error.dao.servicios", null, null));
			} 
		}

	

		List<RolDTO> listaRoles = rolService.findAll();
		Long nProyectos = inventarioService.contarInventario();

		model.put("listaRoles", listaRoles);
		model.put("nProyectos", nProyectos);
		return template;
	}
}
