package mx.com.ookot.model;

import java.io.Serializable;

import mx.com.ookot.model.dao.Dao;
import mx.com.ookot.model.domain.Dominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@SuppressWarnings("serial")
@Service
public class Servicio implements Serializable {

	@Autowired
	private Dao dao;
	
	public void persisDominio(Dominio dominio){
		this.dao.persist(dominio);
	}
}
