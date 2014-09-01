package es.gobcantabria.aplicaciones.controlSuma.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.util.Constantes;
import es.gobcantabria.aplicaciones.controlSuma.web.Filter.RolesFilter;

@Controller
@RequestMapping(value = "/auth/roles")
public class RolesController {
	@Autowired
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String mostrarRolesCompleto(ModelMap model,
			HttpServletRequest request) {
		logger.debug("Entrando en el List de Roles");

		String template = Constantes.ROLES_LIST_TEMPLATE;

		try {

			RolesFilter filtro = (RolesFilter) request.getSession()
					.getAttribute("filtroRoles");
			if (filtro == null) {
				filtro = new RolesFilter();
			}
			model.put("filtroRoles", filtro);

			Date fechaAlta = new Date();
			Date fechaUltMod = new Date();
			RolDTO rol = new RolDTO();
			rol.setNombre("roles");
			rol.setFechaAlta(fechaAlta);
			rol.setFechaUltMod(fechaUltMod);

			List<RolDTO> listaRol = new ArrayList<RolDTO>();

			for (int i = 0; i < 10; i++) {
				listaRol.add(rol);
			}
			model.put("listRol", listaRol);

			return template;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			request.setAttribute("error", ex.getMessage());
			return "genericErrorPage";
		}

	}

}
