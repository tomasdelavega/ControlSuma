package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.RolDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Rol;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.RolHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.RolService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;

@Service
@Transactional
public class RolServiceImpl implements RolService {

	@Autowired
	private MessageSource message;
	@Autowired
	private RolDAO rolDao;
	@Autowired
	private RolHelper helper;

	public List<RolDTO> findAll() {
		// TODO Auto-generated method stub
		List<Rol> listaRoles = rolDao.executeQuery("Rol.findAll");
		return helper.convertEntityToDTO(listaRoles);
	}

	public RolDTO getById(Long id) {
		// TODO Auto-generated method stub
		Rol rol = rolDao.find(id);
		return helper.convertEntityToDTO(rol);
	}

	public void createRol(RolDTO dto) throws ControlSumaException {
		// TODO Auto-generated method stub
		Rol rol = null;
		rol = rolDao.create(helper.convertDTOToEntity(dto));
		if (rol == null) {
			throw new ControlSumaException(message.getMessage(
					"error.rol.form.create", null, null));
		}
	}

	public void updateRol(RolDTO dto) throws ControlSumaException {
		// TODO Auto-generated method stub
		Rol rol = null;
		rol = rolDao.update(helper.convertDTOToEntity(dto));
		if (rol == null) {
			throw new ControlSumaException(message.getMessage(
					"error.rol.form.update", null, null));
		}
	}

	@Override
	public RolDTO getByNombre(String nombre) {

		return null;

	}

	@Override
	public RolDTO getByCodJira(Long codJira) {

		final Object[] item1 = { "codJira", codJira };
		final Object[] params = { item1 };
		List<Rol> roles = rolDao.executeQueryWithParam("Rol.findbyCodJira",
				params);

		return helper.convertEntityToDTO(roles.get(0));
	}

	@Override
	@Transactional
	public void deleteRol(Long id) {
		try{
			rolDao.delete(id);
		}catch(Exception e){
			e.getMessage();
		}
		
		
	}
	
}
