package com.application.proyectoappmoviles.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private ImageView logoMain;
    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoMain = findViewById(R.id.logoMain);
        mainController = new MainController(this);
    }

    public ImageView getLogoMain() {
        return logoMain;
    }

    public void setLogoMain(ImageView logoMain) {
        this.logoMain = logoMain;
    }
}
