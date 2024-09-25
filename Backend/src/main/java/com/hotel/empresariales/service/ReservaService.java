package com.hotel.empresariales.service;

import com.hotel.empresariales.entity.Reserva;
import com.hotel.empresariales.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {


    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaService(ReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> buscaTodasLasReservas(){
        return reservaRepository.findAll();
    }

    public Reserva buscaReservaPorId(Long id){
        return reservaRepository.findById(id).get();
    }

    public Reserva guardarReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public Reserva actualizarReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void eliminarReserva(Long id){
        reservaRepository.deleteById(id);
    }

}
