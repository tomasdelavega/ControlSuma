package es.gobcantabria.aplicaciones.controlSuma.business.dao.hibernate;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import es.gobcantabria.aplicaciones.controlSuma.business.dao.RolDAO;
import es.gobcantabria.aplicaciones.controlSuma.business.domain.Rol;

@Repository
public class RolDAOImpl extends GenericJpaDao<Rol,Serializable> implements RolDAO{

}
