package es.gobcantabria.aplicaciones.controlSuma.business.dao.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.PersonaDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Persona;
import es.gobcantabria.aplicaciones.controlSuma.business.dto.filter.PersonaFilterDTO;

@Repository
public class PersonaDAOImpl extends GenericJpaDao<Persona,Serializable> implements PersonaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonaDAOImpl.class);

	@Override
	public List<Persona> buscar(PersonaFilterDTO filtro) {
		// TODO Auto-generated method stub
		
		List<Persona> result = new ArrayList<Persona>();
		
		/* Consulta a ejecutar */
		String consulta; 
		/* Parámetros de la consulta*/
		HashMap<String, Object> parametros;
		/* Objetos de la Consulta */
		HashMap<String, Object> queryObjects;
		try{
			/* Obtenemos la consulta y parámetros */
			queryObjects = preparaConsulta(filtro);
			consulta = (String) queryObjects.get("consulta");
			parametros = (HashMap<String, Object>) queryObjects.get("parametros");
			
			/* Crear consulta */
			Query query = this.em.createQuery(consulta);
			/* Añadir parámetros */
			for (Object clave : parametros.keySet()) {
				String nombre = (String) clave;
				query.setParameter(nombre, parametros.get(nombre));
			}
			/* Devolvemos los resultados */
			result =  (ArrayList<Persona>) query.getResultList();
			return result;
		} catch(Exception ex) {
			LOGGER.error(ex.getMessage());
			return result;
		}
	}
	
	private HashMap<String, Object>  preparaConsulta(PersonaFilterDTO filtro) {
		/*Consulta a Generar*/
		String consulta;
		/*Parámetros de la Consulta*/
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		/*Objeto para devolver la consulta*/
		HashMap<String, Object> retorno = new HashMap<String, Object>();

		try {
			consulta = "SELECT p FROM Persona p";
			String sentWhere="";
			if(!filtro.getCodJira().equalsIgnoreCase("")){
				if (sentWhere.isEmpty()){
					sentWhere=" WHERE ";
				}else{
					sentWhere += " AND ";
				}
				sentWhere += " p.codJira= :codJira ";
				parametros.put ("codJira",filtro.getCodJira());
			}
			if(!filtro.getCodPersona().equalsIgnoreCase("")){
				if (sentWhere.isEmpty()){
					sentWhere = " WHERE ";
				}else{
					sentWhere += " AND ";
				}
				sentWhere+=" p.codPersona= :codPersona ";
				parametros.put("codPersona", filtro.getCodPersona());
			}
			if(filtro.getIdRol() > 0){
				if (sentWhere.isEmpty()){
					sentWhere = " WHERE ";
				}else{
					sentWhere += " AND ";
				}
				
				sentWhere += " p.rol.id= :idRol ";
				parametros.put("idRol", filtro.getIdRol());
			}
			if(!filtro.getNombre().equalsIgnoreCase("")){
				if (sentWhere.isEmpty()){
					sentWhere = " WHERE ";
				}else{
					sentWhere += " AND ";
				}
				//sentWhere += " p.nombre= :nombre ";
				sentWhere += "UPPER(p.nombre) LIKE :nombre";
				parametros.put("nombre", "%" + filtro.getNombre().toUpperCase() + "%");
			}
			if(!filtro.getPrimerApellido().equalsIgnoreCase("")){
				if (sentWhere.isEmpty()){
					sentWhere = " WHERE ";
				}else{
					sentWhere += " AND ";
				}
				sentWhere += "UPPER(p.primerApellido) LIKE :primerApellido";
				parametros.put("primerApellido", "%" + filtro.getPrimerApellido().toUpperCase() + "%");
			}
			if(!filtro.getSegundoApellido().equalsIgnoreCase("")){
				if (sentWhere.isEmpty()){
					sentWhere = " WHERE ";
				}else{
					sentWhere +=" AND ";
				}
				sentWhere += " UPPER(p.segundoApellido) LIKE :segundoApellido ";
				parametros.put("segundoApellido", "%" + filtro.getSegundoApellido().toUpperCase() + "%");
			}
			/*Devolvemos los objetos*/
			consulta += sentWhere;
			retorno.put("consulta", consulta);
			retorno.put("parametros", parametros);
			
			return retorno;
		}catch(Exception ex) {
			LOGGER.error(ex.getMessage());
			return retorno;
		}
	}
	

}
