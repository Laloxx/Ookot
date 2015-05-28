package mx.com.ookot.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "cat_instructores")
public class OpPagos implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPago;
	private ClClientes cliente;
	private BigDecimal importe;
	private Status status;
	private Date fechaPago;
	private Date fechaVencimiento;
	private OpClases clases;
	
	public OpPagos() {
	}

	public OpPagos(ClClientes cliente, BigDecimal importe,
			Status status, Date fechaPago, Date fechaVencimiento,
			OpClases clases) {
		this.cliente = cliente;
		this.importe = importe;
		this.status = status;
		this.fechaPago = fechaPago;
		this.fechaVencimiento = fechaVencimiento;
		this.clases = clases;
	}
	
	/**
	 * @return the idPago
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdPago", unique = true, nullable = false)
	public Integer getIdPago() {
		return idPago;
	}
	/**
	 * @param idPago the idPago to set
	 */
	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
	}
	/**
	 * @return the cliente
	 */
	public ClClientes getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClClientes cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the importe
	 */
	public BigDecimal getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return the fechaPago
	 */
	public Date getFechaPago() {
		return fechaPago;
	}
	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	/**
	 * @return the fechaVencimiento
	 */
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	/**
	 * @return the clases
	 */
	public OpClases getClases() {
		return clases;
	}
	/**
	 * @param clases the clases to set
	 */
	public void setClases(OpClases clases) {
		this.clases = clases;
	}
	

}
