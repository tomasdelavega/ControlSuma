package es.gobcantabria.aplicaciones.controlSuma.business.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.AreaFuncional;

@Component
public class InventarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date fechaAlta;
    private Date fechaUltMod;
    private int activo;
    private String subAreaFuncional;
    private String codInventario;
    private String codJira;
    private String descripcion;
    private String nombreInventario;
    private String observaciones;
    private String version;
    private List<EntornoDTO> entornos;
    private PersonaDTO responsableSUMA;
    private AreaFuncionalDTO areaFuncional;
    private PersonaDTO usuarioFinal;
    private PersonaDTO responsableGob;
    private TecnologiaDTO tecnologia;
    private InventarioOtrasDTO inventarioOtra;
    private List<PersonaDTO> desarrolladores;
   
	public Long getIdResponsableSUMA() {
		return idResponsableSUMA;
	}

	public void setIdResponsableSUMA(Long idResponsableSUMA) {
		this.idResponsableSUMA = idResponsableSUMA;
	}

	public Long getIdResponsableGob() {
		return idResponsableGob;
	}

	public void setIdResponsableGob(Long idResponsableGob) {
		this.idResponsableGob = idResponsableGob;
	}

	public Long getIdUsuarioFinal() {
		return idUsuarioFinal;
	}

	public void setIdUsuarioFinal(Long idUsuarioFinal) {
		this.idUsuarioFinal = idUsuarioFinal;
	}

	private Long idResponsableSUMA;
	private Long idResponsableGob;
	private Long idUsuarioFinal;
    // private Collection<ItemOrdenacion> ItemsOrdenacion;


	public InventarioDTO() {
    }

    public long getId() {
	return id;
    }

    public Date getFechaAlta() {
	return fechaAlta;
    }

    public Date getFechaUltMod() {
	return fechaUltMod;
    }

    public int getActivo() {
	return activo;
    }

    public AreaFuncionalDTO getAreaFuncional() {
	return areaFuncional;
    }

    public String getCodInventario() {
	return codInventario;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public String getNombreInventario() {
	return nombreInventario;
    }

    public String getObservaciones() {
	return observaciones;
    }

    public String getVersion() {
	return version;
    }

    public List<EntornoDTO> getEntornos() {
	return entornos;
    }

    public PersonaDTO getResponsableSUMA() {
	return responsableSUMA;
    }

    public PersonaDTO getUsuarioFinal() {
	return usuarioFinal;
    }

    public PersonaDTO getResponsableGob() {
	return responsableGob;
    }

    public TecnologiaDTO getTecnologia() {
	return tecnologia;
    }

    public InventarioOtrasDTO getInventarioOtra() {
	return inventarioOtra;
    }

    public List<PersonaDTO> getDesarrolladores() {
	return desarrolladores;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setFechaAlta(Date fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public void setFechaUltMod(Date fechaUltMod) {
	this.fechaUltMod = fechaUltMod;
    }

    public void setActivo(int activo) {
	this.activo = activo;
    }

    public void setAreaFuncional(AreaFuncionalDTO areaFuncional) {
	this.areaFuncional = areaFuncional;
    }

    public void setCodInventario(String codInventario) {
	this.codInventario = codInventario;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String getSubAreaFuncional() {
		return subAreaFuncional;
	}

	public void setSubAreaFuncional(String subAreaFuncional) {
		this.subAreaFuncional = subAreaFuncional;
	}

	public void setNombreInventario(String nombreInventario) {
	this.nombreInventario = nombreInventario;
    }

    public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public void setEntornos(List<EntornoDTO> entornos) {
	this.entornos = entornos;
    }

    public void setResponsableSUMA(PersonaDTO responsableSUMA) {
	this.responsableSUMA = responsableSUMA;
    }

    public void setUsuarioFinal(PersonaDTO usuarioFinal) {
	this.usuarioFinal = usuarioFinal;
    }

    public void setResponsableGob(PersonaDTO responsableGob) {
	this.responsableGob = responsableGob;
    }

    public void setTecnologia(TecnologiaDTO tecnologia) {
	this.tecnologia = tecnologia;
    }

    public void setInventarioOtra(InventarioOtrasDTO inventarioOtra) {
	this.inventarioOtra = inventarioOtra;
    }

    public void setDesarrolladores(List<PersonaDTO> desarrolladores) {
	this.desarrolladores = desarrolladores;
    }

	public String getCodJira() {
		return codJira;
	}

	public void setCodJira(String codJira) {
		this.codJira = codJira;
	}
    

}
