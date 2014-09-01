package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.AreaFuncionalDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioOtrasDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;

public class InventarioOtrasModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
    private Long idInventario;
    
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaAlta;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltMod;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltActAnalisisFuncional;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltActManualInstalacion;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltActPlanPrueba;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltActDiseno;
	
	
	private Boolean docAnalisisFuncional;
	private Boolean docDisenoTecnico;
	private Boolean docManualInstalacion;
	private Boolean docPlanPruebas;
	private Boolean mantCorrectivoPrevisto;
	private Boolean mantEvolutivoPrevisto;
	private Boolean trabajosVuelo;
	private Boolean garantia;
	private Boolean requiereSW;

	
	@Size(min = 0, max = 10)
	private String nivelIncidencias;
	@Size(min = 0, max = 255)
	private String rutaDoc;
	@Size(min = 0, max = 100)
	private String nivelCalidadCodigo;
	@Size(min = 0, max = 100)
	private String periodoUsoAplicacion;
	@Size(min = 0, max = 30)
	private String tipoTransicion;
	@Size(min = 0, max = 30)
	private String incidencia;
	
	//Input
	@Size(min = 0, max = 500)
	private String correctivo;
	@Size(min = 0, max = 500)
	private String docOtra;
	@Size(min = 0, max = 500)
	private String evolutivo;
	@Size(min = 0, max = 500)
	private String inventarioObjetos;
	@Size(min = 0, max = 500)
	private String observaciones;
	@Size(min = 0, max = 500)
	private String descripciontrabajosVuelo;
	@Size(min = 0, max = 30)
	private String integracion;


//TextArea
	@Size(min = 0, max = 200)
	private String detalleGarantia;
	@Size(min = 0, max = 200)
	private String detalleIncidencia;
	@Size(min = 0, max = 200)
	private String detalleAnalisis;
	@Size(min = 0, max = 200)
	private String detalleIntegracion;
	@Size(min = 0, max = 200)
	private String detalleManualInstalacion;
	@Size(min = 0, max = 200)
	private String detallePlanPrueba;
	@Size(min = 0, max = 200)
	private String detalleDiseno;
	

	
	@Size(min = 0, max = 200)
	private String analisisFuncionalvaloracion;
	@Size(min = 0, max = 200)
	private String valoracionManualInstalacion;
	@Size(min = 0, max = 200)
	private String valoracionPlanPrueba;
	@Size(min = 0, max = 200)
	private String valoracionDiseno;
	
	@Size(min = 0, max = 200)
	private String docuCodigo;
	


	
	public Long getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Long idInventario) {
		this.idInventario = idInventario;
	}


	public Date getFechaUltActAnalisisFuncional() {
		return fechaUltActAnalisisFuncional;
	}

	public void setFechaUltActAnalisisFuncional(Date fechaUltActAnalisisFuncional) {
		this.fechaUltActAnalisisFuncional = fechaUltActAnalisisFuncional;
	}

	public String getAnalisisFuncionalvaloracion() {
		return analisisFuncionalvaloracion;
	}

	public void setAnalisisFuncionalvaloracion(String analisisFuncionalvaloracion) {
		this.analisisFuncionalvaloracion = analisisFuncionalvaloracion;
	}

	
	public String getDocuCodigo() {
		return docuCodigo;
	}

	public void setDocuCodigo(String docuCodigo) {
		this.docuCodigo = docuCodigo;
	}

	public String getValoracionManualInstalacion() {
		return valoracionManualInstalacion;
	}

	public void setValoracionManualInstalacion(String valoracionManualInstalacion) {
		this.valoracionManualInstalacion = valoracionManualInstalacion;
	}

	public Date getFechaUltActManualInstalacion() {
		return fechaUltActManualInstalacion;
	}

	public void setFechaUltActManualInstalacion(Date fechaUltActManualInstalacion) {
		this.fechaUltActManualInstalacion = fechaUltActManualInstalacion;
	}

	public String getDetalleManualInstalacion() {
		return detalleManualInstalacion;
	}

	public void setDetalleManualInstalacion(String detalleManualInstalacion) {
		this.detalleManualInstalacion = detalleManualInstalacion;
	}


	public String getValoracionPlanPrueba() {
		return valoracionPlanPrueba;
	}

	public void setValoracionPlanPrueba(String valoracionPlanPrueba) {
		this.valoracionPlanPrueba = valoracionPlanPrueba;
	}

	public String getDetallePlanPrueba() {
		return detallePlanPrueba;
	}

	public void setDetallePlanPrueba(String detallePlanPrueba) {
		this.detallePlanPrueba = detallePlanPrueba;
	}

	public Date getFechaUltActPlanPrueba() {
		return fechaUltActPlanPrueba;
	}

	public void setFechaUltActPlanPrueba(Date fechaUltActPlanPrueba) {
		this.fechaUltActPlanPrueba = fechaUltActPlanPrueba;
	}

	public String getDetalleDiseno() {
		return detalleDiseno;
	}

	public void setDetalleDiseno(String detalleDiseno) {
		this.detalleDiseno = detalleDiseno;
	}

	public Date getFechaUltActDiseno() {
		return fechaUltActDiseno;
	}

	public void setFechaUltActDiseno(Date fechaUltActDiseno) {
		this.fechaUltActDiseno = fechaUltActDiseno;
	}

	public String getValoracionDiseno() {
		return valoracionDiseno;
	}

	public void setValoracionDiseno(String valoracionDiseno) {
		this.valoracionDiseno = valoracionDiseno;
	}

	
	public String getDetalleAnalisis() {
		return detalleAnalisis;
	}

	public void setDetalleAnalisis(String detalleAnalisis) {
		this.detalleAnalisis = detalleAnalisis;
	}

	
	public String getDetalleGarantia() {
		return detalleGarantia;
	}

	public void setDetalleGarantia(String detalleGarantia) {
		this.detalleGarantia = detalleGarantia;
	}

	public Boolean getGarantia() {
		return garantia;
	}

	public void setGarantia(Boolean garantia) {
		this.garantia = garantia;
	}


	public Boolean getRequiereSW() {
		return requiereSW;
	}

	public void setRequiereSW(Boolean requiereSW) {
		this.requiereSW = requiereSW;
	}


	


	


	public String getDetalleIncidencia() {
		return detalleIncidencia;
	}

	public void setDetalleIncidencia(String detalleIncidencia) {
		this.detalleIncidencia = detalleIncidencia;
	}

	public String getDetalleIntegracion() {
		return detalleIntegracion;
	}

	public void setDetalleIntegracion(String detalleIntegracion) {
		this.detalleIntegracion = detalleIntegracion;
	}





	public InventarioOtrasModel() {
	
	}

	public String getIncidencia() {
		return incidencia;
	}

	public String getIntegracion() {
		return integracion;
	}

	public InventarioOtrasModel(InventarioOtrasDTO otras) {

		this.id = otras.getId();
		this.fechaAlta = otras.getFechaAlta();
		this.fechaUltMod = otras.getFechaUltMod();
		this.docAnalisisFuncional = otras.getDocAnalisisFuncional();
		this.docDisenoTecnico = otras.getDocDisenoTecnico();
		this.docManualInstalacion = otras.getDocManualInstalacion();
		this.docPlanPruebas = otras.getDocPlanPruebas();
		this.mantCorrectivoPrevisto = otras.getMantCorrectivoPrevisto();
		this.mantEvolutivoPrevisto = otras.getMantEvolutivoPrevisto();
		this.trabajosVuelo = otras.getTrabajosVuelo();
		this.correctivo = otras.getCorrectivo();
		this.docOtra = otras.getDocOtra();
		this.evolutivo = otras.getEvolutivo();
		this.inventarioObjetos = otras.getInventarioObjetos();
		this.nivelCalidadCodigo = otras.getNivelCalidadCodigo();
		this.nivelIncidencias = otras.getNivelIncidencias();
		this.observaciones = otras.getObservaciones();
		this.periodoUsoAplicacion = otras.getPeriodoUsoAplicacion();
		this.rutaDoc = otras.getRutaDoc();
		this.tipoTransicion = otras.getTipoTransicion();
		this.descripciontrabajosVuelo = otras.getDescripciontrabajosVuelo();
		this.detalleIncidencia=otras.getDetalleIncidencia();
		this.incidencia = otras.getIncidencia();
		this.detalleGarantia = otras.getDetalleGarantia();
		
		this.fechaUltActAnalisisFuncional = otras.getFechaUltActAnalisisFuncional();
		this.analisisFuncionalvaloracion = otras.getAnalisisFuncionalvaloracion();

		this.detalleAnalisis = otras.getDetalleAnalisis();

		this.detalleIntegracion = otras.getDetalleIntegracion();
		this.integracion = otras.getIntegracion();
		this.valoracionManualInstalacion = otras.getValoracionManualInstalacion();
		this.fechaUltActManualInstalacion = otras.getFechaUltActManualInstalacion();
		this.detalleManualInstalacion = otras.getDetalleManualInstalacion();
		

		this.valoracionPlanPrueba = otras.getValoracionPlanPrueba();
		this.detallePlanPrueba = otras.getDetallePlanPrueba();
		this.fechaUltActPlanPrueba = otras.getFechaUltActPlanPrueba();

		this.detalleDiseno = otras.getDetalleDiseno();
		this.fechaUltActDiseno = otras.getFechaUltActDiseno();
		this.valoracionDiseno = otras.getValoracionDiseno();
		this.garantia = otras.getGarantia();
		this.requiereSW = otras.getRequiereSW();
		this.docuCodigo = otras.getDocuCodigo();
		//this.inventario = otras.getInventario();
		
		if(otras.getInventario()!=null){
			this.idInventario = otras.getInventario().getId();
			} else 
			{
				this.idInventario = this.id;
			}
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}

	public Boolean getDocAnalisisFuncional() {
		return docAnalisisFuncional;
	}

	public void setDocAnalisisFuncional(Boolean docAnalisisFuncional) {
		this.docAnalisisFuncional = docAnalisisFuncional;
	}

	public Boolean getDocDisenoTecnico() {
		return docDisenoTecnico;
	}

	public void setDocDisenoTecnico(Boolean docDisenoTecnico) {
		this.docDisenoTecnico = docDisenoTecnico;
	}

	public Boolean getDocManualInstalacion() {
		return docManualInstalacion;
	}

	public void setDocManualInstalacion(Boolean docManualInstalacion) {
		this.docManualInstalacion = docManualInstalacion;
	}

	public Boolean getDocPlanPruebas() {
		return docPlanPruebas;
	}

	public void setDocPlanPruebas(Boolean docPlanPruebas) {
		this.docPlanPruebas = docPlanPruebas;
	}

	public Boolean getMantCorrectivoPrevisto() {
		return mantCorrectivoPrevisto;
	}

	public void setMantCorrectivoPrevisto(Boolean mantCorrectivoPrevisto) {
		this.mantCorrectivoPrevisto = mantCorrectivoPrevisto;
	}

	public Boolean getMantEvolutivoPrevisto() {
		return mantEvolutivoPrevisto;
	}

	public void setMantEvolutivoPrevisto(Boolean mantEvolutivoPrevisto) {
		this.mantEvolutivoPrevisto = mantEvolutivoPrevisto;
	}

	public Boolean getTrabajosVuelo() {
		return trabajosVuelo;
	}

	public void setTrabajosVuelo(Boolean trabajosVuelo) {
		this.trabajosVuelo = trabajosVuelo;
	}

	public String getCorrectivo() {
		return correctivo;
	}

	public void setCorrectivo(String correctivo) {
		this.correctivo = correctivo;
	}

	public String getDocOtra() {
		return docOtra;
	}

	public void setDocOtra(String docOtra) {
		this.docOtra = docOtra;
	}

	public String getEvolutivo() {
		return evolutivo;
	}

	public void setEvolutivo(String evolutivo) {
		this.evolutivo = evolutivo;
	}

	public String getInventarioObjetos() {
		return inventarioObjetos;
	}

	public void setInventarioObjetos(String inventarioObjetos) {
		this.inventarioObjetos = inventarioObjetos;
	}

	public String getNivelCalidadCodigo() {
		return nivelCalidadCodigo;
	}

	public void setNivelCalidadCodigo(String nivelCalidadCodigo) {
		this.nivelCalidadCodigo = nivelCalidadCodigo;
	}

	public String getNivelIncidencias() {
		return nivelIncidencias;
	}

	public void setNivelIncidencias(String nivelIncidencias) {
		this.nivelIncidencias = nivelIncidencias;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getPeriodoUsoAplicacion() {
		return periodoUsoAplicacion;
	}

	public void setPeriodoUsoAplicacion(String periodoUsoAplicacion) {
		this.periodoUsoAplicacion = periodoUsoAplicacion;
	}

	public String getRutaDoc() {
		return rutaDoc;
	}

	public void setRutaDoc(String rutaDoc) {
		this.rutaDoc = rutaDoc;
	}

	public String getTipoTransicion() {
		return tipoTransicion;
	}

	public void setTipoTransicion(String tipoTransicion) {
		this.tipoTransicion = tipoTransicion;
	}

	public String getDescripciontrabajosVuelo() {
		return descripciontrabajosVuelo;
	}

	public void setDescripciontrabajosVuelo(String descripciontrabajosVuelo) {
		this.descripciontrabajosVuelo = descripciontrabajosVuelo;
	}

	public InventarioOtrasDTO convert() {
		InventarioOtrasDTO dto = new InventarioOtrasDTO();
		
		InventarioDTO inventarioId = new InventarioDTO();
		inventarioId.setId(this.idInventario);
		dto.setInventario(inventarioId);
		dto.setId(idInventario);
		
		dto.setAnalisisFuncionalvaloracion(this.analisisFuncionalvaloracion);
		dto.setCorrectivo(this.correctivo);
		dto.setDescripciontrabajosVuelo(this.descripciontrabajosVuelo);
		dto.setDetalleAnalisis(this.detalleAnalisis);
		dto.setDetalleDiseno(this.detalleDiseno);
		dto.setDetalleGarantia(this.detalleGarantia);
		dto.setDetalleIncidencia(this.detalleIncidencia);
		dto.setDetalleIntegracion(this.detalleIntegracion);
		dto.setDetalleManualInstalacion(this.detalleManualInstalacion);
		dto.setDetallePlanPrueba(this.detallePlanPrueba);
		dto.setDocAnalisisFuncional(this.docAnalisisFuncional);
		dto.setDocDisenoTecnico(this.docDisenoTecnico);
		dto.setDocPlanPruebas(this.docPlanPruebas);
		dto.setDocManualInstalacion(this.docManualInstalacion);
		dto.setDocOtra(this.docOtra);
		dto.setDocuCodigo(this.docuCodigo);
		dto.setEvolutivo(this.evolutivo);
		dto.setFechaAlta(this.fechaAlta);
		dto.setFechaUltActAnalisisFuncional(this.fechaUltActAnalisisFuncional);
		dto.setFechaUltActDiseno(this.fechaUltActDiseno);
		dto.setFechaUltActManualInstalacion(this.fechaUltActManualInstalacion);
		dto.setFechaUltActPlanPrueba(this.fechaUltActPlanPrueba);
		dto.setFechaUltMod(this.fechaUltMod);
		dto.setGarantia(this.garantia);
		
		dto.setIncidencia(this.incidencia);
		dto.setIntegracion(this.integracion);
		dto.setInventarioObjetos(this.inventarioObjetos);
		dto.setMantCorrectivoPrevisto(this.mantCorrectivoPrevisto);
		dto.setMantEvolutivoPrevisto(this.mantEvolutivoPrevisto);
		dto.setNivelCalidadCodigo(this.nivelCalidadCodigo);
		dto.setNivelIncidencias(this.nivelIncidencias);
		dto.setObservaciones(this.observaciones);
		dto.setPeriodoUsoAplicacion(this.periodoUsoAplicacion);
		dto.setRequiereSW(this.requiereSW);
		dto.setRutaDoc(this.rutaDoc);
		dto.setTipoTransicion(this.tipoTransicion);
		dto.setTrabajosVuelo(this.trabajosVuelo);
		dto.setValoracionDiseno(this.valoracionDiseno);
		dto.setValoracionManualInstalacion(this.valoracionManualInstalacion);
		dto.setValoracionPlanPrueba(this.valoracionPlanPrueba);
	

		return dto;

	}

	
	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public void setIntegracion(String integracion) {
		this.integracion = integracion;
	}
	
}
