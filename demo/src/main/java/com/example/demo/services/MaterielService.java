package com.example.demo.services;

import com.example.demo.models.Categorie;
import com.example.demo.models.Materiel;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.repositories.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterielService {
    @Autowired
    private MaterielRepository materielRepository;

    public Materiel saveMateriel(Materiel materiel){
        return materielRepository.save(materiel);
    }

    public List<Materiel> getallMateriels(){
        return materielRepository.findAll();
    }

    public Optional<Materiel> getMaterielById(Long id){
        return materielRepository.findById(id);
    }

    public void deleteByid(Long id){
        materielRepository.deleteById(id);
    }
}
