package es.gobcantabria.aplicaciones.controlSuma.business.service;

import java.util.List;

import es.gobcantabria.aplicaciones.controlSuma.business.dto.TecnologiaDTO;
import es.gobcantabria.aplicaciones.controlSuma.exception.ControlSumaException;

public interface TecnologiaService {

	
	/**
	 * Método que devuelve todas la Tecnología que existen en el sistema
	 * @return
	 */
	public List<TecnologiaDTO> findAll ();
	public TecnologiaDTO getById(Long id);
	public void createTecnologia(TecnologiaDTO dto)throws ControlSumaException;
	public void updateTecnologia(TecnologiaDTO dto)throws ControlSumaException;
	public void deleteTecnologia(Long id);
}
