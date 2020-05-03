package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.CreateAccountCollaborator;

public class CreateAccountCollaboratorController {

    private CreateAccountCollaborator createAccountCollaborator;

    public CreateAccountCollaboratorController(CreateAccountCollaborator createAccountCollaborator) {
        this.createAccountCollaborator = createAccountCollaborator;
    }

    public CreateAccountCollaborator getCreateAccountCollaborator() {
        return createAccountCollaborator;
    }

    public void setCreateAccountCollaborator(CreateAccountCollaborator createAccountCollaborator) {
        this.createAccountCollaborator = createAccountCollaborator;
    }
}
