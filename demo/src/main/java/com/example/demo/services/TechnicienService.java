package com.example.demo.services;

import com.example.demo.models.Client;
import com.example.demo.models.Materiel;
import com.example.demo.models.Technicien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicienService {
    @Autowired
    private com.example.demo.repositories.TechnicienRepository technicienRepository;

    public Technicien saveTechnicien(Technicien technicien){
        return technicienRepository.save(technicien);
    }

    public List<Technicien> getallTechniciens(){
        return technicienRepository.findAll();
    }

    public Technicien getTechniciensById(Long id){
        return technicienRepository.findById(id).get();
    }

    public void deleteByid(Long id){
        technicienRepository.deleteById(id);
    }
}
