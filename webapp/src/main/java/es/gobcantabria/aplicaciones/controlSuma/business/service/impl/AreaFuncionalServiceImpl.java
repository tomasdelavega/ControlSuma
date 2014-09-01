package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.AreaFuncionalDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.AreaFuncional;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.AreaFuncionalDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.AreaFuncionalHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.AreaFuncionalService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;

@Service
@Transactional
public class AreaFuncionalServiceImpl implements AreaFuncionalService {

	
	
	@Autowired
	private MessageSource message;
	
	@Autowired
	private AreaFuncionalDAO areaFuncionalDAO;
	
	@Autowired
	private AreaFuncionalHelper helper;

	public List<AreaFuncionalDTO> findAll() {
	
		List<AreaFuncional> lista= areaFuncionalDAO.executeQuery("AreaFuncional.findAll");
		
		return helper.convertEntityToDTO(lista);
	}

	public AreaFuncionalDTO getById(Long id) {
		// TODO Auto-generated method stub
		AreaFuncionalDTO area = helper.convertEntityToDTO(areaFuncionalDAO.find(id));
		return area;
	}

	public void create(AreaFuncionalDTO dto) throws ControlSumaException {
		// TODO Auto-generated method stub
		AreaFuncional area = null;
		area = areaFuncionalDAO.create(helper.convertDTOtoEntity(dto));
		if(area == null){
			throw new ControlSumaException(message.getMessage("error.areaFuncional.form.create", null, null));
		}
	}

	public void update(AreaFuncionalDTO dto) throws ControlSumaException {
		// TODO Auto-generated method stub
		AreaFuncional area = null;
		area = areaFuncionalDAO.update(helper.convertDTOtoEntity(dto));
		if(area == null){
			throw new ControlSumaException(message.getMessage("error.areaFuncional.form.create", null, null));

		}

	}
	
	/*
	 * (non-Javadoc)
	 * @see es.gobcantabria.aplicaciones.controlSuma.business.service.PersonaService#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public void delete(Long id) {
		try{
			areaFuncionalDAO.delete(id);
			   System.out.println("******Borrado*****");
		}catch(Exception e){
			e.getMessage();
		}
		

	
	}
	
}
