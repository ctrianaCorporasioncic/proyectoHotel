package com.hotel.empresariales.service;

import com.hotel.empresariales.entity.Cliente;
import com.hotel.empresariales.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> buscaTodosLosClientes(){
        return clienteRepository.findAll();
    }

    public Cliente buscaClientePorId(Long id){
        return clienteRepository.findById(id).get();
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
