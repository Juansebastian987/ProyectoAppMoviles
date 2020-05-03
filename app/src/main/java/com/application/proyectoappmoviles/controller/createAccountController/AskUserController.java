package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.AskUser;

public class AskUserController {

    private AskUser askUser;

    public AskUserController(AskUser askUser) {
        this.askUser = askUser;
    }

    public AskUser getAskUser() {
        return askUser;
    }

    public void setAskUser(AskUser askUser) {
        this.askUser = askUser;
    }
}
