package es.gobcantabria.aplicaciones.controlSuma.business.dao;
     
import java.io.Serializable;
import java.util.List;


/** 
 * Interfaz con las operaciones de un dao generico 
 * @author Grupo JEE
 *
 * @param <T>
 * @param <P>
 */
public interface IDaoGenericInterface<T, P extends Serializable> {
	
	/**
	 * crear una nueva entidad t del tipo T
	 */
    T create(T t);
    
    /**
     * borrar entidad por su id
     */
    boolean delete(Object id);
    
    /** 
     * encontrar una entidad por su id
     */
    T find(Object id);
    
    /** 
     * actualiza objeto t de tipo T
     */
    T update(T t);  
    
    /**
     * cuenta el numero de registros existentes en la entidad
     */
    long count();
    
	/**
	 * Ejecuta una instrucción SQL
	 * 
	 * @param namedQuery
	 *            Instrucción SQL a ejecutar
	 * @return Resultado de la consulta
	 * @throws IllegalStateException
	 *             Excepción de estado ilegal
	 * @throws IllegalArgumentException
	 *             Excepción de argumento ilegal
	 */
	public List<T> executeQuery(final String namedQuery)
			throws IllegalStateException, IllegalArgumentException;

	/**
	 * Ejecuta una instrucción SQL recibiendo parámetros
	 * 
	 * @param namedQuery
	 *            Instrucción SQL a ejecutar
	 * @param params
	 *            Parámetros de la consulta
	 * @return Resultado de la consulta
	 * @throws IllegalStateException
	 *             Excepción de estado ilegal
	 * @throws IllegalArgumentException
	 *             Excepción de argumento ilegal
	 */
	public List<T> executeQueryWithParam(final String namedQuery,
			final Object[] params) throws IllegalStateException,
			IllegalArgumentException;

	public List<T> executeQueryFindClaveAjena(final String namedQuery, final Object[] params);

}
