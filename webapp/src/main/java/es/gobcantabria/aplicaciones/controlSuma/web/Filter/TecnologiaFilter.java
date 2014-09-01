package es.gobcantabria.aplicaciones.controlSuma.web.Filter;

import java.io.Serializable;
import javax.validation.constraints.Size;

public class TecnologiaFilter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(min=0, max=8,message="Máximo 8 caracteres")
	private Long id;
	@Size(min=0, max=50, message="Máximo 50 caracteres")
	private String codTecnologia;
	@Size(min=0, max=500, message="Máximo 500 caracteres")
	private String framework;
	
	public TecnologiaFilter() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodTecnologia() {
		return codTecnologia;
	}
	public void setCodTecnologia(String codTecnologia) {
		this.codTecnologia = codTecnologia;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	
}
