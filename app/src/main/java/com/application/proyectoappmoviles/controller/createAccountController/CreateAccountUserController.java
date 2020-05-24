package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.view.View;

import com.application.proyectoappmoviles.model.User;
import com.application.proyectoappmoviles.view.createAccount.CreateAccountUser;
import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;

public class CreateAccountUserController implements View.OnClickListener {

    private CreateAccountUser createAccountUser;

    public CreateAccountUserController(CreateAccountUser createAccountUser) {
        this.createAccountUser = createAccountUser;

        createAccountUser.getImg_nextCreateAccountUser().setOnClickListener(this);
    }

    public CreateAccountUser getCreateAccountUser() {
        return createAccountUser;
    }

    public void setCreateAccountUser(CreateAccountUser createAccountUser) {
        this.createAccountUser = createAccountUser;
    }

    @Override
    public void onClick(View view) {
        if(createAccountUser.getImg_nextCreateAccountUser()==view){

            String name = createAccountUser.getEditText_nameUser().getText().toString();
            String number = createAccountUser.getEditText_numberUser().getText().toString();
            String email = createAccountUser.getEditText_emailUser().getText().toString();
            String pwd = createAccountUser.getEditText_emailUser().getText().toString();

            User user = new User(name, number, email, pwd);

            Intent i = new Intent(createAccountUser, ValidateAccountUser.class);
            i.putExtra("user", user);
            createAccountUser.startActivity(i);
            createAccountUser.finish();
        }
    }
}
