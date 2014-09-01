package es.gobcantabria.aplicaciones.controlSuma.web.Enum;

import java.util.ArrayList;
import java.util.List;

public enum NivelIncidenciaEnum {

	CRÍTICO, 
	MEDIO,
	BAJO,
	NULO;
	
	
	
	@SuppressWarnings("unused")
	public final static List<String> getNivelIncidencias(){
		
		List<String> respuesta= new ArrayList<String>();
		respuesta.add(CRÍTICO.toString());
		respuesta.add(MEDIO.toString());
		respuesta.add(BAJO.toString());
		respuesta.add(NULO.toString());

		return respuesta;
		
	}
}
