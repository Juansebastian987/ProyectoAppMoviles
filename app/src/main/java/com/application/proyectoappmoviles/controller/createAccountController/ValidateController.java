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
import com.google.firebase.auth.FirebaseUser;

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
            Log.i(">>>", user.getEmail());
            Log.i(">>>", user.getFull_name());
            Log.i(">>>", user.getNumber());
            Log.i(">>>", user.getPassword());

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
            .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {

                }
            })
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(validateAccountUser, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });

            Intent i = new Intent(validateAccountUser, HomeActivity.class);
            validateAccountUser.startActivity(i);
            validateAccountUser.finish();

        }
    }
}
