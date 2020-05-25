package com.application.proyectoappmoviles.view.home;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.HomeController;

public class HomeActivity extends AppCompatActivity {

    private Button btn_help;
    private Button btn_product;
    private Button btn_service;
    private Button btn_ordersPlaced;
    private HomeController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    btn_help= findViewById(R.id.btn_helpC);
    btn_product= findViewById(R.id.btn_pendentpro);
    btn_service= findViewById(R.id.btn_pendentserv);
    btn_ordersPlaced=findViewById(R.id.btn_ordersPlaced);

    controller= new HomeController(this);

    }

    public HomeController getController() {
        return controller;
    }

    public void setController(HomeController controller) {
        this.controller = controller;
    }

    public Button getBtn_help() {
        return btn_help;
    }

    public void setBtn_help(Button btn_help) {
        this.btn_help = btn_help;
    }

    public Button getBtn_product() {
        return btn_product;
    }

    public void setBtn_product(Button btn_product) {
        this.btn_product = btn_product;
    }

    public Button getBtn_service() {
        return btn_service;
    }

    public void setBtn_service(Button btn_service) {
        this.btn_service = btn_service;
    }

    public Button getBtn_ordersPlaced() {
        return btn_ordersPlaced;
    }

    public void setBtn_ordersPlaced(Button btn_ordersPlaced) {
        this.btn_ordersPlaced = btn_ordersPlaced;
    }
}
