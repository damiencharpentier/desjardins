package com.example.entrevueSpringBoot;


import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    private @Id @GeneratedValue Long id;
    private String titre;
    private String description;

    @OneToMany(targetEntity=Acteur.class, mappedBy="id", fetch= FetchType.EAGER)
    private List<Acteur> acteurs;

    public Film() {
    }

    public Film(String titre, String description, List<Acteur> acteurs) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
}
