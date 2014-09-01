package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.util.Date;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.InventarioPersonaPK;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.EntornoDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.InventarioPersonaDTO;

public class InventarioPersonaModel {
	
	public InventarioPersonaModel(InventarioPersonaDTO inventarioPersona) {

		this.id = inventarioPersona.getId();
		this.fechaAlta=inventarioPersona.getFechaAlta();
		this.inventario=inventarioPersona.getInventario();
		this.persona=inventarioPersona.getPersona();
		

	}
	
	
	
	
	
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
    
}
