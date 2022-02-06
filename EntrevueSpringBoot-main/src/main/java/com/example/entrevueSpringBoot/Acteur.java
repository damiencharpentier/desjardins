package com.example.entrevueSpringBoot;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.lang.Long;
import java.lang.String;

@Entity(name = "acteur")
public  class Acteur {

    private @Id @GeneratedValue Long id;
    private String nom;
    private String prenom;

    public Acteur(){
    }

    public Acteur(String portman, String natalie) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
