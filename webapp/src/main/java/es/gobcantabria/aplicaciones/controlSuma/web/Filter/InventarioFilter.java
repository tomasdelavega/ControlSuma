package es.gobcantabria.aplicaciones.controlSuma.web.Filter;

import java.io.Serializable;

import javax.validation.constraints.Size;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.InventarioFilterDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;

/**
 * Clase Filter para las páginas de búsqueda de Inventario
 * 
 * @author malba
 * 
 */

public class InventarioFilter implements Serializable {

	private Long areaFuncional;
	private Long responsableGob;
	private Long responsableSUMA;
	private Long tecnologia;
	@Size(min = 0, max = 50, message = "Introduzca de 0 a 50 caracteres")
	private String codInventario;
	@Size(min = 0, max = 50, message = "Introduzca de 0 a 50 caracteres")
	private String codJira;

	public InventarioFilter() {
	}

	public Long getAreaFuncional() {
		return areaFuncional;
	}

	public void setAreaFuncional(Long areaFuncional) {
		this.areaFuncional = areaFuncional;
	}

	public String getCodInventario() {
		return codInventario;
	}

	public void setCodInventario(String codInventario) {
		this.codInventario = codInventario;
	}

	public String getCodJira() {
		return codJira;
	}

	public void setCodJira(String codJira) {
		this.codJira = codJira;
	}

	public Long getResponsableGob() {
		return responsableGob;
	}

	public void setResponsableGob(Long responsableGob) {
		this.responsableGob = responsableGob;
	}

	public Long getResponsableSUMA() {
		return responsableSUMA;
	}

	public void setResponsableSUMA(Long responsableSUMA) {
		this.responsableSUMA = responsableSUMA;
	}

	public Long getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(Long tecnologia) {
		this.tecnologia = tecnologia;
	}

	public InventarioFilterDTO convert() {
		InventarioFilterDTO dto = new InventarioFilterDTO();
		dto.setAreaFuncional(this.areaFuncional);
		dto.setCodInventario(this.codInventario);
		dto.setCodJira(this.codJira);
		dto.setResponsableGob(this.responsableGob);
		dto.setResponsableSUMA(this.responsableSUMA);
		dto.setTecnologia(this.tecnologia);
		return dto;
	}
	/*
	public Boolean filtrar() {
		if (this.areaFuncional == 0 && this.responsableGob == 0
				&& this.responsableSUMA == 0 && this.tecnologia == 0
				&& this.codInventario == "" && this.codJira == "") {
			return false;
		} else {
			return true;
		}
	}
	*/
}
