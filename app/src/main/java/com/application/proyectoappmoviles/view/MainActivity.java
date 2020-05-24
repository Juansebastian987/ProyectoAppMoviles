package com.application.proyectoappmoviles.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.MainController;
import com.application.proyectoappmoviles.view.login.Login;

public class MainActivity extends AppCompatActivity {

    private ImageView logoMain;
    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoMain = findViewById(R.id.logoMain);
        mainController = new MainController(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
                finish();
            }
        },500);
    }

    public ImageView getLogoMain() {
        return logoMain;
    }

    public void setLogoMain(ImageView logoMain) {
        this.logoMain = logoMain;
    }
}
