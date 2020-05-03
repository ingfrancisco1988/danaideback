package ar.com.prueba.danaide.prueba.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="producto")
public class Producto   implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(unique = true, nullable = false)
	 private Integer id;
	
	@Column(name="cod_producto")
	private Integer codProducto;
	
	private String Descripcion;
	
	private Integer cantidad;
	
	private Double precio;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "producto") 
	@JsonBackReference
   private Set<DetalleVenta> ventas;
	
	/*getter y setter*/
	public Producto() {
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(Integer codProducto) {
		this.codProducto = codProducto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Set<DetalleVenta> getVentas() {
		return ventas;
	}
	public void setVentas(Set<DetalleVenta> ventas) {
		this.ventas = ventas;
	}
	 
	 
	 
	 
	 

}
