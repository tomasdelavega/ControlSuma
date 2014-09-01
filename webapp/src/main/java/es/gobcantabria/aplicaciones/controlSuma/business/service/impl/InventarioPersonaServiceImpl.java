package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.EntornoDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.dao.InventarioPersonaDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioPersona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioPersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.EntornoHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.InventarioPersonaHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.InventarioPersonaService;
import es.gobcantabria.aplicaciones.controlSuma.business.service.PersonaService;
@Service
@Transactional
public class InventarioPersonaServiceImpl implements InventarioPersonaService {
	@Autowired
	private InventarioPersonaDAO inventarioPersonaDAO;
	@Autowired
	private InventarioPersonaHelper helper;
	@Override
	public List<InventarioPersonaDTO> personaIdAplicacion(Long id) {
		
		Object[] object = new Object[] {id};
	    List<InventarioPersona> listInventarioPersona =	inventarioPersonaDAO.executeQueryFindClaveAjena("InventarioPersona.findPersonaAplicacion", object);
		List<InventarioPersonaDTO> listInventarioDTO =helper.convertEntityToDTO(listInventarioPersona);
	    return listInventarioDTO;
	}

}
