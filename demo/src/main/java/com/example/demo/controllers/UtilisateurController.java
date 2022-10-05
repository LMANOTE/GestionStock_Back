package com.example.demo.controllers;

import com.example.demo.models.Client;
import com.example.demo.models.Utilisateur;
import com.example.demo.services.ClientService;
import com.example.demo.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur save(@RequestBody Utilisateur utilisateur){
        return utilisateurService.saveUtilisateur(utilisateur);
    }

    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Utilisateur> getall(){
        return utilisateurService.getallUtilisateurs();
    }

    @GetMapping(value = "/{id_cat}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur getClientById(@PathVariable("id_cat") Long id){
        return utilisateurService.getUtilisateursById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") Long id){
        utilisateurService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
