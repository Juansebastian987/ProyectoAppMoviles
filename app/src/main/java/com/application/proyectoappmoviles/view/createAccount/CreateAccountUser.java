package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.CreateAccountUserController;

public class CreateAccountUser extends AppCompatActivity {

    private EditText editText_nameUser;
    private EditText editText_numberUser;
    private EditText editText_emailUser;
    private EditText editText_pwdUser;
    private ImageButton img_nextCreateAccountUser;
    private TextView text_helpCreateAccountUser;
    private CreateAccountUserController createAccountUserController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_user);

        editText_nameUser = findViewById(R.id.editText_nameUser);
        editText_numberUser = findViewById(R.id.editText_numberUser);
        editText_emailUser = findViewById(R.id.editText_emailUser);
        editText_pwdUser = findViewById(R.id.editText_pwdUser);
        img_nextCreateAccountUser = findViewById(R.id.img_nextCreateAccountUser);
        text_helpCreateAccountUser = findViewById(R.id.text_helpCreateAccountUser);

        createAccountUserController = new CreateAccountUserController(this);
    }

    public CreateAccountUserController getCreateAccountUserController() {
        return createAccountUserController;
    }

    public void setCreateAccountUserController(CreateAccountUserController createAccountUserController) {
        this.createAccountUserController = createAccountUserController;
    }

    public EditText getEditText_nameUser() {
        return editText_nameUser;
    }

    public void setEditText_nameUser(EditText editText_nameUser) {
        this.editText_nameUser = editText_nameUser;
    }

    public EditText getEditText_numberUser() {
        return editText_numberUser;
    }

    public void setEditText_numberUser(EditText editText_numberUser) {
        this.editText_numberUser = editText_numberUser;
    }

    public EditText getEditText_emailUser() {
        return editText_emailUser;
    }

    public void setEditText_emailUser(EditText editText_emailUser) {
        this.editText_emailUser = editText_emailUser;
    }

    public EditText getEditText_pwdUser() {
        return editText_pwdUser;
    }

    public void setEditText_pwdUser(EditText editText_pwdUser) {
        this.editText_pwdUser = editText_pwdUser;
    }

    public ImageButton getImg_nextCreateAccountUser() {
        return img_nextCreateAccountUser;
    }

    public void setImg_nextCreateAccountUser(ImageButton img_nextCreateAccountUser) {
        this.img_nextCreateAccountUser = img_nextCreateAccountUser;
    }

    public TextView getText_helpCreateAccountUser() {
        return text_helpCreateAccountUser;
    }

    public void setText_helpCreateAccountUser(TextView text_helpCreateAccountUser) {
        this.text_helpCreateAccountUser = text_helpCreateAccountUser;
    }
}
