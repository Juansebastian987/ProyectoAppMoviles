package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.ValidateController;

public class ValidateAccountUser extends AppCompatActivity {

    private EditText editText_validateCode;
    private Button btn_sendCode;
    private Button btn_resendCode;
    private TextView txt_problemsValidate;
    private TextView txt_helpValidate;
    private ValidateController validateController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_account_user);

        editText_validateCode = findViewById(R.id.editText_validateCode);
        btn_sendCode = findViewById(R.id.btn_sendCode);
        btn_resendCode = findViewById(R.id.btn_resendCode);
        txt_problemsValidate = findViewById(R.id.txt_problemsValidate);
        txt_helpValidate = findViewById(R.id.txt_helpValidate);

        validateController = new ValidateController(this);
    }

    public ValidateController getValidateController() {
        return validateController;
    }

    public void setValidateController(ValidateController validateController) {
        this.validateController = validateController;
    }

    public TextView getTxt_helpValidate() {
        return txt_helpValidate;
    }

    public void setTxt_helpValidate(TextView txt_helpValidate) {
        this.txt_helpValidate = txt_helpValidate;
    }

    public EditText getEditText_validateCode() {
        return editText_validateCode;
    }

    public void setEditText_validateCode(EditText editText_validateCode) {
        this.editText_validateCode = editText_validateCode;
    }

    public Button getBtn_sendCode() {
        return btn_sendCode;
    }

    public void setBtn_sendCode(Button btn_sendCode) {
        this.btn_sendCode = btn_sendCode;
    }

    public Button getBtn_resendCode() {
        return btn_resendCode;
    }

    public void setBtn_resendCode(Button btn_resendCode) {
        this.btn_resendCode = btn_resendCode;
    }

    public TextView getTxt_problemsValidate() {
        return txt_problemsValidate;
    }

    public void setTxt_problemsValidate(TextView txt_problemsValidate) {
        this.txt_problemsValidate = txt_problemsValidate;
    }
}
