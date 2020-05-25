package com.application.proyectoappmoviles.view.home;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.ServiceController;

public class ServiceActivity extends AppCompatActivity {

    private Button especial_serv;
    private Button paseo_serv;
    private Button banio_serv;
    private Button vet_serv;
    private ServiceController controller;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        especial_serv= findViewById(R.id.especial_serv);
        paseo_serv= findViewById(R.id.paseo_serv);
        banio_serv=findViewById(R.id.banio_serv);
        vet_serv=findViewById(R.id.vet_serv);

        controller= new ServiceController(this);
    }

    public Button getEspecial_serv() {
        return especial_serv;
    }

    public void setEspecial_serv(Button especial_serv) {
        this.especial_serv = especial_serv;
    }

    public Button getBanio_serv() {
        return banio_serv;
    }

    public void setBanio_serv(Button banio_serv) {
        this.banio_serv = banio_serv;
    }

    public Button getVet_serv() {
        return vet_serv;
    }

    public void setVet_serv(Button vet_serv) {
        this.vet_serv = vet_serv;
    }

    public ServiceController getController() {
        return controller;
    }

    public void setController(ServiceController controller) {
        this.controller = controller;
    }

    public Button getPaseo_serv() {
        return paseo_serv;
    }

    public void setPaseo_serv(Button paseo_serv) {
        this.paseo_serv = paseo_serv;
    }
}


