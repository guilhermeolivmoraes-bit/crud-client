package com.guilherme.crud_client.controllers;

import com.guilherme.crud_client.dto.ClientDTO;
import com.guilherme.crud_client.entities.Client;
import com.guilherme.crud_client.repositories.ClientRepository;
import com.guilherme.crud_client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }


}
