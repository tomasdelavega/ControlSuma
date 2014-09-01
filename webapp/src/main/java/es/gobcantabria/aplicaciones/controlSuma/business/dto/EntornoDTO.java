package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;

public class EntornoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    	


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




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private Long id;


    private Date fechaAlta;


    private Date fechaUltMod;


    private String confLdap;


    private String datosBbdd;


    private String tEntorno;


    private String frameworks;

    private String herramientaConstruccion;


    private String observaciones;

    private String rutaLog;


    private String rutaSvn;


    private String servidorDespliegue;


    private String url;

    private String versionJava;

    //private Inventario inventario;
    private InventarioDTO inventario;
   
    	public InventarioDTO getInventario() {
		return inventario;
	}


		public void setInventario(InventarioDTO inventario) {
		this.inventario = inventario;
	}


		public EntornoDTO(){}
}
