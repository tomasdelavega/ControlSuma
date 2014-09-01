package es.gobcantabria.aplicaciones.controlSuma.business.dao;

import java.io.Serializable;
import java.util.List;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;



/**
 * @author tdevegaa
 *
 */
public interface PersonaDAO extends IDaoGenericInterface<Persona,Serializable>{

	public List<Persona> buscar(PersonaFilterDTO filtro);
}
