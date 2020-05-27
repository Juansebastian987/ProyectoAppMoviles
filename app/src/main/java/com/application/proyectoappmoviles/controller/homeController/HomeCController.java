package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
import com.application.proyectoappmoviles.view.home.HomeCActivity;
import com.application.proyectoappmoviles.view.home.Resume;

public class HomeCController implements View.OnClickListener {

    private HomeCActivity activity;
    private Intent intent;

    public HomeCController(HomeCActivity activity) {
        this.activity = activity;
        activity.getBtn_helpC().setOnClickListener(this);
        activity.getBtn_pendentPro().setOnClickListener(this);
        activity.getBtn_pendentserv().setOnClickListener(this);
        activity.getFab2().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(activity.getBtn_helpC()==v){
            intent = new Intent(activity, AboutUs.class);
            activity.startActivity(intent);
            activity.finish();
        }else if(activity.getFab2()==v){
            intent=new Intent(activity, Resume.class);
            activity.startActivity(intent);
            activity.finish();

        }
    }
}