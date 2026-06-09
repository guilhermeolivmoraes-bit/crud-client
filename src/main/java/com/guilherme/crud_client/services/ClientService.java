package com.guilherme.crud_client.services;

import com.guilherme.crud_client.dto.ClientDTO;
import com.guilherme.crud_client.entities.Client;
import com.guilherme.crud_client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional
    public ClientDTO findById(Long id) {
            Client client = repository.findById(id).get();
            return new ClientDTO(client);
    }
}
