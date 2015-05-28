package mx.com.ookot.model.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dominio implements Serializable {

	private int id;
	private String nombre;		
	
	public Dominio() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Dominio(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", nombre=" + nombre + "]";
	}
		
}
