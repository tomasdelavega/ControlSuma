package es.gobcantabria.aplicaciones.controlSuma.business.dao;

import java.io.Serializable;
import java.util.List;

import es.gobcantabria.aplicaciones.controlSuma.business.domain.Inventario;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.InventarioFilterDTO;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;


/**
 * @author malba
 *
 */
public interface InventarioDAO  extends IDaoGenericInterface<Inventario, Serializable>{



//	/**
//	 * Método que devuelve todos los inventarios que están activos en el sistema
//	 * @return
//	 */
//	public List<Inventario> findByActivo ();
	
	public List<Inventario> buscar(InventarioFilterDTO filtro);

	
}
