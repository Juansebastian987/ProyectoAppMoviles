package com.application.proyectoappmoviles.controller.homeController;


import android.view.View;

import com.application.proyectoappmoviles.view.home.ProductActivity;

public class ProductController implements View.OnClickListener {

    private ProductActivity productActivity;

    public ProductController(ProductActivity productActivity) {
        this.productActivity = productActivity;

        productActivity.getComida1().setOnClickListener(this);
        productActivity.getComida2().setOnClickListener(this);
        productActivity.getComida3().setOnClickListener(this);
        productActivity.getComida4().setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(productActivity.getComida1() == view){

        }
        else if (productActivity.getComida2() == view) {

        }
        else if(productActivity.getComida3() == view){

        }
        else if(productActivity.getComida4() == view){

        }
    }
}
