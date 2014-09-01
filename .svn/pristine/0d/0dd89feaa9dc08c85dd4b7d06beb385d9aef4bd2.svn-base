package es.gobcantabria.aplicaciones.controlSuma.business.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * The persistent class for the TR_INVENTARIO_PERSONA database table.
 * 
 */
@Entity
@Table(name = "TR_INVENTARIO_PERSONA")
@NamedQueries({
@NamedQuery(name = "InventarioPersona.findAll", query = "SELECT i FROM InventarioPersona i"),
@NamedQuery(name = "InventarioPersona.findPersonaAplicacion", query = "select p from InventarioPersona p where p.inventario.id = :id"), })

public class InventarioPersona implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private InventarioPersonaPK id;

    @Column(name = "F_ALTA", columnDefinition = "Date")
    private Date fechaAlta;

    // bi-directional many-to-one association to Persona
    @ManyToOne
    @JoinColumn(name = "PER_X_PERSONA", insertable = false, updatable = false)
    private Persona persona;

    // bi-directional many-to-one association to Inventario
    @ManyToOne
    @JoinColumn(name = "INV_X_INVENTARIO", insertable = false, updatable = false)
    private Inventario inventario;

    public InventarioPersona() {
    }

    @PrePersist
    protected void onCreate() {
      this.fechaAlta = new Date();
    }

    
    
    public InventarioPersonaPK getId() {
	return this.id;
    }

    public void setId(InventarioPersonaPK id) {
	this.id = id;
    }

    public Date getFechaAlta() {
	return this.fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public Persona getPersona() {
	return this.persona;
    }

    public void setPersona(Persona persona) {
	this.persona = persona;
    }

    public Inventario getInventario() {
	return this.inventario;
    }

    public void setInventario(Inventario inventario) {
	this.inventario = inventario;
    }

}