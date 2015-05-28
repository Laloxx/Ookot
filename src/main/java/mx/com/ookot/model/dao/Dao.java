package mx.com.ookot.model.dao;

import java.io.Serializable;

import mx.com.ookot.model.domain.Dominio;
import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")
@Repository
public class Dao implements Serializable{

	private int id = 0;
	
	public void persist(Dominio dominio){
		id++;
		dominio.setId(id);
		System.out.println(dominio.toString());
	}
}
