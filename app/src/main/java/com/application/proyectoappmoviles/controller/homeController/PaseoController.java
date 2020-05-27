package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.model.Service;
import com.application.proyectoappmoviles.view.account.products.Pago;
import com.application.proyectoappmoviles.view.service.PagoServActivity;
import com.application.proyectoappmoviles.view.service.PaseoActivity;

public class PaseoController implements View.OnClickListener{

    private PaseoActivity activity;
    private Intent intent;


    public PaseoController(PaseoActivity activity){
        this.activity=activity;

        activity.getBtn_next().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(activity.getBtn_next()==v){

            if(activity.getPet_type()!=null && activity.getAddress()!=null && activity.getPet_facts()!=null & activity.getPet_interest()!=null && activity.getPet_size()!=null){

                String type=activity.getPet_type().getText().toString();
                String address=activity.getAddress().getText().toString();
                String facts=activity.getPet_facts().getText().toString();
                String interest=activity.getPet_interest().getText().toString();
                String size=activity.getPet_size().getText().toString();

                Service service= new Service(address,type,size,interest,facts, "", "");
                intent= new Intent(activity, PagoServActivity.class);

                intent.putExtra("servicio", service );
                activity.startActivity(intent);



            }

        }

    }
}
