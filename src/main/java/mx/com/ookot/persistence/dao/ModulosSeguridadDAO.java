package mx.com.ookot.persistence.dao;

import mx.com.ookot.persistence.entity.ModulosSeguridad;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ModulosSeguridadDAO extends AbstractDAO<ModulosSeguridad> {

	@Autowired
	SessionFactory sessionFactoryBc;
	
	public ModulosSeguridadDAO(){
		super(ModulosSeguridad.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}

}
