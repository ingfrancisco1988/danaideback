package ar.com.prueba.danaide.prueba.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.prueba.danaide.prueba.DTO.BusquedaCompraDTO;
import ar.com.prueba.danaide.prueba.model.Cliente;
import ar.com.prueba.danaide.prueba.model.Ventas;
import ar.com.prueba.danaide.prueba.repository.ClienteRepository;
import ar.com.prueba.danaide.prueba.repository.VentasRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private VentasRepository ventasRepository;

	@Override
	public List<Cliente> ObtenerClientes() {		 
		return  clienteRepository.findAll();
	}

	@Override
	public List<BusquedaCompraDTO> obtenerComprasRealizadas(Integer idCliente) {
		// TODO Auto-generated method stub
		//return ;idCliente
		
		List<BusquedaCompraDTO> mapeo= new ArrayList<BusquedaCompraDTO>();
		
		
		for(Object[] obj : ventasRepository.validarLasComprasDelCliente(idCliente)){
		     Double total= (Double) obj[0];
		     String mes  = (String) obj[1];
		     BusquedaCompraDTO carga = new BusquedaCompraDTO();
		      carga.setMes(mes);
		      carga.setTotal(total);
		     mapeo.add(carga);
		     }
	 
		 
		 
		
 
		
		return mapeo;
	}
	
	
	

}
