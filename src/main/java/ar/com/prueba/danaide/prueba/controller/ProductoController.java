package ar.com.prueba.danaide.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.prueba.danaide.prueba.model.Producto;
import ar.com.prueba.danaide.prueba.service.ProductoService;

@RestController
@RequestMapping(path = "api/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping(path = "/ver")
	public @ResponseBody Iterable<Producto> getAllUsers() {
		return productoService.obtenerTodosLosPrductos();
	}
}
