package com.application.proyectoappmoviles.view.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.loginController.LoginController;

public class Login extends AppCompatActivity {

    private ImageView img_logoPrincipal;
    private Button btn_loginPrincipal;
    private Button btn_createAccountPrincipal;
    private TextView txt_helpPrincipal;
    private LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img_logoPrincipal = findViewById(R.id.img_logoPrincipal);
        btn_loginPrincipal = findViewById(R.id.btn_loginPrincipal);
        btn_createAccountPrincipal = findViewById(R.id.btn_createAccountPrincipal);
        txt_helpPrincipal = findViewById(R.id.txt_helpPrincipal);

        loginController = new LoginController(this);
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public TextView getTxt_helpPrincipal() {
        return txt_helpPrincipal;
    }

    public void setTxt_helpPrincipal(TextView txt_helpPrincipal) {
        this.txt_helpPrincipal = txt_helpPrincipal;
    }

    public ImageView getImg_logoPrincipal() {
        return img_logoPrincipal;
    }

    public void setImg_logoPrincipal(ImageView img_logoPrincipal) {
        this.img_logoPrincipal = img_logoPrincipal;
    }

    public Button getBtn_loginPrincipal() {
        return btn_loginPrincipal;
    }

    public void setBtn_loginPrincipal(Button btn_loginPrincipal) {
        this.btn_loginPrincipal = btn_loginPrincipal;
    }

    public Button getBtn_createAccountPrincipal() {
        return btn_createAccountPrincipal;
    }

    public void setBtn_createAccountPrincipal(Button btn_createAccountPrincipal) {
        this.btn_createAccountPrincipal = btn_createAccountPrincipal;
    }
}

