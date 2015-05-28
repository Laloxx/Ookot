package mx.com.ookot.persistence.dao;

import mx.com.ookot.persistence.entity.MenuModuloSeguridad;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MenuModuloSeguridadDAO extends AbstractDAO<MenuModuloSeguridad>{

	@Autowired
	private SessionFactory sessionFactoryBc;
	
	public MenuModuloSeguridadDAO(){
		super(MenuModuloSeguridad.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}
}
