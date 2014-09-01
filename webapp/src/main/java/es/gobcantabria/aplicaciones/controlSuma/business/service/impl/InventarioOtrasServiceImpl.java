package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.EntornoDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.dao.InventarioOtrasDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Entorno;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioOtras;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioOtrasDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.EntornoHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.InventarioOtrasHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.InventarioOtrasService;

@Service
@Transactional
public class InventarioOtrasServiceImpl implements InventarioOtrasService{
	
	@Autowired
	private InventarioOtrasHelper helper;
	@Autowired
	private InventarioOtrasDAO inventarioOtrasDAO;
	
	@Override
	public List<InventarioOtrasDTO> otrasIdAplicacion(Long id) {
		// TODO Auto-generated method stub
		Object[] object = new Object[] {id};
		inventarioOtrasDAO.executeQueryFindClaveAjena("InventariosOtras.findOtrasAplicacion", object);
		return null;
	}

	@Override
	public void actualizarInformacionAdicional(InventarioOtrasDTO otrasDTO) {

		InventarioOtras otrasEntity = helper.convertDTOToEntity(otrasDTO);
		otrasEntity = inventarioOtrasDAO.update(otrasEntity);
		

	}

	@Override
	public InventarioOtrasDTO getByInventario(Long idInventario) {

		return null;
		
	}

}
