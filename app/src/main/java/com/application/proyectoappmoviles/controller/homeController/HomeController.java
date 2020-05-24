package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
import com.application.proyectoappmoviles.view.home.ordersPlacedActivity;
import com.application.proyectoappmoviles.view.home.productActivity;
import com.application.proyectoappmoviles.view.home.serviceActivity;
import com.application.proyectoappmoviles.view.home.HomeActivity;

public class HomeController implements View.OnClickListener{

private HomeActivity activity;
private Intent intent;



public HomeController(HomeActivity activity){
    this.activity=activity;

}


    @Override
    public void onClick(View v) {

    switch (v.getId()){
        case R.id.btn_help:
            intent= new Intent(activity, AboutUs.class);
            activity.startActivity(intent);


        case R.id.btn_product:

            intent= new Intent(activity, productActivity.class);
            activity.startActivity(intent);

        case R.id.btn_ordersPlaced:

            intent= new Intent(activity, ordersPlacedActivity.class);
            activity.startActivity(intent);

        case R.id.btn_service:
            intent= new Intent(activity, serviceActivity.class);
            activity.startActivity(intent);






            //trying to fix things up
    }




}







}
