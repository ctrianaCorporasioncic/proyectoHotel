package com.hotel.empresariales.controller;

import com.hotel.empresariales.entity.Habitacion;
import com.hotel.empresariales.service.HabitacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/habitacion")
public class HabitacionController {

    @Autowired
    private final HabitacionService habitacionService;

    public HabitacionController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    @GetMapping
    public List<Habitacion> getAll() {
        return habitacionService.buscaTodasLasHabitacion();
    }
}
