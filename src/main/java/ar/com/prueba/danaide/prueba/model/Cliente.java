package ar.com.prueba.danaide.prueba.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
 
	 
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(unique = true, nullable = false)
	  private Integer id;
	  
	 private Integer dni;
	 private String nombre;
	 private String apellido;
	 private String direccion;
	 
	 @Column(name="tipo_cliente")
	 private Integer tipoCliente;
	 
	 @OneToMany(mappedBy="cliente" )
	  private List<Ventas> ventas;
	  
	 
	 
	 //*getter y setters*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	@JsonIgnore
	public List<Ventas> getVentas() {
		return ventas;
	}
	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}
	 
}
