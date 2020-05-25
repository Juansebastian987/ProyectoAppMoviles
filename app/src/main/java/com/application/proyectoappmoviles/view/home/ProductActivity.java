package com.application.proyectoappmoviles.view.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.ProductController;

public class ProductActivity extends AppCompatActivity {

    private Button comida1, comida2,comida3,comida4;
    private ProductController productController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        comida1 = findViewById(R.id.comida2v1_pro);
        comida2 = findViewById(R.id.comida2v2_pro);
        comida3 = findViewById(R.id.comida1v1_pro);
        comida4 = findViewById(R.id.comida1v2_pro);

        productController = new ProductController(this);
    }

    public Button getComida1() {
        return comida1;
    }

    public void setComida1(Button comida1) {
        this.comida1 = comida1;
    }

    public Button getComida2() {
        return comida2;
    }

    public void setComida2(Button comida2) {
        this.comida2 = comida2;
    }

    public Button getComida3() {
        return comida3;
    }

    public void setComida3(Button comida3) {
        this.comida3 = comida3;
    }

    public Button getComida4() {
        return comida4;
    }

    public void setComida4(Button comida4) {
        this.comida4 = comida4;
    }
}
