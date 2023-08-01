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


    @ManyToOne
    @JoinColumn(name = "historiaclinica_id") // Nombre de la columna que almacenará el id del cliente en la tabla historia_clinica
    private HistoriaclinicaModel historiaclinica;

    


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

    // Getters y setters para la relación con Historiadetalle
    public HistoriaclinicaModel GetHistoriaclinica() {
        return historiaclinica;
    }

    public void setHistoriaclinica(HistoriaclinicaModel historiaclinica) {
        this.historiaclinica = historiaclinica;
    }

    // Otros getters y setters si los necesitas
}
