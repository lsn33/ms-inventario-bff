package com.example.ms_inventario_bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_inventario_bff.model.dto.ProductoDTO;
import com.example.ms_inventario_bff.service.ProductoService;

@RestController
@RequestMapping("/productos") 
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<ProductoDTO> selectAllProductos() {
        return productoService.selectAllProductos();
    }

    @GetMapping("/{id}")
    public ProductoDTO getProductoById(@PathVariable("id") Long id) {
        return productoService.getProductoById(id);
    }

    @PostMapping
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }
}