package com.application.proyectoappmoviles.controller.ServicPaymentController;

import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.model.PagoProducto;
import com.application.proyectoappmoviles.model.Service;
import com.application.proyectoappmoviles.view.home.HomeActivity;
import com.application.proyectoappmoviles.view.service.PagoServActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PaymentSerController implements View.OnClickListener{

    private PagoServActivity activity;
    private Intent intent;

    public PaymentSerController(PagoServActivity activity){
        this.activity=activity;
        activity.getBtn_payment().setOnClickListener(this);
        actualizarComponentes();
    }

    @Override
    public void onClick(View v) {
        if(activity.getBtn_payment()==v){
            intent= new Intent(activity, HomeActivity.class);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public void actualizarComponentes(){
        FirebaseDatabase.getInstance().getReference().child("users")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        if(dataSnapshot.exists()){

                            Service service= (Service) activity.getIntent().getSerializableExtra("servicio");
                            String id = FirebaseAuth.getInstance().getUid();
                            String name = dataSnapshot.child(id).child("full_name").getValue().toString();
                            String email = dataSnapshot.child(id).child("email").getValue().toString();
                            String cel = dataSnapshot.child(id).child("number").getValue().toString();
                            String address= service.getAddress();
                            String type= service.getPet_type();
                            String size=service.getPet_size();
                            String act= service.getPet_act();
                            String fact=service.getPet_fact();
                            String colaborador=service.getId_collaborator();

                            //String producto = activity.getIntent().getExtras().getString("producto");


                            if(service!=null){
                                String costo = "10.000";
                                //String productoName = "Dog chow 2kg";
                                String costoTotal = "15.000";
                                String code = GenerarPalabra();

                                activity.getTxt_name().setText(name);
                                activity.getTxt_mail().setText(email);
                                activity.getTxt_tel().setText(cel);
                               // activity.getTxt_serv().setText(productoName);
                                activity.getTxt_cost().setText(costo);
                                activity.getTxt_total().setText(costoTotal);
                                activity.getTxt_code().setText(code);

                                Service servi = new Service(address,type, size,act,fact,id,colaborador);
                                FirebaseDatabase.getInstance().getReference().child("servicios").child(code).setValue(servi);

                            }

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }


    public  String GenerarPalabra(){
        String palabra = "";
        int caracteres = (int)(Math.random()*20)+2;
        for (int i=0; i<caracteres; i++){
            int codigoAscii = (int)Math.floor(Math.random()*(122 - 97)+97);
            palabra = palabra + (char)codigoAscii;
        }
        return palabra;
    }


}
