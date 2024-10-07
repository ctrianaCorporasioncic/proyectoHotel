package com.hotel.empresariales.controller;

import com.hotel.empresariales.entity.Cliente;
import com.hotel.empresariales.repository.ClienteRepository;
import com.hotel.empresariales.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.buscaTodosLosClientes();
    }

    @PostMapping("/crearClt")
    public Cliente guardarCliente(@RequestBody Cliente clientes) {

        clienteRepository.save(clientes);
        
        return clientes;
    }
    





}
