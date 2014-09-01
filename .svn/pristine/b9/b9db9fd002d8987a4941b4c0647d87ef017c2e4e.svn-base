package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;

public class TecnologiaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	@Size(min = 1, max = 50, message = "Debe tener entre 1 y 50 caracteres")
	private String codTecnologia;
	@Size(min = 0, max = 500, message = "Formato de Tecnolog&iacute;a Incorrecto")
	private String descripcion;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltMod;
	@Size(min = 0, max = 500, message = "Máximo 500 caracteres")
	private String framework;

	public TecnologiaModel() {
	}

	public TecnologiaModel(TecnologiaDTO dto) {
		this.setId(dto.getId());
		this.setCodTecnologia(dto.getCodTecnologia());
		this.setDescripcion(dto.getDescripcion());
		this.setFechaUltMod(dto.getFechaUltMod());
		this.setFramework(dto.getFramework());
	}

	public TecnologiaDTO convert() {
		TecnologiaDTO dto = new TecnologiaDTO();
		dto.setId(this.getId());
		dto.setCodTecnologia(this.getCodTecnologia());
		dto.setDescripcion(this.getDescripcion());
		dto.setFechaUltMod(this.getFechaUltMod());
		dto.setFramework(this.getFramework());
		return dto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodTecnologia() {
		return codTecnologia;
	}

	public void setCodTecnologia(String codTecnologia) {
		this.codTecnologia = codTecnologia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

}
