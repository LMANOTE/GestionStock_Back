package com.example.demo.services;

import com.example.demo.models.Client;
import com.example.demo.models.Utilisateur;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurService;

    public Utilisateur saveUtilisateur(Utilisateur utilisateur){
        return utilisateurService.save(utilisateur);
    }

    public List<Utilisateur> getallUtilisateurs(){
        return utilisateurService.findAll();
    }

    public Utilisateur getUtilisateursById(Long id){
        return utilisateurService.findById(id).get();
    }

    public void deleteByid(Long id){
        utilisateurService.deleteById(id);
    }
}
