package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.service.ReportService;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;
import es.gobcantabria.aplicaciones.controlSuma.web.Enum.LogicosEnum;

/**
 * @author tdevegaa
 *
 */

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private MessageSource message;

	@Override
	public byte[] generarReport(InventarioDTO data) throws ControlSumaException {
		byte[] pdf;
		String fileName = "plantilla.jrxml";
		Map<String,Object> paramMap = cargarDatos(data);
		//Llamada a funcion que devuelve el pdf
		pdf = generarPDF( fileName, paramMap);
		if(pdf == null){
			throw new ControlSumaException(message.getMessage("report.error.pdf.create", null, null));
		}
		return pdf;
	}

	private byte[] generarPDF(String fileName, Map<String,Object> parameterMap){
		try{

			ClassPathResource cpr = new ClassPathResource(fileName);
			String filename=cpr.getFile().getAbsolutePath();
			JasperDesign jasperDesign = JRXmlLoader.load(filename);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			byte[] pdf = JasperRunManager.runReportToPdf(jasperReport, parameterMap,new JREmptyDataSource());
			return pdf;

		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;	
		}
	}

	private Map<String, Object> cargarDatos(InventarioDTO data){
		
		//Mapa utilizado para almacenar los valores del parámetro data que serán los enviados al report
		Map<String,Object> paramMap = new HashMap<String,Object>();
		//Fecha actual. SimpleDateFormat convierte un tipo date al formato string que se pase
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = sdf.format(new Date());
		paramMap.put("fecha", fecha);
		//Comprobar si el Área Funcional es null en caso de serlo se introduce ""
		if(data.getAreaFuncional() == null){
			paramMap.put("areaFuncional", null);
		}else {
			paramMap.put("areaFuncional", data.getAreaFuncional().getNombre());
		}
		paramMap.put("identificador", data.getCodInventario());
		paramMap.put("descripcion", data.getDescripcion());
		//Comprobar si los Responsables son nulos
		if(data.getResponsableGob() == null){
			paramMap.put("gobcan", null);
		}else {
			String gobcan = data.getResponsableGob().getNombre() + " " + data.getResponsableGob().getPrimerApellido() + " " + data.getResponsableGob().getSegundoApellido();
			paramMap.put("gobcan", gobcan);
		}
		if(data.getResponsableSUMA() == null){
			paramMap.put("suma", null);
		}else {
			String suma = data.getResponsableSUMA().getNombre() + " " + data.getResponsableSUMA().getSegundoApellido() + " " + data.getResponsableSUMA().getSegundoApellido();
			paramMap.put("suma", suma);
		}
		/********************************************************************************************************************/
		paramMap.put("descripcionAplicacion", data.getDescripcion());
		//Se comprueba que la tecnología no sea nula
		if(data.getTecnologia() == null){
			paramMap.put("tecnologia", null);
		}else {
			paramMap.put("tecnologia", data.getTecnologia().getCodTecnologia());
		}
		//Se comprueba que inventario otras no sea nulo en caso de ser nulo todos los datos deben estar en blanco.
		if(data.getInventarioOtra() == null){
			//Todos los parámetros en blanco de inventarioOtra
			paramMap.put("transicion", null);
			paramMap.put("incidencias", null);
			paramMap.put("incidenciasDetalle", null);
			paramMap.put("mantenimientoCorrectivo", null);
			paramMap.put("mantenimientoCorrectivoDetalle", null);
			paramMap.put("mantenimientoEvolutivo", null);
			paramMap.put("mantenimientoEvolutivoDetalle", null);
			paramMap.put("nivelIncidencias", null);
			paramMap.put("nivelIntegracion", null);
			paramMap.put("nivelIntegracionDetalle", null);
			paramMap.put("softwareAdicional", null);
			paramMap.put("softwareAdicional", null);
			paramMap.put("garantia", null);
			paramMap.put("garantiaDetalle", null);
			//Parámetros de la segunda página de la plantilla
			paramMap.put("analisisFuncional", null);
			paramMap.put("analisisFuncionalValoracion", null);
			paramMap.put("analisisFuncionalFecha", null);
			paramMap.put("analisisFuncionalObservaciones", null);
			paramMap.put("diseñoTecnico", null);
			paramMap.put("diseñoTecnicoValoracion", null);
			paramMap.put("diseñoTecnicoFecha", null);
			paramMap.put("diseñoTecnicoObservaciones", null);
			paramMap.put("planPruebas", null);
			paramMap.put("planPruebasValoracion", null);
			paramMap.put("planPruebasFecha", null);
			paramMap.put("planPruebasObservaciones", null);
			paramMap.put("manualInstalacion", null);
			paramMap.put("manualInstalacionValoracion", null);
			paramMap.put("manualInstalacionFecha", null);
			paramMap.put("manualInstalacionObservaciones", null);
			paramMap.put("codigoFuente", null);
			paramMap.put("procesoConstruccionDetalle", null);
			paramMap.put("documentacionDetalle", null);
			paramMap.put("generalDetalle", null);
		}else{
			paramMap.put("transicion", data.getInventarioOtra().getTipoTransicion());
			paramMap.put("incidencias", LogicosEnum.getLogicos().get(data.getInventarioOtra().getIncidencia()));
			paramMap.put("incidenciasDetalle", data.getInventarioOtra().getDetalleIncidencia());
			paramMap.put("mantenimientoCorrectivo", LogicosEnum.getLogicos().get(data.getInventarioOtra().getMantCorrectivoPrevisto()));
			paramMap.put("mantenimientoCorrectivoDetalle", data.getInventarioOtra().getCorrectivo());
			paramMap.put("mantenimientoEvolutivo", LogicosEnum.getLogicos().get(data.getInventarioOtra().getMantEvolutivoPrevisto()));
			paramMap.put("mantenimientoEvolutivoDetalle", data.getInventarioOtra().getCorrectivo());
			paramMap.put("nivelIncidencias", data.getInventarioOtra().getNivelIncidencias());
			paramMap.put("nivelIntegracion", data.getInventarioOtra().getIntegracion());
			paramMap.put("nivelIntegracionDetalle", data.getInventarioOtra().getDetalleIntegracion());
			paramMap.put("softwareAdicional", LogicosEnum.getLogicos().get(data.getInventarioOtra().getRequiereSW()));
			paramMap.put("softwareAdicionalDetalle", data.getInventarioOtra().getInventarioObjetos());
			paramMap.put("garantia", LogicosEnum.getLogicos().get(data.getInventarioOtra().getGarantia()));
			paramMap.put("garantiaDetalle", data.getInventarioOtra().getDetalleGarantia());
			//Parámetros de la segunda página de la plantilla
			paramMap.put("analisisFuncional", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocAnalisisFuncional()));
			paramMap.put("analisisFuncionalValoracion", data.getInventarioOtra().getAnalisisFuncionalvaloracion());
			paramMap.put("analisisFuncionalFecha", sdf.format(data.getInventarioOtra().getFechaUltActAnalisisFuncional()));
			paramMap.put("analisisFuncionalObservaciones", data.getInventarioOtra().getDetalleAnalisis());
			paramMap.put("diseñoTecnico", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocDisenoTecnico()));
			paramMap.put("diseñoTecnicoValoracion", data.getInventarioOtra().getValoracionDiseno());
			//Hay que realizar la comprobación ya que sdf.format necesita un tipo date y no un nulo
			if(data.getInventarioOtra().getFechaUltActDiseno() == null){
				paramMap.put("diseñoTecnicoFecha", null);
			}else {
				paramMap.put("diseñoTecnicoFecha", sdf.format(data.getInventarioOtra().getFechaUltActDiseno()));
			}
			paramMap.put("diseñoTecnicoObservaciones", data.getInventarioOtra().getDetalleDiseno());
			paramMap.put("planPruebas", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocPlanPruebas()));
			paramMap.put("planPruebasValoracion", "valoracion");
			if(data.getInventarioOtra().getFechaUltActPlanPrueba() == null){
				paramMap.put("planPruebasFecha", null);
			}else {
				paramMap.put("planPruebasFecha", sdf.format(data.getInventarioOtra().getFechaUltActPlanPrueba()));
			}
			
			paramMap.put("planPruebasObservaciones", data.getInventarioOtra().getDetallePlanPrueba());
			paramMap.put("manualInstalacion", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocManualInstalacion()));
			paramMap.put("manualInstalacionValoracion", data.getInventarioOtra().getValoracionManualInstalacion());
			if(data.getInventarioOtra().getFechaUltActManualInstalacion() == null){
				paramMap.put("manualInstalacionFecha", null);
			}else {
				paramMap.put("manualInstalacionFecha", sdf.format(data.getInventarioOtra().getFechaUltActManualInstalacion()));
			}
			paramMap.put("manualInstalacionObservaciones", data.getInventarioOtra().getDetalleManualInstalacion());
			paramMap.put("codigoFuenteDetalle", data.getInventarioOtra().getDocuCodigo());
			paramMap.put("procesoConstruccionDetalle", null);//Cambiar cuando este el campo en BD
			paramMap.put("documentacionDetalle", data.getInventarioOtra().getDocuCodigo());
			paramMap.put("generalDetalle", data.getInventarioOtra().getObservaciones());
		}
		return paramMap;
	}
	public void copia(InventarioDTO data) {
		//Mapa utilizado para almacenar los valores del parámetro data que serán los enviados al report
		Map<String,Object> paramMap = new HashMap<String,Object>();
		//Fecha actual
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = sdf.format(new Date());
		paramMap.put("fecha", fecha);
		//Comprobar si el Área Funcional es null en caso de serlo se introduce ""
		if(data.getAreaFuncional() == null){
			paramMap.put("areaFuncional", null);
		}else {
			paramMap.put("areaFuncional", data.getAreaFuncional().getNombre());
		}
		paramMap.put("identificador", data.getCodInventario());
		//paramMap.put("descripcion", data.getDescripcion());
		String des = "Muy lejos, más allá de las montañas de palabras, alejados de los países de las vocales y las consonantes, viven los textos simulados.Viven aislados en casas de letras, en la costa de la semántica, un gran océano de lenguas. Un riachuelo llamado Pons fluye por su pueblo y los abastece con las normas necesarias.Hablamos de un país paraisomático en el que a uno le caen pedazos de frases asadas en la boca. Ni siquiera los todopoderosos signos de puntuación dominan a los textos.";
		paramMap.put("descripcion", des);
		//Comprobar si los Responsables son nulos
		if(data.getResponsableGob() == null){
			paramMap.put("gobcan", null);
		}else {
			String gobcan = data.getResponsableGob().getNombre() + " " + data.getResponsableGob().getPrimerApellido() + " " + data.getResponsableGob().getSegundoApellido();
			paramMap.put("gobcan", gobcan);
		}
		if(data.getResponsableSUMA() == null){
			paramMap.put("suma", null);
		}else {
			String suma = data.getResponsableSUMA().getNombre() + " " + data.getResponsableSUMA().getSegundoApellido() + " " + data.getResponsableSUMA().getSegundoApellido();
			paramMap.put("suma", suma);
		}
		/********************************************************************************************************************/
		paramMap.put("descripcionAplicacion", data.getDescripcion());
		//Se comprueba que la tecnología no sea nula
		if(data.getTecnologia() == null){
			paramMap.put("tecnologia", null);
		}else {
			paramMap.put("tecnologia", data.getTecnologia().getCodTecnologia());
		}
		//Se comprueba que inventario otras no sea nulo en caso de ser nulo todos los datos deben estar en blanco.
		if(data.getInventarioOtra() == null){
			//Todos los parámetros en blanco de inventarioOtra
			paramMap.put("transicion", null);
			paramMap.put("incidencias", null);
			paramMap.put("incidenciasDetalle", null);
			paramMap.put("mantenimientoCorrectivo", null);
			paramMap.put("mantenimientoCorrectivoDetalle", null);
			paramMap.put("mantenimientoEvolutivo", null);
			paramMap.put("mantenimientoEvolutivoDetalle", null);
			paramMap.put("nivelIncidencias", null);
			paramMap.put("nivelIntegracion", null);
			paramMap.put("nivelIntegracionDetalle", null);
			paramMap.put("softwareAdicional", null);
			paramMap.put("softwareAdicional", null);
			paramMap.put("garantia", null);
			paramMap.put("garantiaDetalle", null);
			//Parámetros de la segunda página de la plantilla
			paramMap.put("analisisFuncional", null);
			paramMap.put("analisisFuncionalValoracion", null);
			paramMap.put("analisisFuncionalFecha", null);
			paramMap.put("analisisFuncionalObservaciones", null);
			paramMap.put("diseñoTecnico", null);
			paramMap.put("diseñoTecnicoValoracion", null);
			paramMap.put("diseñoTecnicoFecha", null);
			paramMap.put("diseñoTecnicoObservaciones", null);
			paramMap.put("planPruebas", null);
			paramMap.put("planPruebasValoracion", null);
			paramMap.put("planPruebasFecha", null);
			paramMap.put("planPruebasObservaciones", null);
			paramMap.put("manualInstalacion", null);
			paramMap.put("manualInstalacionValoracion", null);
			paramMap.put("manualInstalacionFecha", null);
			paramMap.put("manualInstalacionObservaciones", null);
			paramMap.put("codigoFuente", null);
			paramMap.put("procesoConstruccionDetalle", null);
			paramMap.put("documentacionDetalle", null);
			paramMap.put("generalDetalle", null);
		}else{
			paramMap.put("transicion", data.getInventarioOtra().getTipoTransicion());
			paramMap.put("incidencias", data.getInventarioOtra().getIncidencia());
			paramMap.put("incidenciasDetalle", data.getInventarioOtra().getDetalleIncidencia());
			paramMap.put("mantenimientoCorrectivo", LogicosEnum.getLogicos().get(data.getInventarioOtra().getMantCorrectivoPrevisto()));
			paramMap.put("mantenimientoCorrectivoDetalle", data.getInventarioOtra().getCorrectivo());
			paramMap.put("mantenimientoEvolutivo", LogicosEnum.getLogicos().get(data.getInventarioOtra().getMantEvolutivoPrevisto()));
			paramMap.put("mantenimientoEvolutivoDetalle", data.getInventarioOtra().getEvolutivo());
			paramMap.put("nivelIncidencias", data.getInventarioOtra().getNivelIncidencias());
			paramMap.put("nivelIntegracion", data.getInventarioOtra().getIntegracion());
			paramMap.put("nivelIntegracionDetalle", data.getInventarioOtra().getDetalleIntegracion());
			paramMap.put("softwareAdicional", LogicosEnum.getLogicos().get(data.getInventarioOtra().getRequiereSW()));
			paramMap.put("softwareAdicionalDetalle", data.getInventarioOtra().getInventarioObjetos());
			paramMap.put("garantia", LogicosEnum.getLogicos().get(data.getInventarioOtra().getGarantia()));
			paramMap.put("garantiaDetalle", data.getInventarioOtra().getDetalleGarantia());
			//Parámetros de la segunda página de la plantilla
			paramMap.put("analisisFuncional", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocAnalisisFuncional()));
			paramMap.put("analisisFuncionalValoracion", data.getInventarioOtra().getAnalisisFuncionalvaloracion());
			paramMap.put("analisisFuncionalFecha", data.getInventarioOtra().getFechaUltActAnalisisFuncional());
			paramMap.put("analisisFuncionalObservaciones", data.getInventarioOtra().getDetalleAnalisis());
			paramMap.put("diseñoTecnico", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocDisenoTecnico()));
			paramMap.put("diseñoTecnicoValoracion", data.getInventarioOtra().getValoracionDiseno());
			paramMap.put("diseñoTecnicoFecha", data.getInventarioOtra().getFechaUltActDiseno());
			paramMap.put("diseñoTecnicoObservaciones", data.getInventarioOtra().getDetalleDiseno());
			paramMap.put("planPruebas", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocPlanPruebas()));
			paramMap.put("planPruebasValoracion", data.getInventarioOtra().getValoracionPlanPrueba());
			paramMap.put("planPruebasFecha", data.getInventarioOtra().getFechaUltActPlanPrueba());
			paramMap.put("planPruebasObservaciones", data.getInventarioOtra().getDetallePlanPrueba());
			paramMap.put("manualInstalacion", LogicosEnum.getLogicos().get(data.getInventarioOtra().getDocManualInstalacion()));
			paramMap.put("manualInstalacionValoracion", data.getInventarioOtra().getValoracionManualInstalacion());
			paramMap.put("manualInstalacionFecha", data.getInventarioOtra().getFechaUltActManualInstalacion());
			paramMap.put("manualInstalacionObservaciones", data.getInventarioOtra().getDetalleManualInstalacion());
			paramMap.put("codigoFuenteDetalle", data.getInventarioOtra().getDocuCodigo());
			paramMap.put("procesoConstruccionDetalle", null);//Cambiar cuando este el campo en BD
			paramMap.put("documentacionDetalle", data.getInventarioOtra().getDocuCodigo());
			paramMap.put("generalDetalle", data.getInventarioOtra().getObservaciones());
		}
	}
}
