package com.example.ms_inventario_bff.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "DTO que representa un producto dentro del sistema BFF para perfumes")
public class ProductoDTO {

    @Schema(description = "ID único del producto", example = "1001")
    private Long idProducto;

    @Schema(description = "Nombre del perfume", example = "Esencia Floral")
    private String nombre;

    @Schema(description = "Descripción del perfume", example = "Aroma suave con notas florales y cítricas")
    private String descripcion;

    @Schema(description = "Precio del perfume en dólares", example = "59.99")
    private Float precio;

    @Schema(description = "Stock disponible en unidades", example = "150")
    private int stock;

    @Schema(description = "ID del proveedor asociado al producto", example = "2001")
    private Integer proveedorId;

    @Schema(description = "Datos del proveedor que suministra el producto")
    private ProveedorDTO proveedor;
}
