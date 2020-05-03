package ar.com.prueba.danaide.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.prueba.danaide.prueba.DTO.RespuestaDTO;
import ar.com.prueba.danaide.prueba.DTO.ventasDTO;
import ar.com.prueba.danaide.prueba.model.Cliente;
import ar.com.prueba.danaide.prueba.model.Ventas;
import ar.com.prueba.danaide.prueba.repository.ClienteRepository;
import ar.com.prueba.danaide.prueba.repository.VentasRepository;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	private VentasRepository ventasRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Ventas> ontenerTodasLasVentasRealizadas() {
		// TODO Auto-generated method stub
		return ventasRepository.findAll();
	}

	@SuppressWarnings("finally")
	@Override
	public RespuestaDTO generarUnaCompra(ventasDTO inputVentas) {
		// TODO Auto-generated method stub
RespuestaDTO respuesta =new RespuestaDTO();
		
		
		Ventas venta =new Ventas();	
		
			 try {
				
				 venta.setMontoPagadoB(inputVentas.getMontoPagadoB());
					venta.setMontoPagadoN(inputVentas.getMontoPagadoN() ); 					
					Cliente cliente= clienteRepository.findById(inputVentas.getClienteId()).get();
					venta.setCliente(cliente);
					venta.setProductosVendidos(inputVentas.getProductosVendidos());
					venta.setFechaCompra(inputVentas.getFechaCompra());
					 Ventas valor=ventasRepository.save(venta); 			 
					respuesta.setCodMensaje(0);
					respuesta.setDesCripcion("Compra Realizada con exito");
					respuesta.setVenta(valor);				 
			 }catch (Exception e) {
				 respuesta.setCodMensaje(1);
					respuesta.setDesCripcion("Hubo un error al Realizar la compra intente de nuevo");
					respuesta.setVenta(null);
					System.out.println(e);
			}finally {
				return respuesta;
			}
	}
	
	

	 
	

}
