package ar.com.prueba.danaide.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.prueba.danaide.prueba.DTO.RespuestaDTO;
import ar.com.prueba.danaide.prueba.DTO.ventasDTO;
import ar.com.prueba.danaide.prueba.model.Ventas;
import ar.com.prueba.danaide.prueba.service.CompraService;

@RestController
@RequestMapping(path = "api/compra")
public class ComprarController {
	
	@Autowired
	private CompraService compraService;
	
	
	@PostMapping("/guardar")
	public RespuestaDTO  create(@RequestBody ventasDTO inputVentas) {
		return compraService.generarUnaCompra(inputVentas);
		
	}
	
	@GetMapping(path = "/allventas")
	public @ResponseBody Iterable<Ventas> getAllventasAndDetalles() {
		// This returns a JSON or XML with the users
		return compraService.ontenerTodasLasVentasRealizadas();
	}
	
		

}
