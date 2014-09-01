package es.gobcantabria.aplicaciones.controlSuma.web.Enum;

import java.util.ArrayList;
import java.util.List;

public enum NivelIntegracionEnum {

	ALTO, 
	MEDIO,
	BAJO,
	NULO;
	
	
	
	@SuppressWarnings("unused")
	public final static List<String> getNivelIntegracion(){
		
		List<String> respuesta= new ArrayList<String>();
		respuesta.add(ALTO.toString());
		respuesta.add(MEDIO.toString());
		respuesta.add(BAJO.toString());
		respuesta.add(NULO.toString());

		return respuesta;
		
	}
}
