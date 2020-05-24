package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.view.createAccount.CreateAccountCollaborator;
import com.application.proyectoappmoviles.view.createAccount.CreateAccountType;
import com.application.proyectoappmoviles.view.createAccount.CreateAccountUser;

public class CreateAccountTypeController implements View.OnClickListener {

    private CreateAccountType createAccountType;

    public CreateAccountTypeController(CreateAccountType createAccountType) {
        this.createAccountType = createAccountType;

        createAccountType.getBtn_createCollaborator().setOnClickListener(this);
        createAccountType.getBtn_createUser().setOnClickListener(this);
    }

    public CreateAccountType getCreateAccountType() {
        return createAccountType;
    }

    public void setCreateAccountType(CreateAccountType createAccountType) {
        this.createAccountType = createAccountType;
    }

    @Override
    public void onClick(View view) {
        if(createAccountType.getBtn_createUser()==view){
            Intent i = new Intent(createAccountType, CreateAccountUser.class);
            createAccountType.startActivity(i);
            createAccountType.finish();
        }else if(createAccountType.getBtn_createCollaborator()==view){
            Intent i = new Intent(createAccountType, CreateAccountCollaborator.class);
            createAccountType.startActivity(i);
            createAccountType.finish();
        }
    }
}
