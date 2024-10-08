package com.hotel.empresariales.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;


}
