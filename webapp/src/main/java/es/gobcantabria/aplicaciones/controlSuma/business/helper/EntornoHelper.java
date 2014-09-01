package es.gobcantabria.aplicaciones.controlSuma.business.helper;

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.AreaFuncional;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Entorno;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.AreaFuncionalDTO;


import es.gobcantabria.aplicaciones.controlSuma.business.dto.EntornoDTO;
import es.gobcantabria.aplicaciones.controlSuma.web.model.EntornoModel;

@Component

public class EntornoHelper extends GenericHelper{

	@Autowired
	private InventarioHelper inventarioHelper;
	
	public List<EntornoDTO> convertEntityToDTO(List<Entorno> ListEntity) {
		List<EntornoDTO> listaDto= new ArrayList<EntornoDTO>();
		
		for (Entorno entity: ListEntity){
			listaDto.add(this.convertEntityToDTO(entity));
		}
		return listaDto;
		
	}
	
		
		public List<Entorno> convertDTOtoEntity(List<EntornoDTO> ListaDto) {
			 List<Entorno> listaEnt= new ArrayList<Entorno>();
			 
				for (EntornoDTO dto: ListaDto){
				
					listaEnt.add(convertDTOtoEntity(dto));
					
				}
	 
			return listaEnt;
		}

		
		
	public EntornoDTO convertEntityToDTO(Entorno entity) {
		EntornoDTO dto= new EntornoDTO();
		
		if (entity!=null){
		dto.setConfLdap(entity.getConfLdap());
		dto.setDatosBbdd(entity.getDatosBbdd());
		dto.setFechaAlta(entity.getFechaAlta());
		dto.setFechaUltMod(entity.getFechaultMod());
		dto.setFrameworks(entity.getFrameworks());
		dto.setHerramientaConstruccion(entity.getHerramientaConstruccion());
		dto.setId(entity.getId());
		//dto.setInventario(entity.getInventario());
		dto.setObservaciones(entity.getObservaciones());
		dto.setRutaLog(entity.getRutaLog());
		dto.setRutaSvn(entity.getRutaSvn());
		dto.setServidorDespliegue(entity.getServidorDespliegue());
		dto.settEntorno(entity.gettEntorno());
		dto.setUrl(entity.getUrl());
		dto.setVersionJava(entity.getVersionJava());

		}
		return dto;
		
		
	}

	public Entorno convertDTOtoEntity(EntornoDTO dto) {
		
		Entorno entity= new Entorno();
		
		entity.setConfLdap(dto.getConfLdap());
		entity.setDatosBbdd(dto.getDatosBbdd());
		entity.setFechaAlta((Date) dto.getFechaAlta());
		entity.setFechaultMod(dto.getFechaUltMod());
		entity.setFrameworks(dto.getFrameworks());
		entity.setHerramientaConstruccion(dto.getHerramientaConstruccion());
		entity.setId(dto.getId());
		
		if(dto.getInventario().getId() != 0){
		entity.setInventario(inventarioHelper.convertDTOToEntity(dto.getInventario()));
		}
		
		//entity.setInventario(dto.getInventario());
		entity.setObservaciones(dto.getObservaciones());
		entity.setRutaLog(dto.getRutaLog());
		entity.setRutaSvn(dto.getRutaSvn());
		entity.setServidorDespliegue(dto.getServidorDespliegue());
		entity.settEntorno(dto.gettEntorno());
		entity.setUrl(dto.getUrl());
		entity.setVersionJava(dto.getVersionJava());
		
		return entity;
	}
	
	
public EntornoModel convertDTOtoModel(EntornoDTO dto) {
		
	EntornoModel model= new EntornoModel();
		
		model.setConfLdap(dto.getConfLdap());
		model.setDatosBbdd(dto.getDatosBbdd());
		model.setFechaAlta((Date) dto.getFechaAlta());
		model.setFechaUltMod(dto.getFechaUltMod());
		model.setFrameworks(dto.getFrameworks());
		model.setHerramientaConstruccion(dto.getHerramientaConstruccion());
		model.setId(dto.getId());
		//model.setInventario(dto.getInventario());
		model.setObservaciones(dto.getObservaciones());
		model.setRutaLog(dto.getRutaLog());
		model.setRutaSvn(dto.getRutaSvn());
		model.setServidorDespliegue(dto.getServidorDespliegue());
		model.settEntorno(dto.gettEntorno());
		model.setUrl(dto.getUrl());
		model.setVersionJava(dto.getVersionJava());
		
		return model;
	}


public EntornoDTO convertModelToDTO(EntornoModel model) {
	EntornoDTO dto= new EntornoDTO();
	
	if (model!=null){
	dto.setConfLdap(model.getConfLdap());
	dto.setDatosBbdd(model.getDatosBbdd());
	dto.setFechaAlta(model.getFechaAlta());
	dto.setFechaUltMod(model.getFechaUltMod());
	dto.setFrameworks(model.getFrameworks());
	dto.setHerramientaConstruccion(model.getHerramientaConstruccion());
	dto.setId(model.getId());
	//dto.setInventario(model.getInventario());
	dto.setObservaciones(model.getObservaciones());
	dto.setRutaLog(model.getRutaLog());
	dto.setRutaSvn(model.getRutaSvn());
	dto.setServidorDespliegue(model.getServidorDespliegue());
	dto.settEntorno(model.gettEntorno());
	dto.setUrl(model.getUrl());
	dto.setVersionJava(model.getVersionJava());

	}
	return dto;
	
	
}
	
}
