package ar.com.prueba.danaide.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.prueba.danaide.prueba.DTO.BusquedaCompraDTO;
import ar.com.prueba.danaide.prueba.model.Cliente;
import ar.com.prueba.danaide.prueba.service.ClienteService;

@RestController
@RequestMapping(path = "api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
 
	 
	@GetMapping(name = "/")
	public List<Cliente> obtenerClientes() {
		return clienteService.ObtenerClientes();
	} 
	
 
	@RequestMapping(method = RequestMethod.GET, path = "/validarcompras/{id}")	 
	public List<BusquedaCompraDTO> obtenerComprasdeclientes(@PathVariable Integer id){
		return clienteService.obtenerComprasRealizadas(id);
	}
	

}
