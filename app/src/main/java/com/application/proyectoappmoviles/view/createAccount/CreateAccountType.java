package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.CreateAccountTypeController;

public class CreateAccountType extends AppCompatActivity {

    private Button btn_createUser;
    private Button btn_createCollaborator;
    private CreateAccountTypeController createAccountTypeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_account_type);

        btn_createUser = findViewById(R.id.btn_createUser);
        btn_createCollaborator = findViewById(R.id.btn_createCollaborator);

        createAccountTypeController = new CreateAccountTypeController(this);
    }

    public CreateAccountTypeController getCreateAccountTypeController() {
        return createAccountTypeController;
    }

    public void setCreateAccountTypeController(CreateAccountTypeController createAccountTypeController) {
        this.createAccountTypeController = createAccountTypeController;
    }

    public Button getBtn_createUser() {
        return btn_createUser;
    }

    public void setBtn_createUser(Button btn_createUser) {
        this.btn_createUser = btn_createUser;
    }

    public Button getBtn_createCollaborator() {
        return btn_createCollaborator;
    }

    public void setBtn_createCollaborator(Button btn_createCollaborator) {
        this.btn_createCollaborator = btn_createCollaborator;
    }
}
