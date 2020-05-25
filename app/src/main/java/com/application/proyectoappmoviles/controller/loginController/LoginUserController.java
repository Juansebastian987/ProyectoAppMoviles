package com.application.proyectoappmoviles.controller.loginController;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.application.proyectoappmoviles.view.home.HomeActivity;
import com.application.proyectoappmoviles.view.login.LoginUser;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginUserController implements View.OnClickListener {

    private LoginUser loginUser;

    public LoginUserController(LoginUser loginUser) {
        this.loginUser = loginUser;

        loginUser.getBtn_login().setOnClickListener(this);
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public void onClick(View view) {
        if(loginUser.getBtn_login()==view){

            String email = loginUser.getLoginUserEmail().getText().toString();
            String pwd = loginUser.getLoginPwdUser().getText().toString();

            //if(){ -> If encargado de sacar el dato de
            //
            //}

            Log.i(">>>", email+" "+pwd);

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,pwd)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {

                        Intent i = new Intent(loginUser, HomeActivity.class);
                        loginUser.startActivity(i);
                        loginUser.finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(loginUser, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
        }
    }
}
