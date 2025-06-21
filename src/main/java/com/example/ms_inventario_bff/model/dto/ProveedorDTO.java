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

public class ProveedorDTO {

    private int idProveedor;
    private String nombre;
    private String email;
    private String telefono;
     

}
