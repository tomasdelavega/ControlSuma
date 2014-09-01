package es.gobcantabria.aplicaciones.controlSuma.business.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the TB_TECNOLOGIAS database table.
 * 
 */
@Entity
@Table(name = "TB_TECNOLOGIA")
@NamedQuery(name = "Tecnologia.findAll", query = "SELECT t FROM Tecnologia t order by t.codTecnologia ASC")
public class Tecnologia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_TECNOLOGIAS_ID_GENERATOR")
    @SequenceGenerator(name = "TB_TECNOLOGIAS_ID_GENERATOR", sequenceName = "SEQ_TECNOLOGIA")
    @Column(name = "X_TECNOLOGIA", unique = true, nullable = false, precision = 5, scale = 0)
    private long id;

    @Column(name = "F_ALTA", columnDefinition = "Date")
    private Date fechaAlta;
    
    @Column(name = "F_ULT_MOD", columnDefinition = "Date")
    private Date fechaUltMod;

    @Column(name = "T_COD_TECNOLOGIA", unique = true, nullable = false, length = 30)
    private String codTecnologia;

    @Column(name = "T_DESCRIPCION", unique = false, nullable = true, length = 500)
    private String descripcion;
    
    @Column(name = "T_FRAMEWORK", unique = false, nullable = true, length = 500)
    private String framework;

    public Tecnologia() {
    }

    
    @PrePersist
    protected void onCreate() {
      this.fechaAlta = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    	this.fechaUltMod = new Date();
    }
    
    public long getId() {
	return this.id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public Date getFechaAlta() {
	return this.fechaAlta;
    }

    public String getCodTecnologia() {
	return this.codTecnologia;
    }

    public String getDescripcion() {
	return this.descripcion;
    }
    
    public String getFramework() {
    	return this.framework;
    }

    public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public void setCodTecnologia(String codTecnologia) {
	this.codTecnologia = codTecnologia;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}
    
	public void setFramework(String framework) {
		this.framework = framework;
	}

}