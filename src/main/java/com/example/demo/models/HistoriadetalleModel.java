package com.example.demo.models;


import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="historiadetalle")
public class HistoriadetalleModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperatura;
    private double peso;
     private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private ColaboradorModel colaborador;

    // Constructor, otros métodos y relaciones con otras entidades

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    

    public ColaboradorModel getColaborador() {
        return colaborador;
    }

    public void setColaborador(ColaboradorModel colaborador) {
        this.colaborador = colaborador;
    }


    // Otros getters y setters si los necesitas
}
