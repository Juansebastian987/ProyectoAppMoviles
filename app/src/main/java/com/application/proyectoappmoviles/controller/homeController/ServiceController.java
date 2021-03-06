package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.model.Service;
import com.application.proyectoappmoviles.util.Constants;
import com.application.proyectoappmoviles.view.home.ServiceActivity;
import com.application.proyectoappmoviles.view.service.PaseoActivity;

public class ServiceController implements View.OnClickListener {

    private ServiceActivity activity;
    private Intent intent;

    public ServiceController(ServiceActivity activity){
        this.activity=activity;
        activity.getBanio_serv().setOnClickListener(this);
        activity.getEspecial_serv().setOnClickListener(this);
        activity.getPaseo_serv().setOnClickListener(this);
        activity.getVet_serv().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Hacerlo con IF
        if(activity.getPaseo_serv()==v){
            Service servicio= new Service("", "", "", "", "", "", "", Constants.PASEO);

            intent=new Intent(activity, PaseoActivity.class);
            intent.putExtra("serv",servicio );
            activity.startActivity(intent);
        }

    }
}
