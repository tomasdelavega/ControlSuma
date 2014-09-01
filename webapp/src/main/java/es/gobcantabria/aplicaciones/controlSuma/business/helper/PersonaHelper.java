package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.AreaFuncional;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.AreaFuncionalDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.EntornoDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioOtrasDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;

@Component
public class PersonaHelper extends GenericHelper {
	
	@Autowired
	private RolHelper rolHelper;

	public List<PersonaDTO> convertEntityToDTO(List<Persona> listaEnt) {
		List<PersonaDTO> listaPersonaDto= new ArrayList<PersonaDTO>();
		
		for (Persona entity: listaEnt){
			listaPersonaDto.add(this.convertEntityToDTO(entity));
		}
		return listaPersonaDto;
	}

	public List<Persona> convertDTOToEntity(List<PersonaDTO> listaDTO) {
		
		 List<Persona> listaPersona= new ArrayList<Persona>();
		 
			for (PersonaDTO dto: listaDTO){
			
				listaPersona.add(convertDTOToEntity(dto));
				
			}
 
		return listaPersona;
	}

	
	public PersonaDTO convertEntityToDTO(Persona entity) {
		PersonaDTO personaDto= new PersonaDTO();
		
		personaDto.setId(entity.getId());
		personaDto.setCodPersona(entity.getCodPersona());
		personaDto.setFechaAlta(entity.getFechaAlta());
		personaDto.setFechaBaja(entity.getFechaBaja());
		personaDto.setFechaUltMod(entity.getFechaUltMod());
		personaDto.setNombre(entity.getNombre());
		personaDto.setPrimerApellido(entity.getPrimerApellido());
		personaDto.setSegundoApellido(entity.getSegundoApellido());
		personaDto.setCodPersona(entity.getCodPersona());
		personaDto.setCodJira(entity.getCodJira());
		personaDto.setEmail(entity.getEmail());
		personaDto.setTelefonoContacto(entity.getTelefonoContacto());
		
		if(entity.getRol()!=null){
		personaDto.setRol(rolHelper.convertEntityToDTO(entity.getRol()));
		}
		return personaDto;
	}

	public Persona convertDTOToEntity(PersonaDTO dto) {
		Persona persona= new Persona();
		
		persona.setId(dto.getId());
		persona.setCodPersona(dto.getCodPersona());
		persona.setNombre(dto.getNombre());
		persona.setPrimerApellido(dto.getPrimerApellido());
		persona.setSegundoApellido(dto.getSegundoApellido());
		persona.setCodPersona(dto.getCodPersona());
		persona.setCodJira(dto.getCodJira());
		persona.setEmail(dto.getEmail());
		persona.setTelefonoContacto(dto.getTelefonoContacto());
		if(dto.getRol()!=null){
		persona.setRol(rolHelper.convertDTOToEntity(dto.getRol()));
		}
		return persona;
	}


	
}
