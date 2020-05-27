package com.application.proyectoappmoviles.view.service;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.PaseoController;

public class PaseoActivity  extends AppCompatActivity {

    private EditText pet_type;
    private EditText address;
    private EditText pet_size;
    private EditText pet_interest;
    private EditText pet_facts;
    private PaseoController controller;
    private ImageButton btn_next;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paseo);

        pet_type= findViewById(R.id.pet_type);
        address= findViewById(R.id.address);
        pet_size=findViewById(R.id.pet_size);
        pet_interest=findViewById(R.id.pet_interest);
        pet_facts=findViewById(R.id.pet_facts);
        btn_next=findViewById(R.id.btn_next);

        controller= new PaseoController(this);
    }

    public ImageButton getBtn_next() {
        return btn_next;
    }

    public void setBtn_next(ImageButton btn_next) {
        this.btn_next = btn_next;
    }

    public PaseoController getController() {
        return controller;
    }

    public void setController(PaseoController controller) {
        this.controller = controller;
    }

    public EditText getPet_type() {
        return pet_type;
    }

    public void setPet_type(EditText pet_type) {
        this.pet_type = pet_type;
    }

    public EditText getAddress() {
        return address;
    }

    public void setAddress(EditText address) {
        this.address = address;
    }

    public EditText getPet_size() {
        return pet_size;
    }

    public void setPet_size(EditText pet_size) {
        this.pet_size = pet_size;
    }

    public EditText getPet_interest() {
        return pet_interest;
    }

    public void setPet_interest(EditText pet_interest) {
        this.pet_interest = pet_interest;
    }

    public EditText getPet_facts() {
        return pet_facts;
    }

    public void setPet_facts(EditText pet_facts) {
        this.pet_facts = pet_facts;
    }
}
