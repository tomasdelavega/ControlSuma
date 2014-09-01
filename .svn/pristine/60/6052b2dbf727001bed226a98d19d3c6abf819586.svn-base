package es.gobcantabria.aplicaciones.controlSuma.util;

import java.net.MalformedURLException;

import org.springframework.context.annotation.Configuration;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.PersonaDTO;
import es.gobcantabria.aplicaciones.jirawsuma.dto.JiraConfiguracion;

@Configuration
public class Utilidades {

	private static JiraConfiguracion configuracionJira;

	public static JiraConfiguracion getinstanceJiraconfiguration() {
		if (configuracionJira == null) {
			configuracionJira = new JiraConfiguracion();
			try {
				configuracionJira.cargarDefault();

			} catch (MalformedURLException e) {

			}
		}
		return configuracionJira;
	}

	public static PersonaDTO convertirNombre(String fullname, PersonaDTO per) {

		String[] nombre = fullname.split(" ");
		if (nombre.length == 3) {
			per.setNombre(nombre[0]);
			per.setPrimerApellido(nombre[1]);
			per.setSegundoApellido(nombre[2]);
		} else if (nombre.length == 2) {
			per.setNombre(nombre[0]);
			per.setPrimerApellido(nombre[1]);
			per.setSegundoApellido("");

		} else if (nombre.length > 3) {
			String nom = "";
			for (int i = 0; i < nombre.length - 2; i++)
				nom = nom +" "+ nombre[i];

			per.setNombre(nom);
			per.setPrimerApellido(nombre[nombre.length - 2]);
			per.setSegundoApellido(nombre[nombre.length - 1]);
		} else {
			String nom = "";
			for (int i = 0; i < nombre.length - 2; i++)
				nom = nom + nombre[i];
			per.setNombre(nom);
		}

		return per;

	}
}
