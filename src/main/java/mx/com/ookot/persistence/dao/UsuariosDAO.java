package mx.com.ookot.persistence.dao;


import java.util.List;

import mx.com.ookot.persistence.entity.StatusSeguridad;
import mx.com.ookot.persistence.entity.Usuarios;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuariosDAO extends AbstractDAO<Usuarios> {

	@Autowired
	SessionFactory sessionFactoryBc;
	
	public UsuariosDAO(){
		super(Usuarios.class);
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactoryBc;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactoryBc = sessionFactory;
	}
	
	public Usuarios findUsuarioByUsuario (String usuario){
		Usuarios user = null;

        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuarios.class);
            criteria.add(Restrictions.eq("usuario", usuario));
            user = (Usuarios) criteria.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuarios> findUsuariosByStatus(StatusSeguridad status) {
		List<Usuarios> listaUsuarios = null;

        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuarios.class);
            criteria.add(Restrictions.eq("statusSeguridad", status));
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            listaUsuarios = criteria.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaUsuarios;
	}
}
