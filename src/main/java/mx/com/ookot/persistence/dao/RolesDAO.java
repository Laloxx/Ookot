package mx.com.ookot.persistence.dao;

import java.util.List;

import mx.com.ookot.persistence.entity.StatusSeguridad;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gwt.aria.client.Roles;

@Repository
public class RolesDAO extends AbstractDAO<Roles> {

	@Autowired
	SessionFactory sessionFactoryBc;
	
	public RolesDAO(){
		super(Roles.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Roles> findRolesByStatus(StatusSeguridad status) {
		List<Roles> listaRoles = null;

        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Roles.class);
            criteria.add(Restrictions.eq("statusSeguridad", status));
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            listaRoles = criteria.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaRoles;
	}

	public Roles findRolesByDescripcion(String rolDesc) {
		Roles rol = null;

        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Roles.class);
            criteria.add(Restrictions.eq("descripcion", rolDesc));
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            rol = (Roles) criteria.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rol;
	}

}