package com.example.demo.controllers;

import com.example.demo.models.Categorie;
import com.example.demo.models.Materiel;
import com.example.demo.services.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/materieles")
public class MaterielController {
    @Autowired
    private MaterielService materielService;

    @PostMapping(value = "/create",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Materiel save(@RequestBody Materiel materiel){
        return materielService.saveMateriel(materiel);
    }

    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Materiel> getall(){
        return materielService.getallMateriels();
    }

    @GetMapping(value = "/{id_mat}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Materiel> getMaterielById(@PathVariable("id_mat") Long id){
        return materielService.getMaterielById(id);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteCategorie(@PathVariable("id") Long id){
        materielService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
