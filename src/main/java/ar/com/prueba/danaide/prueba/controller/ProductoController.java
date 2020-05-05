package ar.com.prueba.danaide.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.prueba.danaide.prueba.model.Producto;
import ar.com.prueba.danaide.prueba.service.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path = "api/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping(path = "/ver")
	public @ResponseBody Iterable<Producto> getAllProductos() {
		return productoService.obtenerTodosLosPrductos();
	}
}
