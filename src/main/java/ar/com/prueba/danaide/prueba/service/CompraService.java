package ar.com.prueba.danaide.prueba.service;

import java.util.List;

import ar.com.prueba.danaide.prueba.DTO.RespuestaDTO;
import ar.com.prueba.danaide.prueba.DTO.ventasDTO;
import ar.com.prueba.danaide.prueba.model.Ventas;

public interface CompraService {
	
public List<Ventas> ontenerTodasLasVentasRealizadas();

public RespuestaDTO generarUnaCompra( ventasDTO inputVentas);

}
