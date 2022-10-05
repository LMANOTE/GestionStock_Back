package com.example.demo.repositories;

import com.example.demo.models.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel,Long> {
}
