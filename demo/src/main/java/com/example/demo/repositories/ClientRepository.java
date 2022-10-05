package com.example.demo.repositories;

import com.example.demo.models.Client;
import com.example.demo.models.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
