package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.CreateAccountType;

public class CreateAccountTypeController {

    private CreateAccountType createAccountType;

    public CreateAccountTypeController(CreateAccountType createAccountType) {
        this.createAccountType = createAccountType;
    }

    public CreateAccountType getCreateAccountType() {
        return createAccountType;
    }

    public void setCreateAccountType(CreateAccountType createAccountType) {
        this.createAccountType = createAccountType;
    }
}
