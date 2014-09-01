package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.AreaFuncional;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.AreaFuncionalDTO;
import es.gobcantabria.aplicaciones.controlSuma.web.model.AreaFuncionalModel;

@Component
public class AreaFuncionalHelper extends GenericHelper{

	
	public List<AreaFuncionalDTO> convertEntityToDTO(List<AreaFuncional> ListEntity) {
		List<AreaFuncionalDTO> listaDto= new ArrayList<AreaFuncionalDTO>();
		
		for (AreaFuncional entity: ListEntity){
			listaDto.add(this.convertEntityToDTO(entity));
		}
		return listaDto;
		
	}
	
		
	public List<AreaFuncional> convertDTOtoEntity(List<AreaFuncionalDTO> ListaDto) {
		 List<AreaFuncional> listaEnt= new ArrayList<AreaFuncional>();
		 
			for (AreaFuncionalDTO dto: ListaDto){
			
				listaEnt.add(convertDTOtoEntity(dto));
				
			}
 
		return listaEnt;
	}

		
		
	public AreaFuncionalDTO convertEntityToDTO(AreaFuncional entity) {
		AreaFuncionalDTO dto= new AreaFuncionalDTO();
		
		if (entity!=null){
		
		dto.setId(entity.getId());
		dto.setFechaUltMod(entity.getFechaUltMod());
		dto.setNombre(entity.getNombre());;
		}
		return dto;
		
		
	}

	public AreaFuncional convertDTOtoEntity(AreaFuncionalDTO dto) {
		
		AreaFuncional entity= new AreaFuncional();
		
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());;
		
		return entity;
		
	}
	
	
	public AreaFuncionalDTO convertModeltoEntity(AreaFuncionalModel model) {
		
		AreaFuncionalDTO dto= new AreaFuncionalDTO();
		
		dto.setId(model.getId());
		dto.setNombre(model.getNombre());;
		
		return dto;
		
	}

	public AreaFuncionalDTO convertModelToDTO(AreaFuncionalModel model) {
		AreaFuncionalDTO dto= new AreaFuncionalDTO();
		
		if (model!=null){
		
		dto.setId(model.getId());
		dto.setFechaUltMod(model.getFechaUltMod());
		dto.setNombre(model.getNombre());;
		}
		return dto;
		
		
	}
	
}
