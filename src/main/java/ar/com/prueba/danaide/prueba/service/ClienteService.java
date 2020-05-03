package ar.com.prueba.danaide.prueba.service;

import java.util.List;

import ar.com.prueba.danaide.prueba.DTO.BusquedaCompraDTO;
import ar.com.prueba.danaide.prueba.model.Cliente;
import ar.com.prueba.danaide.prueba.model.Ventas;

public interface ClienteService {

	public List<Cliente> ObtenerClientes();
	
	public List<BusquedaCompraDTO>obtenerComprasRealizadas(Integer idCliete);
}
