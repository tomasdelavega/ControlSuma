package es.gobcantabria.aplicaciones.controlSuma.business.service.impl;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import es.gobcantabria.aplicaciones.controlSuma.business.service.DownloadServiceInterface;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;
import es.gobcantabria.aplicaciones.controlSuma.util.Fichero;

@Service
public class DownloadServiceImpl implements DownloadServiceInterface {

	/**
	 * 
	 * 
	 * @param fichero
	 * @param response
	 * @throws ControlSumaException
	 * @throws IOException
	 */
	public void visualizar(Fichero fichero, HttpServletResponse response)
			throws IOException {

		OutputStream outs = response.getOutputStream();

		/* Cadena de salida */
		try {
			response.setContentType(fichero.getMimeType());
			response.setHeader("Content-Transfer-Encoding", "Binary");
			response.setHeader("Content-disposition", "inline; filename=\""
					+ fichero.getNombre() + "\"");

			// Pasar el archivo a la salida
			outs.write(fichero.getContenido(), 0, fichero.getContenido().length);

		} catch (IOException e) {
			throw new IOException("No se ha podido descargar el fichero "
					+ e.getMessage(), e);
		} finally {
			outs.close();
		}
	}

}
