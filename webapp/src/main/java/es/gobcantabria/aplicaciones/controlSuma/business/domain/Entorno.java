package es.gobcantabria.aplicaciones.controlSuma.business.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the TB_ENTORNO database table.
 * 
 */
@Entity
@Table(name = "TB_ENTORNO")

@NamedQueries({
	@NamedQuery(name = "Entorno.findAll", query = "SELECT e FROM Entorno e"),
	@NamedQuery(name = "Entorno.findEntornoAplicacion", query = "select e from Entorno e where e.inventario.id = :id"), })


public class Entorno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TB_ENTORNO_XENTORNO_GENERATOR", sequenceName = "SEQ_ENTORNO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_ENTORNO_XENTORNO_GENERATOR")
    @Column(name = "X_ENTORNO", unique = true, nullable = false, precision = 5, scale = 0)
    private Long id;

    @Column(name = "F_ALTA", columnDefinition = "Date")
    private Date fechaAlta;

    @Column(name = "F_ULT_MOD", columnDefinition = "Date")
    private Date fechaUltMod;

    @Column(name = "T_CONF_LDAP", unique = false, nullable = true, length = 300)
    private String confLdap;

    @Column(name = "T_DATOS_BBDD", unique = false, nullable = true, length = 300)
    private String datosBbdd;

    @Column(name = "T_ENTORNO", unique = false, nullable = true, length = 3)
    private String tEntorno;

    @Column(name = "T_FRAMEWORKS", unique = false, nullable = true, length = 300)
    private String frameworks;

    @Column(name = "T_HERRAMIENTA_CONSTRUCCION", unique = false, nullable = true, length = 100)
    private String herramientaConstruccion;

    @Column(name = "T_OBSERVACIONES", unique = false, nullable = true, length = 500)
    private String observaciones;

    @Column(name = "T_RUTA_LOG", unique = false, nullable = true, length = 300)
    private String rutaLog;

    @Column(name = "T_RUTA_SVN", unique = false, nullable = true, length = 300)
    private String rutaSvn;

    @Column(name = "T_SERVIDOR_DESPLIEGUE", unique = false, nullable = true, length = 500)
    private String servidorDespliegue;

    @Column(name = "T_URL", unique = false, nullable = true, length = 300)
    private String url;

    @Column(name = "T_VERSION_JAVA", unique = false, nullable = true, length = 50)
    private String versionJava;

    // bi-directional many-to-one association to Inventario
    @ManyToOne
    @JoinColumn(name = "INV_X_INVENTARIO")
    private Inventario inventario;

    public Entorno() {
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

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public Date getFechaultMod() {
		return fechaUltMod;
	}

	public String getConfLdap() {
		return confLdap;
	}

	public String getDatosBbdd() {
		return datosBbdd;
	}

	public String gettEntorno() {
		return tEntorno;
	}

	public String getFrameworks() {
		return frameworks;
	}

	public String getHerramientaConstruccion() {
		return herramientaConstruccion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getRutaLog() {
		return rutaLog;
	}

	public String getRutaSvn() {
		return rutaSvn;
	}

	public String getServidorDespliegue() {
		return servidorDespliegue;
	}

	public String getUrl() {
		return url;
	}

	public String getVersionJava() {
		return versionJava;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setId(Long id) {
	this.id = id;
    }

    public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public void setFechaultMod(Date fechaultMod) {
	this.fechaUltMod = fechaultMod;
    }

    public void setConfLdap(String confLdap) {
	this.confLdap = confLdap;
    }

    public void setDatosBbdd(String datosBbdd) {
	this.datosBbdd = datosBbdd;
    }

    public void settEntorno(String tEntorno) {
	this.tEntorno = tEntorno;
    }

    public void setFrameworks(String frameworks) {
	this.frameworks = frameworks;
    }

    public void setHerramientaConstruccion(String herramientaConstruccion) {
	this.herramientaConstruccion = herramientaConstruccion;
    }

    public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
    }

    public void setRutaLog(String rutaLog) {
	this.rutaLog = rutaLog;
    }

    public void setRutaSvn(String rutaSvn) {
	this.rutaSvn = rutaSvn;
    }

    public void setServidorDespliegue(String servidorDespliegue) {
	this.servidorDespliegue = servidorDespliegue;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public void setVersionJava(String versionJava) {
	this.versionJava = versionJava;
    }

    public void setInventario(Inventario inventario) {
	this.inventario = inventario;
    }

}