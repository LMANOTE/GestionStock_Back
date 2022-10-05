package com.example.demo.repositories;

import com.example.demo.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
