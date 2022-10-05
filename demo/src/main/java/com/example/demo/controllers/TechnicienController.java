package com.example.demo.controllers;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.models.Technicien;
import com.example.demo.services.CategorieService;
import com.example.demo.services.TechnicienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/techniciens")
public class TechnicienController {
    @Autowired
    private TechnicienService technicienService;

    @PostMapping(value = "/create")
    public Technicien save(@RequestBody Technicien technicien){
        return technicienService.saveTechnicien(technicien);
    }

    @GetMapping(value = "/all")
    public List<Technicien> getall(){
        return technicienService.getallTechniciens();
    }

    @GetMapping(value = "/{id_cat}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Technicien getTechnicienById(@PathVariable("id_cat") Long id){
        return technicienService.getTechniciensById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteTechnicien(@PathVariable("id") Long id){
        technicienService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
