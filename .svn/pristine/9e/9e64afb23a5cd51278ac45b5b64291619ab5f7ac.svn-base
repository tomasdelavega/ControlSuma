package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Tecnologia;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;

@Component
public class TecnologiaHelper extends GenericHelper {

	public List<TecnologiaDTO> convertEntityToDTO(List<Tecnologia> listaEnt) {
		List<TecnologiaDTO> listaTecnologiaDto= new ArrayList<TecnologiaDTO>();
		
		for (Tecnologia entity: listaEnt){
			listaTecnologiaDto.add(this.convertEntityToDTO(entity));
		}
		return listaTecnologiaDto;
	}

	public List<Tecnologia> convertDTOToEntity(List<TecnologiaDTO> listaDTO) {
		
		 List<Tecnologia> listaTecnologia= new ArrayList<Tecnologia>();
		 
			for (TecnologiaDTO dto: listaDTO){
			
				listaTecnologia.add(convertDTOToEntity(dto));
				
			}
 
		return listaTecnologia;
	}

	public TecnologiaDTO convertEntityToDTO(Tecnologia entity) {
		TecnologiaDTO tecnologiaDTO= new TecnologiaDTO();
		
		tecnologiaDTO.setId(entity.getId());
		tecnologiaDTO.setDescripcion(entity.getDescripcion());
		tecnologiaDTO.setFechaAlta(entity.getFechaAlta());
		tecnologiaDTO.setCodTecnologia(entity.getCodTecnologia());
		tecnologiaDTO.setFechaUltMod(entity.getFechaUltMod());
		tecnologiaDTO.setFramework(entity.getFramework());
		
		return tecnologiaDTO;
	}

	public Tecnologia convertDTOToEntity(TecnologiaDTO dto) {
		Tecnologia tecnologia= new Tecnologia();
		
		if(dto.getId() != null){
			tecnologia.setId(dto.getId());
		}
		tecnologia.setDescripcion(dto.getDescripcion());
		tecnologia.setFechaAlta(dto.getFechaAlta());
		tecnologia.setCodTecnologia(dto.getCodTecnologia());
		tecnologia.setFramework(dto.getFramework());
		
		return tecnologia;
	}
	
}
