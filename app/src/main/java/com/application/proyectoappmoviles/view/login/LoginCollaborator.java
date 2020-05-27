package com.application.proyectoappmoviles.view.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.loginController.LoginCollaboratorController;

public class LoginCollaborator extends AppCompatActivity {

    private EditText txt_mail;
    private EditText txt_pass;
    private Button btn_login;

    private LoginCollaboratorController controller;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_collaborator);

        txt_mail=findViewById(R.id.txt_mail_col);
        txt_pass=findViewById(R.id.txt_pass_col);
        btn_login=findViewById(R.id.btn_login_col);

        controller= new LoginCollaboratorController(this);

    }


    public EditText getTxt_mail() {
        return txt_mail;
    }

    public void setTxt_mail(EditText txt_mail) {
        this.txt_mail = txt_mail;
    }

    public EditText getTxt_pass() {
        return txt_pass;
    }

    public void setTxt_pass(EditText txt_pass) {
        this.txt_pass = txt_pass;
    }

    public Button getBtn_login() {
        return btn_login;
    }

    public void setBtn_login(Button btn_login) {
        this.btn_login = btn_login;
    }

    public LoginCollaboratorController getController() {
        return controller;
    }

    public void setController(LoginCollaboratorController controller) {
        this.controller = controller;
    }
}
