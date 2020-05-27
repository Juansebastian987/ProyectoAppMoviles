package com.application.proyectoappmoviles.controller.loginController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.view.login.LoginCollaborator;
import com.application.proyectoappmoviles.view.login.LoginType;
import com.application.proyectoappmoviles.view.login.LoginUser;

public class LoginTypeController implements View.OnClickListener {

    private LoginType loginType;

    public LoginTypeController(LoginType loginType) {
        this.loginType = loginType;

        loginType.getBtn_loginCollaborator().setOnClickListener(this);
        loginType.getBtn_loginUser().setOnClickListener(this);
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    @Override
    public void onClick(View view) {
        if(loginType.getBtn_loginUser() == view){
            Intent i = new Intent(loginType, LoginUser.class);
            loginType.startActivity(i);
            loginType.finish();

        }else if(loginType.getBtn_loginCollaborator() == view){
            Intent i = new Intent(loginType, LoginCollaborator.class);
            loginType.startActivity(i);
            loginType.finish();
        }
    }
}
