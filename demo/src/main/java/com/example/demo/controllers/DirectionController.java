package com.example.demo.controllers;

import com.example.demo.models.Direction;
import com.example.demo.services.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/directions")
public class DirectionController {

    @Autowired
    private DirectionService directionService;

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteDirection(@PathVariable("id") Long id){
        directionService.deleteByid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
