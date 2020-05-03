package ar.com.prueba.danaide.prueba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="detalle_venta")

public class DetalleVenta implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(unique = true, nullable = false)
	@JsonIgnore
	 private Integer id;
	
	@JsonIgnore
	@Column(name="id_venta")
	 private Integer id_venta;
	@JsonIgnore
	@Column(name="id_producto")
	private Integer id_producto;
	
	
	@Column(name="fecha_venta")
	private Date fechaVenta;
  
	 
	@ManyToOne  
    @JoinColumn(name = "id_venta", insertable=false,updatable = false)
	@JsonIgnore
	private Ventas  ventas;
	
	@JsonIgnore
	@JsonManagedReference
	@ManyToOne  
    @JoinColumn(name = "id_producto", insertable=false,updatable = false)
	private Producto  producto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

 
 
	public Ventas getVentas() {
		return ventas;
	}
	
 
	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Integer getId_venta() {
		return id_venta;
	}

	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	
	
	
 
	
}
