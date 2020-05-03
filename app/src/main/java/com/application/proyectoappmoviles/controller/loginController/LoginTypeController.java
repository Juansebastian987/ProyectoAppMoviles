package com.application.proyectoappmoviles.controller.loginController;

import com.application.proyectoappmoviles.view.login.LoginType;

public class LoginTypeController {

    private LoginType loginType;

    public LoginTypeController(LoginType loginType) {
        this.loginType = loginType;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
