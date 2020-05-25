package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
import com.application.proyectoappmoviles.view.home.OrdersPlacedActivity;
import com.application.proyectoappmoviles.view.home.ProductActivity;
import com.application.proyectoappmoviles.view.home.ServiceActivity;
import com.application.proyectoappmoviles.view.home.HomeActivity;

public class HomeController implements View.OnClickListener{

private HomeActivity activity;
private Intent intent;


public HomeController(HomeActivity activity){
    this.activity=activity;

    activity.getBtn_help().setOnClickListener(this);
    activity.getBtn_ordersPlaced().setOnClickListener(this);
    activity.getBtn_product().setOnClickListener(this);
    activity.getBtn_service().setOnClickListener(this);
}


    @Override
    public void onClick(View v) {

    switch (v.getId()){
        case R.id.btn_help:
            intent= new Intent(activity, AboutUs.class);
            activity.startActivity(intent);


        case R.id.btn_product:

            intent= new Intent(activity, ProductActivity.class);
            activity.startActivity(intent);

        case R.id.btn_ordersPlaced:

            intent= new Intent(activity, OrdersPlacedActivity.class);
            activity.startActivity(intent);

        case R.id.btn_service:
            intent= new Intent(activity, ServiceActivity.class);
            activity.startActivity(intent);






            //trying to fix things up
    }




}







}
