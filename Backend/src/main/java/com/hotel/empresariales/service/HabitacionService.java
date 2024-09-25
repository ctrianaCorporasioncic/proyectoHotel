package com.hotel.empresariales.service;

import com.hotel.empresariales.entity.Habitacion;
import com.hotel.empresariales.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionService {

    private final HabitacionRepository habitacionRepository;

    @Autowired
    public HabitacionService(HabitacionRepository habitacionRepository){
        this.habitacionRepository = habitacionRepository;
    }

    public List<Habitacion> buscaTodasLasHabitacion(){
        return habitacionRepository.findAll();
    }

    public Habitacion buscaHabitacionPorId(Long id){
        return habitacionRepository.findById(id).get();
    }

    public Habitacion guardarHabitacion(Habitacion habitacion){
        return habitacionRepository.save(habitacion);
    }

    public Habitacion actualizarHabitacion(Habitacion habitacion){
        return habitacionRepository.save(habitacion);
    }

    public void eliminarHabitacion(Long id){
        habitacionRepository.deleteById(id);
    }
}
