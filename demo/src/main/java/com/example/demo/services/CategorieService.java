package com.example.demo.services;

import com.example.demo.models.Categorie;
import com.example.demo.models.Direction;
import com.example.demo.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public Categorie saveCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    public List<Categorie> getallCategories(){
        return categorieRepository.findAll();
    }

    public Categorie getCategoriesById(Long id){
        return categorieRepository.findById(id).get();
    }

    public void deleteByid(Long id){
         categorieRepository.deleteById(id);
    }
}
