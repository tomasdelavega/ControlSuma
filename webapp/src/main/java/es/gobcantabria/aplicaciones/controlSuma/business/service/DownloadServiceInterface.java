package es.gobcantabria.aplicaciones.controlSuma.business.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import es.gobcantabria.aplicaciones.controlSuma.util.Fichero;

public interface DownloadServiceInterface {

	public void visualizar(Fichero fichero, HttpServletResponse response)
			throws IOException;
}
