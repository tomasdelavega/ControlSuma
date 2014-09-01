package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.io.Serializable;
import java.util.Date;

public class InventarioOtrasDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date fechaAlta;
	private Date fechaUltMod;
	private Boolean docAnalisisFuncional;
	private Boolean docDisenoTecnico;
	private Boolean docManualInstalacion;
	private Boolean docPlanPruebas;
	private Boolean mantCorrectivoPrevisto;
	private Boolean mantEvolutivoPrevisto;
	private Boolean trabajosVuelo;
	private String correctivo;
	private String docOtra;
	private String evolutivo;
	private String inventarioObjetos; //DETALLE DEL SOFTWARE
	private String nivelCalidadCodigo;
	private String nivelIncidencias;
	private String observaciones;
	private String periodoUsoAplicacion;
	private String rutaDoc;
	private String tipoTransicion;
	private String descripciontrabajosVuelo;
	private String detalleIncidencia;
	private String incidencia;
	private InventarioDTO inventario;
	private String detalleAnalisis;
	private String detalleIntegracion;
	private String integracion;
	private String valoracionManualInstalacion;
	private Date fechaUltActManualInstalacion;
	private String detalleManualInstalacion;
	private String valoracionPlanPrueba;
	private String detallePlanPrueba;
	private Date fechaUltActPlanPrueba;
	private String detalleDiseno;
	private Date fechaUltActDiseno;
	private String valoracionDiseno;
	private Boolean garantia;
	private Boolean requiereSW;
	private String docuCodigo;

	public InventarioOtrasDTO() {
	}

	public InventarioDTO getInventario() {
		return inventario;
	}

	public void setInventario(InventarioDTO inventario) {
		this.inventario = inventario;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public String getIntegracion() {
		return integracion;
	}

	private String detalleGarantia;

	public Date getFechaUltActAnalisisFuncional() {
		return fechaUltActAnalisisFuncional;
	}

	public void setFechaUltActAnalisisFuncional(
			Date fechaUltActAnalisisFuncional) {
		this.fechaUltActAnalisisFuncional = fechaUltActAnalisisFuncional;
	}

	public String getAnalisisFuncionalvaloracion() {
		return analisisFuncionalvaloracion;
	}

	public void setAnalisisFuncionalvaloracion(
			String analisisFuncionalvaloracion) {
		this.analisisFuncionalvaloracion = analisisFuncionalvaloracion;
	}

	private Date fechaUltActAnalisisFuncional;
	private String analisisFuncionalvaloracion;

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public void setIntegracion(String integracion) {
		this.integracion = integracion;
	}

	public String getDetalleIncidencia() {
		return detalleIncidencia;
	}

	public void setDetalleIncidencia(String detalleIncidencia) {
		this.detalleIncidencia = detalleIncidencia;
	}

	public String getDetalleGarantia() {
		return detalleGarantia;
	}

	public void setDetalleGarantia(String detalleGarantia) {
		this.detalleGarantia = detalleGarantia;
	}

	public String getDetalleAnalisis() {
		return detalleAnalisis;
	}

	public void setDetalleAnalisis(String detalleAnalisis) {
		this.detalleAnalisis = detalleAnalisis;
	}

	public String getDetalleIntegracion() {
		return detalleIntegracion;
	}

	public void setDetalleIntegracion(String detalleIntegracion) {
		this.detalleIntegracion = detalleIntegracion;
	}

	public String getValoracionManualInstalacion() {
		return valoracionManualInstalacion;
	}

	public void setValoracionManualInstalacion(
			String valoracionManualInstalacion) {
		this.valoracionManualInstalacion = valoracionManualInstalacion;
	}

	public Date getFechaUltActManualInstalacion() {
		return fechaUltActManualInstalacion;
	}

	public void setFechaUltActManualInstalacion(
			Date fechaUltActManualInstalacion) {
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

	public String getDocuCodigo() {
		return docuCodigo;
	}

	public void setDocuCodigo(String docuCodigo) {
		this.docuCodigo = docuCodigo;
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

}
