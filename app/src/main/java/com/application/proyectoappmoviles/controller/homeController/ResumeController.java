package com.application.proyectoappmoviles.controller.homeController;

import android.content.Intent;
import android.view.View;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.view.MainActivity;
import com.application.proyectoappmoviles.view.home.Resume;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ResumeController implements View.OnClickListener{

    private Resume activity;
    private Intent intent;

    public ResumeController(Resume activity){
        this.activity=activity;
        activity.getBtn_back().setOnClickListener(this);
        activity.getBtn_logout().setOnClickListener(this);
        actualizarDatos();
    }

    @Override
    public void onClick(View v) {
        if(activity.getBtn_back()==v){
            activity.onBackPressed();
        }else if(activity.getBtn_logout()==v){

            intent=new Intent(activity, MainActivity.class);
            activity.startActivity(intent);
            activity.finish();
        }
    }


    public void actualizarDatos(){
        FirebaseDatabase.getInstance().getReference().child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String id = FirebaseAuth.getInstance().getUid();
                    String name = dataSnapshot.child(id).child("full_name").getValue().toString();
                    String email = dataSnapshot.child(id).child("email").getValue().toString();
                    String cel = dataSnapshot.child(id).child("number").getValue().toString();
                    String pets= dataSnapshot.child(id).child("questionsUser").child("names").getValue().toString();

                    activity.getTxt_nameres().setText(name);
                    activity.getTxt_contactres().setText(cel);
                    activity.getTxt_mailres().setText(email);
                    activity.getTxt_petsres().setText(pets);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



}
