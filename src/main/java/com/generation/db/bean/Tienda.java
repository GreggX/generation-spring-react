package com.generation.db.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String categoria;

    private String direccion;

    private String noEmpleados;

    private String noTelefono;

    public Tienda() {
    }

    public Tienda(String nombre, String categoria, String direccion, String noEmpleados, String noTelefono) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
        this.noEmpleados = noEmpleados;
        this.noTelefono = noTelefono;
    }
}
