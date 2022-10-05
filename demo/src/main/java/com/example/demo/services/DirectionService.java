package com.example.demo.services;

import com.example.demo.models.Direction;
import com.example.demo.repositories.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectionService{

    @Autowired
    private DirectionRepository directionRepository;

    public Direction saveDirection(Direction direction){
        return directionRepository.save(direction);
    }
    public void deleteByid(Long id){
        directionRepository.deleteById(id);
    }
}
