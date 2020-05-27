package com.application.proyectoappmoviles.view.home;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.HomeCController;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeCActivity extends AppCompatActivity {

    private Button btn_pendentserv;
    private Button btn_helpC;
    private Button btn_pendentPro;
    private FloatingActionButton fab2;
    private HomeCController controller;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_c);

        btn_helpC= findViewById(R.id.btn_helpC);
        btn_pendentserv=findViewById(R.id.btn_pendentserv);
        btn_pendentPro=findViewById(R.id.btn_pendentpro);
        fab2=findViewById(R.id.fab2);

        controller= new HomeCController(this);

    }

    public FloatingActionButton getFab2() {
        return fab2;
    }

    public void setFab2(FloatingActionButton fab2) {
        this.fab2 = fab2;
    }

    public Button getBtn_pendentserv() {
        return btn_pendentserv;
    }

    public void setBtn_pendentserv(Button btn_pendentserv) {
        this.btn_pendentserv = btn_pendentserv;
    }

    public Button getBtn_helpC() {
        return btn_helpC;
    }

    public void setBtn_helpC(Button btn_helpC) {
        this.btn_helpC = btn_helpC;
    }

    public Button getBtn_pendentPro() {
        return btn_pendentPro;
    }

    public void setBtn_pendentPro(Button btn_pendentPro) {
        this.btn_pendentPro = btn_pendentPro;
    }

    public HomeCController getController() {
        return controller;
    }

    public void setController(HomeCController controller) {
        this.controller = controller;
    }
}
