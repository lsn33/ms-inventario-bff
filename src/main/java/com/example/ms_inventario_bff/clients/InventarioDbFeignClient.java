package com.example.ms_inventario_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.example.ms_inventario_bff.model.dto.ProductoDTO;
import java.util.List;

@FeignClient(name = "ms-inventario-bs", url = "http://localhost:8281")
public interface InventarioDbFeignClient {

    @GetMapping("/productos")
    List<ProductoDTO> selectAllProductos();

    @GetMapping("/productos/{id}")
    ProductoDTO getProductoById(@PathVariable("id") Long id);

    @PostMapping("/productos")
    ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO);
}
