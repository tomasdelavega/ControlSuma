/**
 * 
 */
package es.gobcantabria.aplicaciones.controlSuma.business.helper;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioOtras;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioOtrasDTO;
import es.gobcantabria.aplicaciones.controlSuma.web.model.InventarioOtrasModel;



/**
 * @author malba
 *
 */
@Component
public class InventarioOtrasHelper extends GenericHelper {

	
	public InventarioOtras convertDTOToEntity(InventarioOtrasDTO dto) {
		
		InventarioOtras entity= new InventarioOtras();
		
		entity.setId(dto.getId());
		entity.setFechaAlta(dto.getFechaAlta());
		entity.setFechaUltMod(dto.getFechaUltMod());
		entity.setDocAnalisisFuncional(dto.getDocAnalisisFuncional());
		entity.setDocDisenoTecnico(dto.getDocDisenoTecnico());
		entity.setDocManualInstalacion(dto.getDocManualInstalacion());
		entity.setDocPlanPruebas(dto.getDocPlanPruebas());
		entity.setMantCorrectivoPrevisto(dto.getMantCorrectivoPrevisto());
		entity.setMantEvolutivoPrevisto(dto.getMantEvolutivoPrevisto());
		entity.setTrabajosVuelo(dto.getTrabajosVuelo());
		entity.setCorrectivo(dto.getCorrectivo());
		entity.setDocOtra(dto.getDocOtra());
		entity.setEvolutivo(dto.getEvolutivo());
		entity.setInventarioObjetos(dto.getInventarioObjetos());
		entity.setNivelCalidadCodigo(dto.getNivelCalidadCodigo());
		entity.setNivelIncidencias(dto.getNivelIncidencias());
		entity.setObservaciones(dto.getObservaciones());
		entity.setPeriodoUsoAplicacion(dto.getPeriodoUsoAplicacion());
		entity.setRutaDoc(dto.getRutaDoc());
		entity.setTipoTransicion(dto.getTipoTransicion());
		entity.setDescripciontrabajosVuelo(dto.getDescripciontrabajosVuelo());
		
		
		entity.setDetalleIncidencia(dto.getDetalleIncidencia());	   	
		entity.setIncidencia(dto.getIncidencia());       
		entity.setDetalleGarantia(dto.getDetalleGarantia());
		entity.setFechaUltActAnalisisFuncional(dto.getFechaUltActAnalisisFuncional());
		entity.setAnalisisFuncionalvaloracion(dto.getAnalisisFuncionalvaloracion());
		entity.setDetalleAnalisis(dto.getDetalleAnalisis());
		entity.setDetalleIntegracion(dto.getDetalleIntegracion());
		entity.setIntegracion(dto.getIntegracion());
		entity.setValoracionManualInstalacion(dto.getValoracionManualInstalacion());
		entity.setFechaUltActManualInstalacion(dto.getFechaUltActManualInstalacion());
		entity.setDetalleManualInstalacion(dto.getDetalleManualInstalacion());
		entity.setValoracionPlanPrueba(dto.getValoracionPlanPrueba());
		entity.setDetallePlanPrueba(dto.getDetallePlanPrueba());
		entity.setFechaUltActPlanPrueba(dto.getFechaUltActPlanPrueba());
		entity.setDetalleDiseno(dto.getDetalleDiseno());
		entity.setFechaUltActDiseno(dto.getFechaUltActDiseno());	
		entity.setValoracionDiseno(dto.getValoracionDiseno());
		entity.setGarantia(dto.getGarantia());
		entity.setRequiereSW(dto.getRequiereSW());
		entity.setDocuCodigo(dto.getDocuCodigo());

		
		//entity.setInventario(dto.getInventario());
		
		//entity.setInventario(dto.getInventario().getId());
		
		return entity;
		
		
	}
	
	
	public InventarioOtrasDTO convertEntityToDTO(InventarioOtras entity) {
		InventarioOtrasDTO dto= new InventarioOtrasDTO();
		
		dto.setId(entity.getId());
		dto.setFechaAlta(entity.getFechaAlta());
		dto.setFechaUltMod(entity.getFechaUltMod());
		dto.setDocAnalisisFuncional(entity.getDocAnalisisFuncional());
		dto.setDocDisenoTecnico(entity.getDocDisenoTecnico());
		dto.setDocManualInstalacion(entity.getDocManualInstalacion());
		dto.setDocPlanPruebas(entity.getDocPlanPruebas());
		dto.setMantCorrectivoPrevisto(entity.getMantCorrectivoPrevisto());
		dto.setMantEvolutivoPrevisto(entity.getMantEvolutivoPrevisto());
		dto.setTrabajosVuelo(entity.getTrabajosVuelo());
		dto.setCorrectivo(entity.getCorrectivo());
		dto.setDocOtra(entity.getDocOtra());
		dto.setEvolutivo(entity.getEvolutivo());
		dto.setInventarioObjetos(entity.getInventarioObjetos());
		dto.setNivelCalidadCodigo(entity.getNivelCalidadCodigo());
		dto.setNivelIncidencias(entity.getNivelIncidencias());
		dto.setObservaciones(entity.getObservaciones());
		dto.setPeriodoUsoAplicacion(entity.getPeriodoUsoAplicacion());
		dto.setRutaDoc(entity.getRutaDoc());
		dto.setTipoTransicion(entity.getTipoTransicion());
		dto.setDescripciontrabajosVuelo(entity.getDescripciontrabajosVuelo());
		
		
		dto.setDetalleIncidencia(entity.getDetalleIncidencia());	   	
		dto.setIncidencia(entity.getIncidencia());       
		dto.setDetalleGarantia(entity.getDetalleGarantia());
		dto.setFechaUltActAnalisisFuncional(entity.getFechaUltActAnalisisFuncional());
		dto.setAnalisisFuncionalvaloracion(entity.getAnalisisFuncionalvaloracion());
		dto.setDetalleAnalisis(entity.getDetalleAnalisis());
		dto.setDetalleIntegracion(entity.getDetalleIntegracion());
		dto.setIntegracion(entity.getIntegracion());
		dto.setValoracionManualInstalacion(entity.getValoracionManualInstalacion());
		dto.setFechaUltActManualInstalacion(entity.getFechaUltActManualInstalacion());
		dto.setDetalleManualInstalacion(entity.getDetalleManualInstalacion());
		dto.setValoracionPlanPrueba(entity.getValoracionPlanPrueba());
		dto.setDetallePlanPrueba(entity.getDetallePlanPrueba());
		dto.setFechaUltActPlanPrueba(entity.getFechaUltActPlanPrueba());
		dto.setDetalleDiseno(entity.getDetalleDiseno());
		dto.setFechaUltActDiseno(entity.getFechaUltActDiseno());	
		dto.setValoracionDiseno(entity.getValoracionDiseno());
		dto.setGarantia(entity.getGarantia());
		dto.setRequiereSW(entity.getRequiereSW());
		dto.setDocuCodigo(entity.getDocuCodigo());

		return dto;
	}

	public InventarioOtrasDTO convertModelToDTO(InventarioOtrasModel model) {
		InventarioOtrasDTO dto= new InventarioOtrasDTO();
		
		dto.setId(model.getId());
		dto.setFechaAlta(model.getFechaAlta());
		dto.setFechaUltMod(model.getFechaUltMod());
		dto.setDocAnalisisFuncional(model.getDocAnalisisFuncional());
		dto.setDocDisenoTecnico(model.getDocDisenoTecnico());
		dto.setDocManualInstalacion(model.getDocManualInstalacion());
		dto.setDocPlanPruebas(model.getDocPlanPruebas());
		dto.setMantCorrectivoPrevisto(model.getMantCorrectivoPrevisto());
		dto.setMantEvolutivoPrevisto(model.getMantEvolutivoPrevisto());
		dto.setTrabajosVuelo(model.getTrabajosVuelo());
		dto.setCorrectivo(model.getCorrectivo());
		dto.setDocOtra(model.getDocOtra());
		dto.setEvolutivo(model.getEvolutivo());
		dto.setInventarioObjetos(model.getInventarioObjetos());
		dto.setNivelCalidadCodigo(model.getNivelCalidadCodigo());
		dto.setNivelIncidencias(model.getNivelIncidencias());
		dto.setObservaciones(model.getObservaciones());
		dto.setPeriodoUsoAplicacion(model.getPeriodoUsoAplicacion());
		dto.setRutaDoc(model.getRutaDoc());
		dto.setTipoTransicion(model.getTipoTransicion());
		dto.setDescripciontrabajosVuelo(model.getDescripciontrabajosVuelo()); 
		dto.setDetalleIncidencia(model.getDetalleIncidencia());	   	
		dto.setIncidencia(model.getIncidencia());       
		dto.setDetalleGarantia(model.getDetalleGarantia());
		dto.setFechaUltActAnalisisFuncional(model.getFechaUltActAnalisisFuncional());
		dto.setAnalisisFuncionalvaloracion(model.getAnalisisFuncionalvaloracion());
		dto.setDetalleAnalisis(model.getDetalleAnalisis());
		dto.setDetalleIntegracion(model.getDetalleIntegracion());
		dto.setIntegracion(model.getIntegracion());
		dto.setValoracionManualInstalacion(model.getValoracionManualInstalacion());
		dto.setFechaUltActManualInstalacion(model.getFechaUltActManualInstalacion());
		dto.setDetalleManualInstalacion(model.getDetalleManualInstalacion());
		dto.setValoracionPlanPrueba(model.getValoracionPlanPrueba());
		dto.setDetallePlanPrueba(model.getDetallePlanPrueba());
		dto.setFechaUltActPlanPrueba(model.getFechaUltActPlanPrueba());
		dto.setDetalleDiseno(model.getDetalleDiseno());
		dto.setFechaUltActDiseno(model.getFechaUltActDiseno());	
		dto.setValoracionDiseno(model.getValoracionDiseno());
		dto.setGarantia(model.getGarantia());
		dto.setRequiereSW(model.getRequiereSW());
		dto.setDocuCodigo(model.getDocuCodigo());
		
		//dto.setInventario(model.getInventario());
		return dto;
	}


}
