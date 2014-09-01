package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.EntornoDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.dao.InventarioDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Entorno;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.EntornoDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.AreaFuncionalHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.EntornoHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.EntornoService;
@Service
@Transactional
public class EntornoServiceImpl implements EntornoService{

	
	@Autowired
	private MessageSource message;
	@Autowired
	private EntornoHelper helper;
	@Autowired
	private EntornoDAO entornoDAO;
	
	public List<EntornoDTO> entornoIdAplicacion(Long id) {
		
		Object[] object = new Object[] {id};

		
		List<Entorno> inv=entornoDAO.executeQueryFindClaveAjena("Entorno.findEntornoAplicacion", object);
		return helper.convertEntityToDTO(inv);
		
	}

	@Override
	public void actualizarEntorno(EntornoDTO entorno) {
		// TODO Auto-generated method stub
		Entorno entornoEntity = helper.convertDTOtoEntity(entorno);
		entornoEntity = entornoDAO.update(entornoEntity);
		
	
	}
	
}
