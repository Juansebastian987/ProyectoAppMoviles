package com.application.proyectoappmoviles.controller.loginController;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.application.proyectoappmoviles.view.createAccount.CreateAccountType;
import com.application.proyectoappmoviles.view.login.Login;
import com.application.proyectoappmoviles.view.login.LoginType;
import com.application.proyectoappmoviles.view.login.LoginUser;

public class LoginController implements View.OnClickListener {

   private Login login;

    public LoginController(Login login) {
        this.login = login;
        login.getBtn_createAccountPrincipal().setOnClickListener(this);
        login.getBtn_loginPrincipal().setOnClickListener(this);
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public void onClick(View view) {
        if(login.getBtn_loginPrincipal() == view){
            Intent i = new Intent(login, LoginType.class);
            login.startActivity(i);
        }else if(login.getBtn_createAccountPrincipal() == view){
            Intent i = new Intent(login, CreateAccountType.class);
            login.startActivity(i);
        }
    }
}
