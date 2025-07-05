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
@Schema(description = "DTO que representa un proveedor dentro del sistema BFF para perfumes")
public class ProveedorDTO {

    @Schema(description = "ID único del proveedor", example = "2001")
    private int idProveedor;

    @Schema(description = "Nombre del proveedor", example = "Perfumerías Aurora Ltda.")
    private String nombre;

    @Schema(description = "Correo electrónico de contacto del proveedor", example = "contacto@auroraperfumes.com")
    private String email;

    @Schema(description = "Teléfono de contacto del proveedor", example = "+34123456789")
    private String telefono;
}
