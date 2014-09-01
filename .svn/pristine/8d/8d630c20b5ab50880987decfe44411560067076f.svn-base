package es.gobcantabria.aplicaciones.controlSuma.business.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@DynamicUpdate(true)
@SelectBeforeUpdate(true)
@Table(name = "TB_ROL")
@NamedQueries({
@NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
@NamedQuery(name = "Rol.findbyNombre", query = "SELECT r FROM Rol r WHERE r.nombre=:nombre"),
@NamedQuery(name = "Rol.findbyCodJira", query = "SELECT r FROM Rol r WHERE r.codJira=:codJira"),

})
public class Rol implements Serializable{


	private static final long serialVersionUID = -7933348516625840336L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_ROL_ID_GENERATOR")
    @SequenceGenerator(name = "TB_ROL_ID_GENERATOR", sequenceName = "SEQ_ROL")
    @Column(name = "X_ROL", unique = true, nullable = false, precision = 8, scale = 0)
    private Long id;

    
    @Column(name = "T_ROL", unique = false, nullable = true, length = 50)
    private String nombre;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "F_ALTA", columnDefinition = "Date")
    private Date fechaAlta;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "F_ULT_MOD", columnDefinition = "Date")
    private Date fechaUltMod;
    
    @Column(name = "T_DESCRIPCION", unique = false, nullable = true, length = 200)
    private String descripcion;
	
    @Column(name = "N_CODJIRA", unique = true, nullable = false, precision = 8, scale = 0)
    private Long codJira;
    
    public Rol(){
    
    }

    @PrePersist
    protected void onCreate() {
      this.fechaAlta = new Date();
      this.fechaUltMod = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
      this.fechaUltMod = new Date();
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
    
    
}
