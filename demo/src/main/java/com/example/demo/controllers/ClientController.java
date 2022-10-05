package com.example.demo.controllers;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.services.CategorieService;
import com.example.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Client save(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getall(){
        return clientService.getallClients();
    }

    @GetMapping(value = "/{id_cat}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getClientById(@PathVariable("id_cat") Long id){
        return clientService.getClientsById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") Long id){
        clientService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
