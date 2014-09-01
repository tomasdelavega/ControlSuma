package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date fechaAlta;
    private Date fechaBaja;
    private String primerApellido;
    private String segundoApellido;
    private String codPersona;
    private String codJira;
    private String email;
    private String telefonoContacto;
    private String nombre;
    private Date fechaUltMod;
    private RolDTO rol;

    public PersonaDTO() {

    }

    public PersonaDTO(Long id) {
    	this.id= id;
	}

	public Long getId() {
	return id;
    }

    public Date getFechaAlta() {
	return fechaAlta;
    }

    public Date getFechaBaja() {
	return fechaBaja;
    }

    public String getPrimerApellido() {
	return primerApellido;
    }

    public String getSegundoApellido() {
	return segundoApellido;
    }

    public String getCodPersona() {
	return codPersona;
    }

    public String getEmail() {
	return email;
    }

    public String getNombre() {
	return nombre;
    }

    public RolDTO getRol() {
	return rol;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
	this.fechaBaja = fechaBaja;
    }

    public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
    }

    public void setCodPersona(String codPersona) {
	this.codPersona = codPersona;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setRol(RolDTO rol) {
	this.rol = rol;
    }   
    
    public String getCodJira() {
		return codJira;
	}

	public void setCodJira(String codJira) {
		this.codJira = codJira;
	}
	
	
	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	@Override
    public String toString() {
		String nombre="";
		nombre+= (this.primerApellido!=null)?this.primerApellido:" ";
		nombre+=" "+ this.segundoApellido  != null ?this.segundoApellido: " ";
		nombre+=  ","+ this.nombre != null? this.nombre:" ";
		
		return nombre;
		
    }
}
