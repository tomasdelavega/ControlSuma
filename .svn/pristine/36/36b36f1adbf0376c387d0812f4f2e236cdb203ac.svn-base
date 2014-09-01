package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioPersonaPK;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;

public class InventarioPersonaDTO {
    private static final long serialVersionUID = 1L;
    
	  	public InventarioPersonaPK getId() {
		return id;
	}
	public void setId(InventarioPersonaPK id) {
		this.id = id;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
		private InventarioPersonaPK id;
	    private Date fechaAlta;
	    private Persona persona;
	    private Inventario inventario;
	    
	    public InventarioPersonaDTO(){}
}
