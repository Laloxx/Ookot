package mx.com.ookot.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Generated 25/05/2015 01:43:56 PM by Hibernate Tools 4.0.0

/**
 * Privilegios generated by hbm2java
 */
@Entity
@Table(name = "privilegios")
public class Privilegios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPrivilegio;
	private Roles roles;
	private ModulosSeguridad modulosSeguridad;
	private StatusSeguridad statusSeguridad;

	public Privilegios() {
	}

	public Privilegios(Roles roles, ModulosSeguridad modulosSeguridad,
			StatusSeguridad statusSeguridad) {
		this.roles = roles;
		this.modulosSeguridad = modulosSeguridad;
		this.statusSeguridad = statusSeguridad;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRIVILEGIO", unique = true, nullable = false)
	public Integer getIdPrivilegio() {
		return this.idPrivilegio;
	}

	public void setIdPrivilegio(Integer idPrivilegio) {
		this.idPrivilegio = idPrivilegio;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ROL", nullable = false)
	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MODULO", nullable = false)
	public ModulosSeguridad getModulosSeguridad() {
		return this.modulosSeguridad;
	}

	public void setModulosSeguridad(ModulosSeguridad modulosSeguridad) {
		this.modulosSeguridad = modulosSeguridad;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STATUS", nullable = false)
	public StatusSeguridad getStatusSeguridad() {
		return this.statusSeguridad;
	}

	public void setStatusSeguridad(StatusSeguridad statusSeguridad) {
		this.statusSeguridad = statusSeguridad;
	}

}
