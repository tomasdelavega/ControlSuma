package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.EntornoDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioOtrasDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;

public class EntornoModel {
	
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaAlta;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaUltMod;
	
	@Size(min = 0, max = 3)
    private String tEntorno;
	
	@Size(min = 0, max = 300)
    private String confLdap;
	@Size(min = 0, max = 300)
    private String datosBbdd;
	@Size(min = 0, max = 300)
    private String frameworks;
	@Size(min = 0, max = 300)
	private String herramientaConstruccion;
	@Size(min = 0, max = 300)
    private String rutaLog;
	@Size(min = 0, max = 300)
    private String rutaSvn;
	@Size(min = 0, max = 500)
    private String servidorDespliegue;
	@Size(min = 0, max = 300)
    private String url;

	
	@Size(min = 0, max = 500)
    private String observaciones;
	
	@Size(min = 0, max = 50)
    private String versionJava;

    private Long idInventario;
    
    public Long getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Long idInventario) {
		this.idInventario = idInventario;
	}

	public EntornoModel(){}
	
	public EntornoModel(EntornoDTO entorno) {

		this.id = entorno.getId();
		this.confLdap=entorno.getConfLdap();
		this.datosBbdd=entorno.getDatosBbdd();
		this.fechaAlta=entorno.getFechaAlta();
		this.fechaUltMod=entorno.getFechaUltMod();
		this.frameworks=entorno.getFrameworks();
		this.herramientaConstruccion=entorno.getHerramientaConstruccion();
		//this.inventario=entorno.getInventario();
		this.observaciones=entorno.getObservaciones();
		this.rutaLog=entorno.getRutaLog();
		this.rutaSvn=entorno.getRutaSvn();
		this.servidorDespliegue=entorno.getServidorDespliegue();
		this.tEntorno=entorno.gettEntorno();
		this.url=entorno.getUrl();
		this.versionJava=entorno.getVersionJava();
		//this.idInventario = entorno.getInventario().getId();
		
		
//		if (entorno.getInventario() != null) {
//			this.inventario = entorno.getInventario().getId();
//		}

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


	public String getConfLdap() {
		return confLdap;
	}


	public void setConfLdap(String confLdap) {
		this.confLdap = confLdap;
	}


	public String getDatosBbdd() {
		return datosBbdd;
	}


	public void setDatosBbdd(String datosBbdd) {
		this.datosBbdd = datosBbdd;
	}


	public String gettEntorno() {
		return tEntorno;
	}


	public void settEntorno(String tEntorno) {
		this.tEntorno = tEntorno;
	}


	public String getFrameworks() {
		return frameworks;
	}


	public void setFrameworks(String frameworks) {
		this.frameworks = frameworks;
	}


	public String getHerramientaConstruccion() {
		return herramientaConstruccion;
	}


	public void setHerramientaConstruccion(String herramientaConstruccion) {
		this.herramientaConstruccion = herramientaConstruccion;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getRutaLog() {
		return rutaLog;
	}


	public void setRutaLog(String rutaLog) {
		this.rutaLog = rutaLog;
	}


	public String getRutaSvn() {
		return rutaSvn;
	}


	public void setRutaSvn(String rutaSvn) {
		this.rutaSvn = rutaSvn;
	}


	public String getServidorDespliegue() {
		return servidorDespliegue;
	}


	public void setServidorDespliegue(String servidorDespliegue) {
		this.servidorDespliegue = servidorDespliegue;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getVersionJava() {
		return versionJava;
	}


	public void setVersionJava(String versionJava) {
		this.versionJava = versionJava;
	}



	public EntornoDTO convert() {
		EntornoDTO dto = new EntornoDTO();
		
		
		dto.setConfLdap(this.confLdap);
		dto.setDatosBbdd(this.datosBbdd);
		dto.setFechaAlta(this.fechaAlta);
		dto.setFechaUltMod(this.fechaUltMod);
		dto.setFrameworks(this.frameworks);
		dto.setHerramientaConstruccion(this.herramientaConstruccion);
		dto.setId(this.id);
		dto.setObservaciones(this.observaciones);
		dto.setRutaLog(this.rutaLog);
		dto.setRutaSvn(this.rutaSvn);
		dto.setServidorDespliegue(this.servidorDespliegue);
		dto.settEntorno(this.tEntorno);
		dto.setUrl(this.url);
		dto.setVersionJava(this.versionJava);

		
		InventarioDTO inventarioId = new InventarioDTO();
		inventarioId.setId(this.idInventario);
		dto.setInventario(inventarioId);

		return dto;

	}
	
}
