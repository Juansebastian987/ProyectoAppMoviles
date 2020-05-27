package com.application.proyectoappmoviles.model;

import java.io.Serializable;

public class Service implements Serializable {

    private String id_user;
    private String id_collaborator;
    private String address;
    private String pet_type;
    private String pet_size;
    private String pet_act;
    private String pet_fact;
    private String service;


    public Service(String address, String pet_type, String pet_size, String pet_act, String pet_fact, String id_user, String id_collaborator, String service) {
        this.address = address;
        this.pet_type = pet_type;
        this.pet_size = pet_size;
        this.pet_act = pet_act;
        this.pet_fact = pet_fact;
        this.id_user=id_user;
        this.id_collaborator=id_collaborator;
        this.service=service;
    }

    public Service() {

    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }

    public String getPet_size() {
        return pet_size;
    }

    public void setPet_size(String pet_size) {
        this.pet_size = pet_size;
    }

    public String getPet_act() {
        return pet_act;
    }

    public void setPet_act(String pet_act) {
        this.pet_act = pet_act;
    }

    public String getPet_fact() {
        return pet_fact;
    }

    public void setPet_fact(String pet_fact) {
        this.pet_fact = pet_fact;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_collaborator() {
        return id_collaborator;
    }

    public void setId_collaborator(String id_collaborator) {
        this.id_collaborator = id_collaborator;
    }
}
