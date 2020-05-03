package ar.com.prueba.danaide.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.prueba.danaide.prueba.model.Producto;
import ar.com.prueba.danaide.prueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> obtenerTodosLosPrductos() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}
	
	

}
