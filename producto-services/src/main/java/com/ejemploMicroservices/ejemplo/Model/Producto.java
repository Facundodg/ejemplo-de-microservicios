package com.ejemploMicroservices.ejemplo.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Producto {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int cantidad;

}
