package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.service.PersonaService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.RolService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;
import es.gobcantabria.aplicaciones.controlSuma.util.Constantes;
import es.gobcantabria.aplicaciones.controlSuma.web.Filter.PersonaFilter;
import es.gobcantabria.aplicaciones.controlSuma.web.model.PersonaModel;

/**
 * Controlador para las Personas
 * 
 * @author tdelavega
 * 
 */

@Controller
@RequestMapping(value = "/auth/persona")
public class PersonaController {
	@Autowired
	private MessageSource messages;
	@Autowired
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Autowired
	private PersonaService personaService;
	@Autowired
	private RolService rolService;

	/**
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/listPersona", method = RequestMethod.GET)
	public String list(
			@ModelAttribute("filtroPersona") @Valid PersonaFilter filtro,
			ModelMap model, HttpServletRequest request) {
		logger.debug("Entrando en el List de Persona");

		String template = Constantes.PERSONAS_LIST_TEMPLATE;
		/* Almacenamos valor de url */
		String queryString = request.getQueryString();
		filtro = (PersonaFilter) request.getSession().getAttribute(
				"filtroInventario");
		if (filtro == null) {
			filtro = new PersonaFilter();
		}
		model.put("filtroPersona", filtro);
		// Mensajes de error y alerta
		model.put(Constantes.MENSAJE_INFO,
				request.getParameter(Constantes.MENSAJE_INFO));
		model.put(Constantes.MENSAJE_ERROR,
				request.getParameter(Constantes.MENSAJE_ERROR));
		try {

			/* Iniciar session, para guardar listado total del inventario */
			HttpSession sesion = request.getSession(true);

			if (queryString == null) {
				List<PersonaDTO> listaPersonas = new ArrayList<PersonaDTO>();
				listaPersonas = personaService.findAll();
				/* Almacenamos el listado en session */
				sesion.setAttribute("listPersonas", listaPersonas);
			}

			/* Mostramos el listado sacandole de la sesion */
			model.put("listPersonas",
					(List<PersonaDTO>) sesion.getAttribute("listPersonas"));
			return template;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			request.setAttribute("error", ex.getMessage());
			return "genericErrorPage";
		}
	}

	/**
	 * 
	 * @param filtro
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(
			@ModelAttribute("filtroPersona") @Valid PersonaFilter filtro,
			ModelMap model, BindingResult result, HttpServletRequest request) {

		logger.debug("Persona search()");
		String template = Constantes.PERSONAS_LIST_TEMPLATE;

		if (result.hasErrors()) {
			List<PersonaDTO> listaPersonas = personaService.findAll();
			model.put("listPersonas", listaPersonas);
			return template;
		}

		/*
		 * Hay que llamar al metodo que recibe como parámetros los campos del
		 * filtro y devuelve una colección de objetos PersonaDTO que hay que
		 * convertirlos a personaModel.
		 */
		try {
			List<PersonaDTO> personas = personaService.buscar(filtro.convert());
			model.put("listPersonas", personas);

		} catch (Exception ex) {
			logger.error(ex.getMessage());
			request.setAttribute("error", ex.getMessage());
			return "genericErrorPage";
		}
		return template;
	}

	/**
	 * 
	 * @param idPersona
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String mostrarFormularioEditar(@RequestParam("id") Long idPersona,
			ModelMap model, HttpServletRequest request) {
		String template = Constantes.PERSONAS_FORM_TEMPLATE;

		PersonaModel modelo = null;

		PersonaDTO dto = personaService.getById(idPersona);

		if (dto != null) {
			modelo = new PersonaModel(dto);
		} else {
			modelo = new PersonaModel();
		}

		model.put("datosPersona", modelo);
		// Mensajes de error y alerta
		model.put(Constantes.MENSAJE_INFO,
				request.getParameter(Constantes.MENSAJE_INFO));
		model.put(Constantes.MENSAJE_ERROR,
				request.getParameter(Constantes.MENSAJE_ERROR));
		return template;
	}

	/**
	 * @param persona
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST, params = "update")
	public String updatePersona(
			@ModelAttribute("datosPersona") @Valid PersonaModel persona,
			BindingResult result, ModelMap model) {
		String template = Constantes.PERSONAS_FORM_TEMPLATE;
		if (result.hasErrors()) {
			model.put("datosPersona", persona);
			return template;
		} else {
			PersonaDTO dto = persona.convert();
			try {
				personaService.updatePersona(dto);
				model.put("mensajeInfo", Constantes.OPERACION_OK);
			} catch (ControlSumaException e) {
				model.put(Constantes.MENSAJE_ERROR, e.getMessage());
			}
			return template;
		}
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST, params = "volver")
	public String volver() {
		return "redirect:listPersona";
	}

	/*
	 * Método que devuelve una lista de RolesDTO, se emplea para cargar los
	 * select
	 */
	@ModelAttribute("listOfRoles")
	public List<RolDTO> listarRoles() {
		List<RolDTO> roles = new ArrayList<RolDTO>();
		roles.addAll(rolService.findAll());
		return roles;
	}

	/**
	 * Método borrar persona
	 * 
	 * @param idRol
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long idPersona, ModelMap model,RedirectAttributes attributes, HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);
		try {
			personaService.deletePersona(idPersona);
			List<PersonaDTO> listaPersonas = new ArrayList<PersonaDTO>();
			listaPersonas = (List<PersonaDTO>) sesion.getAttribute("listPersonas");
			for(PersonaDTO persona : listaPersonas){
				if(persona.getId() == idPersona){
					listaPersonas.remove(persona);
				}
			}
			sesion.setAttribute("listPersonas", listaPersonas);
			attributes.addAttribute("mensajeInfo","Elemento borrado satisfactoriamente.");
		} catch (Exception e) {
			attributes.addAttribute("mensajeError", "No se puede borrar el elemento.");
			e.printStackTrace();
		}
		return "redirect:listPersona";
	}
}
