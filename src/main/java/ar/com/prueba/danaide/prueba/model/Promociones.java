package ar.com.prueba.danaide.prueba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promociones")
public class Promociones {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(unique = true, nullable = false)
	 private Integer id;
	
	private Date fecha;

	
	/*getter and setter*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
