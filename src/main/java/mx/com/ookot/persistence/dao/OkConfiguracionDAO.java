package mx.com.ookot.persistence.dao;


import mx.com.ookot.persistence.entity.OkConfiguracion;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OkConfiguracionDAO extends AbstractDAO<OkConfiguracion> {
	
	@Autowired
	private SessionFactory sessionFactoryBc;

	public OkConfiguracionDAO (){
		super(OkConfiguracion.class);
	}

	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}
}