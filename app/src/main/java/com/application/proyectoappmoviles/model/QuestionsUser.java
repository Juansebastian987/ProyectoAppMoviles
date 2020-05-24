package com.application.proyectoappmoviles.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuestionsUser implements Serializable {

    private String numberPets;
    private List<String> names;
    private List<String> edades;

    public QuestionsUser(String numberPets, List<String> names, List<String> edades) {
        this.numberPets = numberPets;
        this.names = names;
        this.edades = edades;
    }

    public String getNumberPets() {
        return numberPets;
    }

    public void setNumberPets(String numberPets) {
        this.numberPets = numberPets;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getEdades() {
        return edades;
    }

    public void setEdades(List<String> edades) {
        this.edades = edades;
    }
}
