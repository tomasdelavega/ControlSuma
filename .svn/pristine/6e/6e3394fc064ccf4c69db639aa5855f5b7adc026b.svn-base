package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.service.TecnologiaService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;
import es.gobcantabria.aplicaciones.controlSuma.util.Constantes;
import es.gobcantabria.aplicaciones.controlSuma.web.Filter.TecnologiaFilter;
import es.gobcantabria.aplicaciones.controlSuma.web.model.TecnologiaModel;

/**
 * @author tdevegaa
 * 
 */
@Controller
@RequestMapping(value = "/auth/tecnologia")
public class TecnologiaController {
	@Autowired
	private MessageSource messages;
	@Autowired
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Autowired
	private TecnologiaService tecnologiaService;

	/**
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/listTecnologia", method = RequestMethod.GET)
	public String mostrarListadoDeTecnologiasCompleto(ModelMap model,
			HttpServletRequest request) {
		logger.debug("Entrando en el List de Tecnologías");

		String template = Constantes.TECNOLOGIAS_LIST_TEMPLATE;

		//TecnologiaFilter filtro = (TecnologiaFilter) request.getSession().getAttribute("filtroTecnologia");
		//if (filtro == null) {
			//filtro = new TecnologiaFilter();
		//}
		//model.put("filtroTecnologia", filtro);
		
		// Mensajes de error y alerta
		model.put(Constantes.MENSAJE_INFO,
				request.getParameter(Constantes.MENSAJE_INFO));
		model.put(Constantes.MENSAJE_ERROR,
				request.getParameter(Constantes.MENSAJE_ERROR));
		try {
			List<TecnologiaDTO> listaTecnologias = tecnologiaService.findAll();
			model.put("listTecnologias", listaTecnologias);
			return template;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			request.setAttribute("error", ex.getMessage());
			return "genericErrorPage";
		}
	}

	/**
	 * 
	 * @param idTecnologia
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(@RequestParam("id") Long idTecnologia, ModelMap model,
			HttpServletRequest request) {
		String template = Constantes.TECNOLOGIAS_FORM_TEMPLATE;
		TecnologiaModel modelo = null;
		TecnologiaDTO dto = tecnologiaService.getById(idTecnologia);
		if (dto != null) {
			modelo = new TecnologiaModel(dto);
		} else {
			modelo = new TecnologiaModel();
		}
		model.put("datosTecnologia", modelo);
		return template;
	}

	/**
	 * 
	 * @param tecnologia
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(
			@ModelAttribute("datosTecnologia") @Valid TecnologiaModel tecnologia,
			BindingResult result, ModelMap model) {

		String template = Constantes.TECNOLOGIAS_FORM_TEMPLATE;
		/* Se comprueba si hay errores */
		if (result.hasErrors()) {
			model.put("datosTecnologia", tecnologia);
			return template;
		}
		/* Guardar datos */
		TecnologiaDTO dto = tecnologia.convert();
		try {
			tecnologiaService.updateTecnologia(dto);
			model.put("mensajeInfo", Constantes.OPERACION_OK);
		} catch (ControlSumaException e) {
			model.put(Constantes.MENSAJE_ERROR, e.getMessage());
		}
		return template;
	}

	/**
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/return", method = RequestMethod.GET)
	public String volver(ModelMap model, HttpServletRequest request) {
		return "redirect:listTecnologia";
	}

	/**
	 * 
	 * @param idTecnologia
	 * @param model
	 * @return
	 * @throws ControlSumaException
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long idTecnologia, ModelMap model, RedirectAttributes attributes) {
		try {
			tecnologiaService.deleteTecnologia(idTecnologia);
			attributes.addAttribute("mensajeInfo","Elemento borrado satisfactoriamente.");
		} catch (Exception e) {
			//template = Constantes.TECNOLOGIAS_LIST_TEMPLATE;
			//model.put(Constantes.MENSAJE_ERROR, e.getMessage());
			attributes.addAttribute("mensajeError", "No se puede borrar el elemento.");
			e.printStackTrace();
		} 
		return "redirect:listTecnologia";
	}

	/**
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap model, HttpServletRequest request) {
		String template = Constantes.TECNOLOGIAS_ADD_TEMPLATE;
		TecnologiaModel tecnologia = null;
		tecnologia = new TecnologiaModel();
		model.put("tecnologia", tecnologia);
		return template;
	}

	/**
	 * 
	 * @param tecnologia
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(
			@ModelAttribute("tecnologia") @Valid TecnologiaModel tecnologia,
			BindingResult result, ModelMap model) {
		String template = Constantes.TECNOLOGIAS_ADD_TEMPLATE;

		/* Se comprueba si hay errores */
		if (result.hasErrors()) {
			model.put("tecnologia", tecnologia);
			return template;
		}
		/* Guardar datos */
		TecnologiaDTO dto = tecnologia.convert();
		try {
			tecnologiaService.createTecnologia(dto);
			model.put("mensajeInfo", Constantes.OPERACION_OK);
		} catch (ControlSumaException e) {
			model.put(Constantes.MENSAJE_ERROR, e.getMessage());
		}

		return template;
	}
}
