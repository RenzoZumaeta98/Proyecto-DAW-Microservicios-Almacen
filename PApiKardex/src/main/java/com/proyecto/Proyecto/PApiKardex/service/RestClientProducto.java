package com.proyecto.Proyecto.PApiKardex.service;

import com.proyecto.Proyecto.PApiKardex.entity.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "producto-service", url = "http://localhost:8086/")
public interface RestClientProducto {
    @GetMapping("api/v1/producto//findByProductoSK/{productoSK}")
    Producto findByProductoSK(@PathVariable String productoSK);
}
