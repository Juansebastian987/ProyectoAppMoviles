package com.application.proyectoappmoviles.controller.createAccountController;

import com.application.proyectoappmoviles.view.createAccount.AskCollaborator;

public class AskCollaboratorController {

    private AskCollaborator askCollaborator;

    public AskCollaboratorController(AskCollaborator askCollaborator) {
        this.askCollaborator = askCollaborator;
    }

    public AskCollaborator getAskCollaborator() {
        return askCollaborator;
    }

    public void setAskCollaborator(AskCollaborator askCollaborator) {
        this.askCollaborator = askCollaborator;
    }
}
