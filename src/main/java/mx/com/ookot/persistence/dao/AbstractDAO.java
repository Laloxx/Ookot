package mx.com.ookot.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public abstract class AbstractDAO<T> {
	private Class<T> entity;

	public abstract SessionFactory getSessionFactory();
	
	public AbstractDAO (Class<T> entity){
		this.entity = entity;
	}
	
	public int save (T entity){
		int result = 1;
		
		try {
			 getSessionFactory().getCurrentSession().saveOrUpdate(entity);
			 result = 0;
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete (T entity){
		int result = 1;
		
		try {
			 getSessionFactory().getCurrentSession().delete(entity);
			 result = 0;
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public T find (Object id){
		T row = null;
		
		try {
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(entity);
			criteria.add(Restrictions.idEq(id));
			row = (T) criteria.uniqueResult();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return row;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		List<T> listRow = null;
		
		try {
			Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(entity);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			listRow = criteria.list();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return listRow;
	}
}
