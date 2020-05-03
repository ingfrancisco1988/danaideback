package ar.com.prueba.danaide.prueba.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "venta")
public class Ventas implements Serializable {

 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	@Column(name="monto_pagado_neto")
	private Double montoPagadoN;
	
	@Column(name="monto_pagado_bruto")
	private Double montoPagadoB;
	
	@Column(name="fecha_compra")
	private Date fechaCompra;
	
	@JsonIgnore
	@Column(name="id_cliente",insertable=false,updatable = false)
	private Integer id_cliente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ventas") 
	private List<DetalleVenta> productosVendidos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMontoPagadoN() {
		return montoPagadoN;
	}

	public void setMontoPagadoN(Double montoPagadoN) {
		this.montoPagadoN = montoPagadoN;
	}

	public Double getMontoPagadoB() {
		return montoPagadoB;
	}

	public void setMontoPagadoB(Double montoPagadoB) {
		this.montoPagadoB = montoPagadoB;
	}

 
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	 
	public List<DetalleVenta> getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(List<DetalleVenta> productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	 
	 
	 
 

}
