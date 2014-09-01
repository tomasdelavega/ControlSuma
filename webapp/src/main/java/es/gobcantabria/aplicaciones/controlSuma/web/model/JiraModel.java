package es.gobcantabria.aplicaciones.controlSuma.web.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class JiraModel {

	
	private List<String> rolesSeleccionados;
	
	private List<String> projectSeleccionados;
	
	private Long UsuarioFinal;
	private Long analistafuncionalSUMA;
	private Long analistafuncionalGob;
	private Long desarrolladores;
	
	
	public JiraModel(){
		this.rolesSeleccionados= new ArrayList<String>();
		
	}


	public List<String> getRolesSeleccionados() {
		return this.rolesSeleccionados;
	}


	public void setRolesSeleccionados(List<String> rolesSeleccionados) {
		this.rolesSeleccionados = rolesSeleccionados;
	}


	public List<String> getProjectSeleccionados() {
		return projectSeleccionados;
	}


	public void setProjectSeleccionados(List<String> projectSeleccionados) {
		this.projectSeleccionados = projectSeleccionados;
	}


	public Long getUsuarioFinal() {
		return UsuarioFinal;
	}


	public void setUsuarioFinal(Long usuarioFinal) {
		UsuarioFinal = usuarioFinal;
	}


	public Long getAnalistafuncionalSUMA() {
		return analistafuncionalSUMA;
	}


	public void setAnalistafuncionalSUMA(Long analistafuncionalSUMA) {
		this.analistafuncionalSUMA = analistafuncionalSUMA;
	}


	public Long getAnalistafuncionalGob() {
		return analistafuncionalGob;
	}


	public void setAnalistafuncionalGob(Long analistafuncionalGob) {
		this.analistafuncionalGob = analistafuncionalGob;
	}


	public Long getDesarrolladores() {
		return desarrolladores;
	}


	public void setDesarrolladores(Long desarrolladores) {
		this.desarrolladores = desarrolladores;
	}
	
}
