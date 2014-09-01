package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.PersonaDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.helper.PersonaHelper;
import es.gobcantabria.aplicaciones.controlSuma.business.service.PersonaService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;




/**
 * @author tdevegaa
 *Servicio que implementa las funciones o métodos para la gestión de Personas
 */

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private MessageSource message;
	@Autowired
	private PersonaDAO personaDao;
	@Autowired
	private PersonaHelper helper;

	public List<PersonaDTO> findAll() {
		// TODO Auto-generated method stub
		List<Persona> listaPersonas = personaDao.executeQuery("Persona.findAll");
		return helper.convertEntityToDTO(listaPersonas);
	}

	public PersonaDTO getById(Long id) {
		// TODO Auto-generated method stub
		return helper.convertEntityToDTO(personaDao.find(id));
	}

	public void createPersona(PersonaDTO dto) throws ControlSumaException {
		Persona persona=helper.convertDTOToEntity(dto);
		persona = personaDao.create(persona);

	}

	public void updatePersona(PersonaDTO dto) throws ControlSumaException {
		// TODO Auto-generated method stub
		Persona  persona = null;
		persona = personaDao.update(helper.convertDTOToEntity(dto));
		
		
	}
	
	public List<PersonaDTO> findPersonaRol(Long id)
	{
		Object[] object = new Object[]{id};
		
		List<Persona> listPersonas =personaDao.executeQueryFindClaveAjena("Persona.findPersonaRol", object);
	    List<PersonaDTO> listPersonaDTO = helper.convertEntityToDTO(listPersonas);
		return listPersonaDTO;
	}

	@Override
	public List<PersonaDTO> buscar(PersonaFilterDTO filtro) throws ControlSumaException {
		// TODO Auto-generated method stub
		List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
		personas = helper.convertEntityToDTO(personaDao.buscar(filtro));
		return personas;
	}

	@Override
	public PersonaDTO comprobarOrSavePersona(PersonaDTO dto) {
		Persona persona=helper.convertDTOToEntity(dto);
		final Object[] item1 = { "codJira", dto.getCodJira() };
		final Object[] params = { item1 };

		List<Persona> personaResp= personaDao.executeQueryWithParam("Persona.findCodJira", params)  ;
		if (personaResp==null ||personaResp.isEmpty()){
			persona = personaDao.create(persona);
		}else{
			persona= personaResp.get(0);
		}
		
		return helper.convertEntityToDTO(persona);
	}

	@Override
	@Transactional
	public void deletePersona(Long id) {
		try{
			personaDao.delete(id);
		} catch(Exception e) {
			e.getMessage();
		}
		
	}
}
