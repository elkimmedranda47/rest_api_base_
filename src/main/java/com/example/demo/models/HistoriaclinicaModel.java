package com.example.demo.models;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name="historiaclinica")

public class HistoriaclinicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Nombre de la columna que almacenará el id del cliente en la tabla historia_clinica
    private ClienteModel cliente;

    /** uno a uno  */
   
  /*   @OneToOne

    @JoinColumn(name = "mascota_id") // Nombre de la columna que almacenará el id de la mascota en la tabla historia_clinica
    private MascotaModel mascota;
   */
  
   @OneToOne
   @JoinColumn(name = "mascota_id", unique = true)
   private MascotaModel mascota;

    // Constructor vacío (obligatorio para JPA)
     public HistoriaclinicaModel() {
    }
    

    // Getters y setters para el id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters y setters para la fecha
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Getters y setters para la hora
    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    // Getters y setters para la relación con Cliente
    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    // Getters y setters para la relación con Mascota
    public MascotaModel getMascota() {
        return mascota;
    }

    public void setMascota(MascotaModel mascota) {
        this.mascota = mascota;
    }


  
    

    // Otros atributos y métodos si los hay
}
