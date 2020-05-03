package ar.com.prueba.danaide.prueba.DTO;

import ar.com.prueba.danaide.prueba.model.Ventas;

public class RespuestaDTO {
	
	private Integer codMensaje;
	private String desCripcion;
	private Ventas venta;
	
	
	public Integer getCodMensaje() {
		return codMensaje;
	}
	public void setCodMensaje(Integer codMensaje) {
		this.codMensaje = codMensaje;
	}
	public String getDesCripcion() {
		return desCripcion;
	}
	public void setDesCripcion(String desCripcion) {
		this.desCripcion = desCripcion;
	}
	public Ventas getVenta() {
		return venta;
	}
	public void setVenta(Ventas venta) {
		this.venta = venta;
	}
	
	

}
