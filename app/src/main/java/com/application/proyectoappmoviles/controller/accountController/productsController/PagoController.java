package com.application.proyectoappmoviles.controller.accountController.productsController;

import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.model.PagoProducto;
import com.application.proyectoappmoviles.view.account.products.Pago;
import com.application.proyectoappmoviles.view.home.HomeActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PagoController implements View.OnClickListener {

    private Pago pago;

    public PagoController(Pago pago) {
        this.pago = pago;
        pago.getPagar().setOnClickListener(this);
        actualizarComponentes();
    }

    public void actualizarComponentes(){
        FirebaseDatabase.getInstance().getReference().child("users")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        if(dataSnapshot.exists()){
                            String id = FirebaseAuth.getInstance().getUid();

                            String name = dataSnapshot.child(id).child("full_name").getValue().toString();
                            String email = dataSnapshot.child(id).child("email").getValue().toString();
                            String cel = dataSnapshot.child(id).child("number").getValue().toString();

                            String producto = pago.getIntent().getExtras().getString("producto");

                            if(producto.equals("1")){
                                String costo = "10.000";
                                String productoName = "Dog chow 2kg";
                                String costoTotal = "15.000";
                                String code = GenerarPalabra();

                                pago.getFullName().setText(name);
                                pago.getEmail().setText(email);
                                pago.getCelphone().setText(cel);
                                pago.getProductoSeleccionado().setText(productoName);
                                pago.getCosto().setText(costo);
                                pago.getCostoTotal().setText(costoTotal);
                                pago.getCodeProducto().setText(code);

                                PagoProducto pagoProducto = new PagoProducto(id, "tfWuFCJsaodVbhe6dwYSqLNSgHC2", email, cel, productoName, costo, costoTotal, code);
                                FirebaseDatabase.getInstance().getReference().child("productos").child(code).setValue(pagoProducto);

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


    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @Override
    public void onClick(View view) {
        if(pago.getPagar() == view){
            Intent i = new Intent(pago, HomeActivity.class);
            pago.startActivity(i);
            pago.finish();
        }
    }
}
