package com.application.proyectoappmoviles.controller.loginController;

import com.application.proyectoappmoviles.view.login.LoginUser;

public class LoginUserController {

    private LoginUser loginUser;

    public LoginUserController(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }
}
