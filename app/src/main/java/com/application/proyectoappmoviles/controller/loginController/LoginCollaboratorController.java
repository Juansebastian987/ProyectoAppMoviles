package com.application.proyectoappmoviles.controller.loginController;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
import com.application.proyectoappmoviles.view.home.HomeActivity;
import com.application.proyectoappmoviles.view.home.HomeCActivity;
import com.application.proyectoappmoviles.view.login.LoginCollaborator;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginCollaboratorController implements View.OnClickListener {

    private LoginCollaborator activity;

    public LoginCollaboratorController(LoginCollaborator activity){
        this.activity=activity;
        activity.getBtn_login().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(activity.getBtn_login()==v){

            String email = activity.getTxt_mail().getText().toString();
            String pwd = activity.getTxt_pass().getText().toString();

            //if(){ -> If encargado de sacar el dato de
            //
            //}

            // Log.i(">>>", email+" "+pwd);

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,pwd)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Intent i = new Intent(activity, HomeCActivity.class);
                            activity.startActivity(i);
                            activity.finish();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(activity, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        }
    }
}
