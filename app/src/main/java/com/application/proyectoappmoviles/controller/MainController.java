package com.application.proyectoappmoviles.controller;

import com.application.proyectoappmoviles.view.MainActivity;

public class MainController {

    private MainActivity mainActivity;

    public MainController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
}
