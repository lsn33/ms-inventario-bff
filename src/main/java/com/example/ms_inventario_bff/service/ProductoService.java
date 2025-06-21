package com.example.ms_inventario_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_inventario_bff.clients.InventarioDbFeignClient;
import com.example.ms_inventario_bff.model.dto.ProductoDTO;

@Service
public class ProductoService {

    @Autowired
    private InventarioDbFeignClient inventarioDbFeignClient;

    public List<ProductoDTO> selectAllProductos() {
        return inventarioDbFeignClient.selectAllProductos();
    }

    public ProductoDTO getProductoById(Long id) {
        return inventarioDbFeignClient.getProductoById(id);
    }

    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        return inventarioDbFeignClient.createProducto(productoDTO);
    }
}