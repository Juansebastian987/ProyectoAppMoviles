package com.application.proyectoappmoviles.view.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.loginController.LoginUserController;

public class LoginUser extends AppCompatActivity {

    private EditText loginUserEmail;
    private EditText loginPwdUser;
    private Button btn_login;
    private TextView txt_loginUserProblem;
    private TextView txt_helpLoginUser;
    private LoginUserController loginUserController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        loginUserEmail = findViewById(R.id.editText_loginUserEmail);
        loginPwdUser = findViewById(R.id.editText_loginPwdUser);
        btn_login = findViewById(R.id.btn_createUser);
        txt_loginUserProblem = findViewById(R.id.txt_loginUserProblem);
        txt_helpLoginUser = findViewById(R.id.txt_helpLoginUser);

        loginUserController = new LoginUserController(this);
    }

    public TextView getTxt_loginUserProblem() {
        return txt_loginUserProblem;
    }

    public void setTxt_loginUserProblem(TextView txt_loginUserProblem) {
        this.txt_loginUserProblem = txt_loginUserProblem;
    }

    public TextView getTxt_helpLoginUser() {
        return txt_helpLoginUser;
    }

    public void setTxt_helpLoginUser(TextView txt_helpLoginUser) {
        this.txt_helpLoginUser = txt_helpLoginUser;
    }

    public EditText getLoginPwdUser() {
        return loginPwdUser;
    }

    public void setLoginPwdUser(EditText loginPwdUser) {
        this.loginPwdUser = loginPwdUser;
    }

    public Button getBtn_login() {
        return btn_login;
    }

    public void setBtn_login(Button btn_login) {
        this.btn_login = btn_login;
    }

    public EditText getLoginUserEmail() {
        return loginUserEmail;
    }

    public void setLoginUserEmail(EditText loginUserEmail) {
        this.loginUserEmail = loginUserEmail;
    }

    public LoginUserController getLoginUserController() {
        return loginUserController;
    }

    public void setLoginUserController(LoginUserController loginUserController) {
        this.loginUserController = loginUserController;
    }
}
