package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.model.User;
import com.application.proyectoappmoviles.view.createAccount.CreateAccountCollaborator;
import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;

public class CreateAccountCollaboratorController implements View.OnClickListener {

    private CreateAccountCollaborator createAccountCollaborator;

    public CreateAccountCollaboratorController(CreateAccountCollaborator createAccountCollaborator) {
        this.createAccountCollaborator = createAccountCollaborator;

        createAccountCollaborator.getImg_nextCreateAccountCollaborator().setOnClickListener(this);
    }

    public CreateAccountCollaborator getCreateAccountCollaborator() {
        return createAccountCollaborator;
    }

    public void setCreateAccountCollaborator(CreateAccountCollaborator createAccountCollaborator) {
        this.createAccountCollaborator = createAccountCollaborator;
    }

    @Override
    public void onClick(View view) {
        if(createAccountCollaborator.getImg_nextCreateAccountCollaborator() == view){

            String name = createAccountCollaborator.getEditText_nameCollaborator().getText().toString();
            String number = createAccountCollaborator.getEditText_numberCollaborator().getText().toString();
            String email = createAccountCollaborator.getEditText_emailCollaborator().getText().toString();
            String pwd = createAccountCollaborator.getEditText_pwdCollaborator().getText().toString();

            User user = new User(name, number, email, pwd);

            Intent i = new Intent(createAccountCollaborator, ValidateAccountUser.class);
            i.putExtra("user", user);
            createAccountCollaborator.startActivity(i);
            createAccountCollaborator.finish();

        }
    }
}
