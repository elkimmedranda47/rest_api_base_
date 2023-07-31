package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "mascota")
public class MascotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String nombre;
   
    private String raza;
    private String sexo;

    // Getter and Setter for 'id'
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Getter and Setter for 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    // Getter and Setter for 'raza'
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Getter and Setter for 'sexo'
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
