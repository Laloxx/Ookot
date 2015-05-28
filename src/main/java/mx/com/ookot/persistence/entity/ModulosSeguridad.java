package mx.com.ookot.persistence.entity;

// Generated 25/05/2015 01:43:56 PM by Hibernate Tools 4.0.0

import java.beans.Transient;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModulosSeguridad generated by hbm2java
 */
@Entity
@Table(name = "modulos_seguridad")
public class ModulosSeguridad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idModulo;
	private MenuModuloSeguridad menuModuloSeguridad;
	private StatusSeguridad statusSeguridad;
	private String descripcion;
	private String etiqueta;
	private String icono;
	private String url;
	private int visible;
	private Set<Privilegios> privilegioses = new HashSet<Privilegios>(0);
    private Boolean selected;

    @Transient
    public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	public ModulosSeguridad() {
	}

	public ModulosSeguridad(MenuModuloSeguridad menuModuloSeguridad,
			StatusSeguridad statusSeguridad, String descripcion,
			String etiqueta, String icono, String url, int visible) {
		this.menuModuloSeguridad = menuModuloSeguridad;
		this.statusSeguridad = statusSeguridad;
		this.descripcion = descripcion;
		this.etiqueta = etiqueta;
		this.icono = icono;
		this.url = url;
		this.visible = visible;
	}

	public ModulosSeguridad(MenuModuloSeguridad menuModuloSeguridad,
			StatusSeguridad statusSeguridad, String descripcion,
			String etiqueta, String icono, String url, int visible,
			Set<Privilegios> privilegioses) {
		this.menuModuloSeguridad = menuModuloSeguridad;
		this.statusSeguridad = statusSeguridad;
		this.descripcion = descripcion;
		this.etiqueta = etiqueta;
		this.icono = icono;
		this.url = url;
		this.visible = visible;
		this.privilegioses = privilegioses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MODULO", unique = true, nullable = false)
	public Integer getIdModulo() {
		return this.idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MENU", nullable = false)
	public MenuModuloSeguridad getMenuModuloSeguridad() {
		return this.menuModuloSeguridad;
	}

	public void setMenuModuloSeguridad(MenuModuloSeguridad menuModuloSeguridad) {
		this.menuModuloSeguridad = menuModuloSeguridad;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STATUS", nullable = false)
	public StatusSeguridad getStatusSeguridad() {
		return this.statusSeguridad;
	}

	public void setStatusSeguridad(StatusSeguridad statusSeguridad) {
		this.statusSeguridad = statusSeguridad;
	}

	@Column(name = "DESCRIPCION", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "ETIQUETA", nullable = false, length = 45)
	public String getEtiqueta() {
		return this.etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Column(name = "ICONO", nullable = false, length = 500)
	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	@Column(name = "URL", nullable = false, length = 500)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "VISIBLE", nullable = false)
	public int getVisible() {
		return this.visible;
	}

	public void setVisible(int visible) {
		this.visible = visible;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "modulosSeguridad")
	public Set<Privilegios> getPrivilegioses() {
		return this.privilegioses;
	}

	public void setPrivilegioses(Set<Privilegios> privilegioses) {
		this.privilegioses = privilegioses;
	}

}