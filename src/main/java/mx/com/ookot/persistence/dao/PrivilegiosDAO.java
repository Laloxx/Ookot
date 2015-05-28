package mx.com.ookot.persistence.dao;

import mx.com.ookot.persistence.entity.Privilegios;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PrivilegiosDAO extends AbstractDAO<Privilegios> {

	@Autowired
	SessionFactory sessionFactoryBc;
	
	public PrivilegiosDAO(){
		super(Privilegios.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}

}
