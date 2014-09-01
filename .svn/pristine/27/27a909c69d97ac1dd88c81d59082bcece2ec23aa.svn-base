package es.gobcantabria.aplicaciones.controlSuma.web.Filter;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;



/**
 * @author tdevegaa
 *
 *Clase Filter para filtrar las búsquedas en las páginas de persona   
 */
public class PersonaFilter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(min=0, max=30)
	private String codPersona;
	@Size(min=0, max=30, message="Introduzca de 0 a 30 caracteres")
	private String codJira;
	@Size(min = 0, max = 50, message = "Introduzca de 0 a 50 caracteres")
	private String nombre;
	@Size(min=0, max=50, message="Introduzca de 0 a 50 caracteres")
	private String primerApellido;
	@Size(min=0, max=50, message="Introduzca de 0 a 50 caracteres")
	private String segundoApellido;
	
	private Long rol;
	
	
	public PersonaFilter(){}
	
	public PersonaFilterDTO convert(){
		PersonaFilterDTO dto = new PersonaFilterDTO();
		dto.setCodPersona(this.getCodPersona());
		dto.setCodJira(this.getCodJira());
		dto.setIdRol(this.getRol());
		dto.setNombre(this.getNombre());
		dto.setPrimerApellido(this.getPrimerApellido());
		dto.setSegundoApellido(this.getSegundoApellido());
		return dto;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
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


	public Long getRol() {
		return rol;
	}


	public void setRol(Long rol) {
		this.rol = rol;
	}



}
