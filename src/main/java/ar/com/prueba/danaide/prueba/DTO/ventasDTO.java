package ar.com.prueba.danaide.prueba.DTO;

import java.util.Date;
import java.util.List;

import ar.com.prueba.danaide.prueba.model.DetalleVenta;

public class ventasDTO {
	
  
	private Double montoPagadoN;
	
	 
	private Double montoPagadoB; 
	private Integer clienteId;
	public Date fechaCompra;
	
  
	private List<DetalleVenta> productosVendidos;


	

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

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public List<DetalleVenta> getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(List<DetalleVenta> productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

 
	 
	
	

}
