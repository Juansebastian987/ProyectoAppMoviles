package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.AskUserController;

public class AskUser extends AppCompatActivity {

    private EditText editText_petsAskUser;
    private EditText editText_namePetsUser;
    private EditText editText_agePetsUser;
    private ImageButton imgButton_nextAskUser;
    private TextView txt_helpAskUser;
    private AskUserController askUserController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_user);

        editText_petsAskUser = findViewById(R.id.editText_petsAskUser);
        editText_namePetsUser = findViewById(R.id.editText_namePetsUser);
        editText_agePetsUser = findViewById(R.id.editText_agePetsUser);
        imgButton_nextAskUser = findViewById(R.id.imgButton_nextAskUser);
        txt_helpAskUser = findViewById(R.id.txt_helpAskUser);

        askUserController = new AskUserController(this);
    }

    public AskUserController getAskUserController() {
        return askUserController;
    }

    public void setAskUserController(AskUserController askUserController) {
        this.askUserController = askUserController;
    }

    public EditText getEditText_petsAskUser() {
        return editText_petsAskUser;
    }

    public void setEditText_petsAskUser(EditText editText_petsAskUser) {
        this.editText_petsAskUser = editText_petsAskUser;
    }

    public EditText getEditText_namePetsUser() {
        return editText_namePetsUser;
    }

    public void setEditText_namePetsUser(EditText editText_namePetsUser) {
        this.editText_namePetsUser = editText_namePetsUser;
    }

    public EditText getEditText_agePetsUser() {
        return editText_agePetsUser;
    }

    public void setEditText_agePetsUser(EditText editText_agePetsUser) {
        this.editText_agePetsUser = editText_agePetsUser;
    }

    public ImageButton getImgButton_nextAskUser() {
        return imgButton_nextAskUser;
    }

    public void setImgButton_nextAskUser(ImageButton imgButton_nextAskUser) {
        this.imgButton_nextAskUser = imgButton_nextAskUser;
    }

    public TextView getTxt_helpAskUser() {
        return txt_helpAskUser;
    }

    public void setTxt_helpAskUser(TextView txt_helpAskUser) {
        this.txt_helpAskUser = txt_helpAskUser;
    }
}
