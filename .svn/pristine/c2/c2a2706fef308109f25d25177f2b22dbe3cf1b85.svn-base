package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioPersona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioPersonaDTO;

@Component
public class InventarioPersonaHelper extends GenericHelper {

	public List<InventarioPersonaDTO> convertEntityToDTO(List<InventarioPersona> ListEntity) {
		List<InventarioPersonaDTO> listaDto= new ArrayList<InventarioPersonaDTO>();
		
		for (InventarioPersona entity: ListEntity){
			listaDto.add(this.convertEntityToDTO(entity));
		}
		return listaDto;
		
	}
	
		
		public List<InventarioPersona> convertDTOtoEntity(List<InventarioPersonaDTO> ListaDto) {
			 List<InventarioPersona> listaEnt= new ArrayList<InventarioPersona>();
			 
				for (InventarioPersonaDTO dto: ListaDto){
				
					listaEnt.add(convertDTOtoEntity(dto));
					
				}
	 
			return listaEnt;
		}

		
		
	public InventarioPersonaDTO convertEntityToDTO(InventarioPersona entity) {
		InventarioPersonaDTO dto= new InventarioPersonaDTO();
		
		if (entity!=null){
		dto.setFechaAlta(entity.getFechaAlta());
		dto.setId(entity.getId());
		dto.setInventario(entity.getInventario());
		dto.setPersona(entity.getPersona());

		}
		return dto;
		
		
	}

	public InventarioPersona convertDTOtoEntity(InventarioPersonaDTO dto) {
		
		InventarioPersona entity= new InventarioPersona();
		
		entity.setFechaAlta(dto.getFechaAlta());
		entity.setId(dto.getId());
		entity.setInventario(dto.getInventario());
		entity.setPersona(dto.getPersona());
		
		return entity;
	}
	
	
}
