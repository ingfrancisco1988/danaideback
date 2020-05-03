package ar.com.prueba.danaide.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.prueba.danaide.prueba.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
