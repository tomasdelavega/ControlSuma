package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import org.springframework.stereotype.Component;

import com.atlassian.jira.rpc.soap.client.RemoteProject;
import com.atlassian.jira.rpc.soap.client.RemoteProjectRole;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Rol;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioWithJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolesWithJiraDTO;

@Component
public class AdministracionHelper extends GenericHelper {

	public InventarioWithJiraDTO cargarInventarioWithJiraDTO(Inventario inv,
			String sincronizado) {

		InventarioWithJiraDTO dto = new InventarioWithJiraDTO();
		dto.setFechaAlta(inv.getFechaAlta());
		dto.setFechaUltMod(inv.getFechaUltMod());
		dto.setCodInventario(inv.getCodInventario());
		dto.setCodJira(inv.getCodJira());
		dto.setDescripcion(inv.getDescripcion());
		dto.setNombreInventario(inv.getNombreInventario());
		dto.setVersion(inv.getVersion());
		dto.setObservaciones(inv.getObservaciones());

		dto.setSincronizado(sincronizado);

		return dto;

	}

	public InventarioWithJiraDTO cargarInventarioWithJiraDTO(
			RemoteProject pJira, String sincronizado) {
		InventarioWithJiraDTO dto = new InventarioWithJiraDTO();
		dto.setCodJira(pJira.getKey());
		dto.setNombreInventario(pJira.getName());
		dto.setDescripcion(pJira.getDescription());
		dto.setSincronizado(sincronizado);
		return dto;
	}

	public RolesWithJiraDTO cargarRolWithJiraDTO(Rol rol, String sincronizado) {

		RolesWithJiraDTO dto = new RolesWithJiraDTO();
		dto.setId(rol.getId());
		dto.setNombre(rol.getNombre());
		dto.setDescripcion(rol.getDescripcion());
		dto.setFechaAlta(rol.getFechaAlta());
		dto.setFechaUltMod(rol.getFechaUltMod());
		dto.setSincronizado(sincronizado);

		return dto;

	}

	public RolesWithJiraDTO cargarRolWithJiraDTO(RemoteProjectRole rJira,
			String sincronizado) {
		RolesWithJiraDTO dto = new RolesWithJiraDTO();
		
		dto.setNombre(rJira.getName());
		dto.setDescripcion(rJira.getDescription());
		dto.setSincronizado(sincronizado);

		return dto;

	}



}
