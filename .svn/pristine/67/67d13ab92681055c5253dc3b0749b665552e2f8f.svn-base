package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador para la pagina de inicio
 * 
 * @author Grupo de Arquitectura JEE - Gobierno de Cantabria
 * 
 */
@Controller
public class HomeController {

	@Autowired
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Redirige el home de la apliacion
	 * 
	 * @return
	 */
	@RequestMapping(value = "/auth/home")
	public String home() {
		LOGGER.debug("Entrando en la app");
		return "homePage";
	}

}
