package com.proyecto.Proyecto.PApiProduct.dao;

import com.proyecto.Proyecto.PApiProduct.entity.Producto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    Optional<Producto> findByNombreProd(String nombreProd);
    Optional<Producto> findByProductoSK(String productoSk);
}
