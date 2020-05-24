package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.CreateAccountTypeController;

public class CreateAccountType extends AppCompatActivity {

    private Button btn_loginUser;
    private Button btn_loginCollaborator;
    private CreateAccountTypeController createAccountTypeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_account_type);

        btn_loginUser = findViewById(R.id.btn_service);
        btn_loginCollaborator = findViewById(R.id.btn_product);

        createAccountTypeController = new CreateAccountTypeController(this);
    }

    public CreateAccountTypeController getCreateAccountTypeController() {
        return createAccountTypeController;
    }

    public void setCreateAccountTypeController(CreateAccountTypeController createAccountTypeController) {
        this.createAccountTypeController = createAccountTypeController;
    }

    public Button getBtn_loginUser() {
        return btn_loginUser;
    }

    public void setBtn_loginUser(Button btn_loginUser) {
        this.btn_loginUser = btn_loginUser;
    }

    public Button getBtn_loginCollaborator() {
        return btn_loginCollaborator;
    }

    public void setBtn_loginCollaborator(Button btn_loginCollaborator) {
        this.btn_loginCollaborator = btn_loginCollaborator;
    }
}
