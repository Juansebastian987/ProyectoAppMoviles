package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;

public class ValidateController {

    private ValidateAccountUser validateAccountUser;

    public ValidateController(ValidateAccountUser validateAccountUser) {
        this.validateAccountUser = validateAccountUser;
    }

    public ValidateAccountUser getValidateAccountUser() {
        return validateAccountUser;
    }

    public void setValidateAccountUser(ValidateAccountUser validateAccountUser) {
        this.validateAccountUser = validateAccountUser;
    }
}
