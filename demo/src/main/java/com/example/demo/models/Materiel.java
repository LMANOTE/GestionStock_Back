package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Materiel{

    @Id
    private Long codeMateriel;
    private String designation;
    private String numeroSerie;
    private String marque;
    private Long model;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private Categorie categorie;
}
