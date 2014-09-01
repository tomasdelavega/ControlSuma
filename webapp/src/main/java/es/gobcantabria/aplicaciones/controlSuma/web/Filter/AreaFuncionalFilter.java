package es.gobcantabria.aplicaciones.controlSuma.web.Filter;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Size;

public class AreaFuncionalFilter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(min=0,max=8,message="Formato de Filtro Incorrecto")
	private Long id;
	@Size(min=0,max=100,message="Formato de Filtro Incorrecto")
    private String nombre;
	
	public AreaFuncionalFilter(){}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
