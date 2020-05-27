package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
        Log.e("mens", "el error es:"+ activity.getPet_type().getText().toString());
        if(activity.getBtn_next()==v){

            if(activity.getPet_type().getText().toString().isEmpty() && activity.getAddress().getText().toString().isEmpty() && activity.getPet_facts().getText().toString().isEmpty()& activity.getPet_interest().getText().toString().isEmpty() && activity.getPet_size().getText().toString().isEmpty()){

                Toast.makeText(activity, "Por favor inserta todos los datos requeridos", Toast.LENGTH_SHORT).show();





            }else{


                String type=activity.getPet_type().getText().toString();
                String address=activity.getAddress().getText().toString();
                String facts=activity.getPet_facts().getText().toString();
                String interest=activity.getPet_interest().getText().toString();
                String size=activity.getPet_size().getText().toString();

                //Service service= new Service(address,type,size,interest,facts, "", "", "");
                Service service= (Service) activity.getIntent().getSerializableExtra("serv");
                service.setAddress(address);
                service.setPet_type(type);
                service.setPet_size(size);
                service.setPet_act(interest);
                service.setPet_fact(facts);

                intent= new Intent(activity, PagoServActivity.class);

                intent.putExtra("servicio", service );
                activity.startActivity(intent);



            }

        }

    }
}
