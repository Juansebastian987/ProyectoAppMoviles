package com.application.proyectoappmoviles.view.home;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.ResumeController;

public class Resume extends AppCompatActivity {

    private TextView txt_nameres, txt_mailres, txt_contactres, txt_petsres;
    private ImageButton btn_back;
    private Button btn_logout;
    private ResumeController controller;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        txt_contactres=findViewById(R.id.txt_contactres);
        txt_petsres=findViewById(R.id.txt_petsres);
        txt_mailres=findViewById(R.id.txt_mailres);
        txt_nameres=findViewById(R.id.txt_nameres);
        btn_back=findViewById(R.id.btn_back);
        btn_logout=findViewById(R.id.btn_logout);

        controller= new ResumeController(this);

    }

    public Button getBtn_logout() {
        return btn_logout;
    }

    public void setBtn_logout(Button btn_logout) {
        this.btn_logout = btn_logout;
    }

    public TextView getTxt_nameres() {
        return txt_nameres;
    }

    public void setTxt_nameres(TextView txt_nameres) {
        this.txt_nameres = txt_nameres;
    }

    public TextView getTxt_mailres() {
        return txt_mailres;
    }

    public void setTxt_mailres(TextView txt_mailres) {
        this.txt_mailres = txt_mailres;
    }

    public TextView getTxt_contactres() {
        return txt_contactres;
    }

    public void setTxt_contactres(TextView txt_contactres) {
        this.txt_contactres = txt_contactres;
    }

    public TextView getTxt_petsres() {
        return txt_petsres;
    }

    public void setTxt_petsres(TextView txt_petsres) {
        this.txt_petsres = txt_petsres;
    }

    public ImageButton getBtn_back() {
        return btn_back;
    }

    public void setBtn_back(ImageButton btn_back) {
        this.btn_back = btn_back;
    }

    public ResumeController getController() {
        return controller;
    }

    public void setController(ResumeController controller) {
        this.controller = controller;
    }
}
