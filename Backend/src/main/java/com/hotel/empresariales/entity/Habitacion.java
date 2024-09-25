package com.hotel.empresariales.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habitacion;
    private int numero_habitacion;
    private String tipo_habitacion;
    private Double precio_habitacion;
    private String estado;

    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservas;

}
