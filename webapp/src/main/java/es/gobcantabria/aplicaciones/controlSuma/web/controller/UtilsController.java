package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador para diferentes opciones de informacion adicional
 * 
 * @author Grupo de Arquitectura JEE - Gobierno de Cantabria
 */
@Controller
public class UtilsController {
	/**
	 * mostrar pagina de registro de versiones
	 * 
	 * @return
	 */
	@RequestMapping(value = "/auth/utils/changelog")
	public String changeLog() {
		return "changeLogPage";
	}

	/**
	 * mostrar pagina de registro de informacion
	 * 
	 * @return
	 */
	@RequestMapping(value = "/auth/utils/informacion")
	public String informacion() {
		return "informacionPage";
	}

}
