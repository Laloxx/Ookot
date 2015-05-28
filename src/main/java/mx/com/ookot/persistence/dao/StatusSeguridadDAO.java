package mx.com.ookot.persistence.dao;

import mx.com.ookot.persistence.entity.StatusSeguridad;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatusSeguridadDAO extends AbstractDAO<StatusSeguridad> {

	@Autowired
	SessionFactory sessionFactoryBc;
	
	public StatusSeguridadDAO(){
		super(StatusSeguridad.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}
	
	public StatusSeguridad findStatusByDescripcion(String statusDesc) {
		StatusSeguridad status = null;

        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(StatusSeguridad.class);
            criteria.add(Restrictions.eq("descripcion", statusDesc));
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            status = (StatusSeguridad) criteria.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
	}
}