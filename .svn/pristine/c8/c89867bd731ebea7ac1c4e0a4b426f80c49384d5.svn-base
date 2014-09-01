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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "TB_AREA_FUNCIONAL")
@NamedQuery(name = "AreaFuncional.findAll", query = "SELECT a FROM AreaFuncional a order by a.nombre ASC")
public class AreaFuncional implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_AREAFUNCIONAL_ID_GENERATOR")
	    @SequenceGenerator(name = "TB_AREAFUNCIONAL_ID_GENERATOR", sequenceName = "SEQ_AREA_FUNCIONAL")
	    @Column(name = "X_AREA_FUNCIONAL", unique = true, nullable = false, precision = 8, scale = 0)
	    private Long id;

	    
	    @Column(name = "T_AREA_FUNCIONAL", unique = false, nullable = true, length = 100)
	    private String nombre;
		
	    
	    @Column(name = "F_ALTA", columnDefinition = "Date")
	    private Date fechaAlta;
	    
	    @Column(name = "F_ULT_MOD", columnDefinition = "Date")
	    private Date fechaUltMod;
	
	    public AreaFuncional(){
	    	
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
	    
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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
	    
		
}
