package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.io.Serializable;
import java.util.Date;


public class RolDTO implements Serializable{


	private static final long serialVersionUID = -7933348516625840336L;


	private Long id;
    private String nombre;
    private Date fechaAlta;
    private Date fechaUltMod;
    private String descripcion;
    private Long codJira;
    
    public RolDTO(){
    	
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
    
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getCodJira() {
		return codJira;
	}

	public void setCodJira(Long codJira) {
		this.codJira = codJira;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
