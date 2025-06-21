package com.example.ms_inventario_bff.model.dto;

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

public class ProductoDTO {

    private Long idProducto;
    private String nombre;
    private String descripcion;
    private Float precio;
    private int stock;
    private Integer proveedorId;
    private ProveedorDTO proveedor; 
    

}