package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.CreateAccountUser;

public class CreateAccountUserController {

    private CreateAccountUser createAccountUser;

    public CreateAccountUserController(CreateAccountUser createAccountUser) {
        this.createAccountUser = createAccountUser;
    }

    public CreateAccountUser getCreateAccountUser() {
        return createAccountUser;
    }

    public void setCreateAccountUser(CreateAccountUser createAccountUser) {
        this.createAccountUser = createAccountUser;
    }
}
