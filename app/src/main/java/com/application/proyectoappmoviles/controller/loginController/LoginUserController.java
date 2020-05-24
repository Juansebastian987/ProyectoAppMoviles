package com.application.proyectoappmoviles.controller.loginController;

import android.view.View;

import com.application.proyectoappmoviles.view.login.LoginUser;

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

        }
    }
}
