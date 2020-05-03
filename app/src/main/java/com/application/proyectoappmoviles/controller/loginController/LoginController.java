package com.application.proyectoappmoviles.controller.loginController;

import com.application.proyectoappmoviles.view.login.Login;
import com.application.proyectoappmoviles.view.login.LoginUser;

public class LoginController {

   private Login login;

    public LoginController(Login login) {
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
