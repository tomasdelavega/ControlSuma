package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;

public class PersonaModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@Size(min=1, max=30,message="Debe tener entre 1 y 30 caracteres")
	private String codPersona;
	@Size(min=1, max=30,message="Debe tener entre 1 y 30 caracteres")
	private String codJira;
	@Size(min=1, max=50,message="Debe tener entre 1 y 50 caracteres")
	private String nombre;
	@Size(min=1, max=50,message="Debe tener entre 1 y 50 caracteres")
	private String primerApellido;
	@Size(min=1, max=50,message="Debe tener entre 1 y 50 caracteres")
	private String segundoApellido;
	@Size(min=0, max=255,message="Debe tener como máximo 255 caracteres")
	private String email;
	@Size(min=0, max=30,message="Debe tener como máximo 30 caracteres")
	private String telefonoContacto;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltMod;
	@NotNull
	private Long rol;
	
	public PersonaModel(){}
	
	public PersonaModel(PersonaDTO dto){
		this.setId(dto.getId());
		this.setCodPersona(dto.getCodPersona());
		this.setCodJira(dto.getCodJira());
		this.setNombre(dto.getNombre());
		this.setPrimerApellido(dto.getPrimerApellido());
		this.setSegundoApellido(dto.getSegundoApellido());
		this.setEmail(dto.getEmail());
		this.setTelefonoContacto(dto.getTelefonoContacto());
		this.setFechaUltMod(dto.getFechaUltMod());
		if(dto.getRol()!= null){
			this.setRol(dto.getRol().getId());
		}
		
	}
	
	public PersonaDTO convert(){
		PersonaDTO p = new PersonaDTO();
		p.setId(this.getId());
		p.setCodPersona(this.getCodPersona());
		p.setCodJira(this.getCodJira());
		p.setNombre(this.getNombre());
		p.setPrimerApellido(this.getPrimerApellido());
		p.setSegundoApellido(this.getSegundoApellido());
		p.setEmail(this.getEmail());
		p.setTelefonoContacto(this.getTelefonoContacto());
		p.setFechaUltMod(this.getFechaUltMod());
		RolDTO r = new RolDTO();
		r.setId(this.getRol());
		p.setRol(r);
		return p;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}

	public Long getRol() {
		return rol;
	}

	public void setRol(Long rol) {
		this.rol = rol;
	}
	
}
