package com.example.ms_inventario_bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_inventario_bff.model.dto.ProductoDTO;
import com.example.ms_inventario_bff.service.ProductoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @Operation(
        summary = "Listar todos los productos",
        description = "Retorna una lista de todos los perfumes disponibles en el inventario del sistema BFF."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de productos obtenida correctamente",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class)))
    })
    @GetMapping
    public List<ProductoDTO> selectAllProductos() {
        return productoService.selectAllProductos();
    }

    @Operation(
        summary = "Obtener un producto por su ID",
        description = "Busca y retorna la información de un perfume utilizando su ID único."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Producto encontrado correctamente",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "404", description = "Producto no encontrado", content = @Content)
    })
    @GetMapping("/{id}")
    public ProductoDTO getProductoById(
        @Parameter(description = "ID del producto que se desea consultar", example = "1001")
        @PathVariable("id") Long id) {
        return productoService.getProductoById(id);
    }

    @Operation(
        summary = "Crear un nuevo producto",
        description = "Permite registrar un nuevo perfume en el sistema BFF."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Producto creado correctamente",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "400", description = "Solicitud inválida o datos incorrectos", content = @Content)
    })
    @PostMapping
    public ProductoDTO createProducto(
        @Parameter(description = "Datos del producto a registrar", required = true)
        @RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }
}
