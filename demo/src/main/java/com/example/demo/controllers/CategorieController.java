package com.example.demo.controllers;

import com.example.demo.models.Categorie;
import com.example.demo.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Categorie save(@RequestBody Categorie categorie){
        return categorieService.saveCategorie(categorie);
    }

    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categorie> getall(){
        return categorieService.getallCategories();
    }

    @GetMapping(value = "/{id_cat}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Categorie getCategorieById(@PathVariable("id_cat") Long id){
        return categorieService.getCategoriesById(id);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteCategorie(@PathVariable("id") Long id){
        categorieService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
