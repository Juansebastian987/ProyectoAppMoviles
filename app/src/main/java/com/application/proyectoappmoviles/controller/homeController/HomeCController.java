package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
import com.application.proyectoappmoviles.view.home.HomeCActivity;
import com.application.proyectoappmoviles.view.home.OrdersPlacedActivity;
import com.application.proyectoappmoviles.view.home.ProductActivity;
import com.application.proyectoappmoviles.view.home.ServiceActivity;

public class HomeCController implements View.OnClickListener {

    private HomeCActivity activity;
    private Intent intent;

    public HomeCController(HomeCActivity activity) {
        this.activity = activity;

        activity.getBtn_helpC().setOnClickListener(this);
        activity.getBtn_pendentPro().setOnClickListener(this);
        activity.getBtn_pendentserv().setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_helpC:
                intent = new Intent(activity, AboutUs.class);
                activity.startActivity(intent);


            case R.id.btn_pendentpro:


            case R.id.btn_pendentserv:



        }
    }
}