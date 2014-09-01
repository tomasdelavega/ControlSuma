package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.RolDTO;

public class RolModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min=1, max=50,message="Debe tener entre 1 y 50 caracteres")
	private String nombre;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaUltMod;
	@Size(min=0, max=200, message="Debe tener entre 0 y 200 caracteres")
	private String descripcion;
	
	public RolModel (){}
	
	public RolModel (RolDTO dto){
		this.setId(dto.getId());
		this.setNombre(dto.getNombre());
		this.setFechaUltMod(dto.getFechaUltMod());
		this.setDescripcion(dto.getDescripcion());
	}
	public RolDTO convert(){
		RolDTO dto = new RolDTO();
		dto.setId(this.getId());
		dto.setNombre(this.getNombre());
		dto.setFechaUltMod(this.getFechaUltMod());
		dto.setDescripcion(this.getDescripcion());
		return dto;
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

	public Date getFechaUltMod() {
		return fechaUltMod;
	}

	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
