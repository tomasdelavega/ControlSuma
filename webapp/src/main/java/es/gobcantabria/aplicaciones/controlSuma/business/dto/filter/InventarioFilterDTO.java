package es.gobcantabria.aplicaciones.controlSuma.business.dto.filter;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class InventarioFilterDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
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


	@Size(min=0 , max=100, message="Formato de Filtro incorrecto")
    private Long areaFuncional;
	
	
	@Size(min=0 , max=50, message="Formato de Filtro incorrecto")
    private String codInventario;
	
	@Size(min=0 , max=50, message="Formato de Filtro incorrecto")
    private String codJira;


	
	private Long responsableGob;
	private Long responsableSUMA;
	private Long tecnologia;
	
	
	public InventarioFilterDTO(){}
	
}
