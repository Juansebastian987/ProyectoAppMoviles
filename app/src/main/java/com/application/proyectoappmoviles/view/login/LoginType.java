package com.application.proyectoappmoviles.view.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.loginController.LoginTypeController;

public class LoginType extends AppCompatActivity {

    private ImageView img_loginType;
    private Button btn_loginUser;
    private Button btn_loginCollaborator;
    private TextView txt_helpLoginType;
    private LoginTypeController loginTypeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_type);

        img_loginType = findViewById(R.id.img_createType);
        btn_loginUser = findViewById(R.id.btn_iamUser);
        btn_loginCollaborator = findViewById(R.id.btn_iamCollaborator);
        txt_helpLoginType = findViewById(R.id.txt_helpLoginType);

        loginTypeController = new LoginTypeController(this);
    }

    public TextView getTxt_helpLoginType() {
        return txt_helpLoginType;
    }

    public void setTxt_helpLoginType(TextView txt_helpLoginType) {
        this.txt_helpLoginType = txt_helpLoginType;
    }

    public ImageView getImg_loginType() {
        return img_loginType;
    }

    public void setImg_loginType(ImageView img_loginType) {
        this.img_loginType = img_loginType;
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

    public LoginTypeController getLoginTypeController() {
        return loginTypeController;
    }

    public void setLoginTypeController(LoginTypeController loginTypeController) {
        this.loginTypeController = loginTypeController;
    }
}
