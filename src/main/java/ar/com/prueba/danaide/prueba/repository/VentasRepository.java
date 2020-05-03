package ar.com.prueba.danaide.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.prueba.danaide.prueba.DTO.BusquedaCompraDTO;
import ar.com.prueba.danaide.prueba.DTO.ventasDTO;
import ar.com.prueba.danaide.prueba.model.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

	Ventas save(ventasDTO inputVentas);
	
	
	@Query(value="SELECT SUM(v.monto_pagado_neto) AS total, MONTHNAME(v.fecha_compra) AS mes FROM venta v WHERE v.id_cliente= :idCliente GROUP BY Mes",nativeQuery = true)
	public List<Object[]> validarLasComprasDelCliente(@Param("idCliente")  Integer idCliente);

}
