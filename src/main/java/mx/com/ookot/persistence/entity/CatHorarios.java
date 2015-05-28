package mx.com.ookot.persistence.entity;

// Generated 25/05/2015 01:43:56 PM by Hibernate Tools 4.0.0

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CatHorarios generated by hbm2java
 */
@Entity
@Table(name = "cat_horarios")
public class CatHorarios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idHorario;
	private Status status;
	private String horario;

	public CatHorarios() {
	}

	public CatHorarios(int idHorario, Status status, String horario) {
		this.idHorario = idHorario;
		this.status = status;
		this.horario = horario;
	}

	public CatHorarios(int idHorario, Status status, String horario,
			Set<OpClases> opClaseses) {
		this.idHorario = idHorario;
		this.status = status;
		this.horario = horario;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdHorario", unique = true, nullable = false)
	public int getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdStatus", nullable = false)
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "Horario", nullable = false, length = 45)
	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}