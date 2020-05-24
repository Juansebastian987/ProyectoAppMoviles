package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.model.User;
import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;
import com.application.proyectoappmoviles.view.home.HomeActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class ValidateController implements View.OnClickListener {

    private ValidateAccountUser validateAccountUser;
    private User user;

    public ValidateController(ValidateAccountUser validateAccountUser) {
        this.validateAccountUser = validateAccountUser;
        validateAccountUser.getBtn_sendCode().setOnClickListener(this);
        user = (User) validateAccountUser.getIntent().getSerializableExtra("user");

    }

    public ValidateAccountUser getValidateAccountUser() {
        return validateAccountUser;
    }

    public void setValidateAccountUser(ValidateAccountUser validateAccountUser) {
        this.validateAccountUser = validateAccountUser;
    }


    @Override
    public void onClick(View view) {
        if(validateAccountUser.getBtn_sendCode() == view){

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
            .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    String id = FirebaseAuth.getInstance().getUid();
                    user.setId(id);

                    if(user.getType().equals("0")){
                        FirebaseDatabase.getInstance().getReference()
                                .child("users").child(user.getId()).setValue(user);
                    }
                    else if(user.getType().equals("1")){
                        FirebaseDatabase.getInstance().getReference()
                                .child("collaborator").child(user.getId()).setValue(user);
                    }

                    Intent i = new Intent(validateAccountUser, HomeActivity.class);
                    validateAccountUser.startActivity(i);
                    validateAccountUser.finish();

                }
            })
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(validateAccountUser, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
