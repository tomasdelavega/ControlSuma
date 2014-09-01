package es.gobcantabria.aplicaciones.controlSuma.business.dto.filter;

import java.io.Serializable;

public class PersonaFilterDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idRol;
	private String codPersona;
	private String codJira;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;

	public PersonaFilterDTO (){}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}

	public String getCodJira() {
		return codJira;
	}

	public void setCodJira(String codJira) {
		this.codJira = codJira;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
