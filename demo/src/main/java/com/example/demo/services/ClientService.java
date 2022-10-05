package com.example.demo.services;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> getallClients(){
        return clientRepository.findAll();
    }

    public Client getClientsById(Long id){
        return clientRepository.findById(id).get();
    }

    public void deleteByid(Long id){
        clientRepository.deleteById(id);
    }
}
