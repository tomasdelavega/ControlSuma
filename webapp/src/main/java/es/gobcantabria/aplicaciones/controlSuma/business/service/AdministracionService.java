package es.gobcantabria.aplicaciones.controlSuma.business.service;

import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioWithJiraDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RespuestaSincronizadoJiraDTO;

/**
 * Interface del servicio de Administración
 * @author malba
 *
 */
public interface AdministracionService {

	/**
	 * Método que comprueba la sincronización de los proyectos con JIRA
	 * @return
	 */
	public RespuestaSincronizadoJiraDTO ComprobarSincronizacionWithJira();

	public RespuestaSincronizadoJiraDTO ComprobarCrearEnInventario();

	/**
	 * Método que comprueba la sincronización de los roles con JIRA
	 * @return
	 */
	public RespuestaSincronizadoJiraDTO ComprobarSincronizacionWithJiraRoles();

	public RespuestaSincronizadoJiraDTO ComprobarCrearRoles(List<String> listaSincronizar);

	
	
	public RespuestaSincronizadoJiraDTO crearPersonas(
			Map<String,Long> listaRolesSincronizar) throws Exception;

}
