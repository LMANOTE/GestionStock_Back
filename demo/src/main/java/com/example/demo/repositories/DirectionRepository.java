package com.example.demo.repositories;

import com.example.demo.models.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends JpaRepository<Direction,Long> {
}
