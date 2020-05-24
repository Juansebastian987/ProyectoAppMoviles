package com.application.proyectoappmoviles.model;

import java.io.Serializable;

public class QuestionsCollaborator implements Serializable {

    private String workPets;
    private String freeTime;
    private String vehiculo;

    public QuestionsCollaborator(String workPets, String freeTime, String vehiculo) {
        this.workPets = workPets;
        this.freeTime = freeTime;
        this.vehiculo = vehiculo;
    }

    public String getWorkPets() {
        return workPets;
    }

    public void setWorkPets(String workPets) {
        this.workPets = workPets;
    }

    public String getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String freeTime) {
        this.freeTime = freeTime;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

}
