package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.CreateAccountCollaboratorController;

public class CreateAccountCollaborator extends AppCompatActivity {

    private EditText editText_nameCollaborator;
    private EditText editText_numberCollaborator;
    private EditText editText_emailCollaborator;
    private EditText editText_pwdCollaborator;
    private ImageView img_nextCreateAccountCollaborator;
    private TextView text_helpCreateAccountCollaborator;
    private CreateAccountCollaboratorController createAccountCollaboratorController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_collaborator);

        editText_nameCollaborator = findViewById(R.id.editText_nameCollaborator);
        editText_numberCollaborator = findViewById(R.id.editText_numberCollaborator);
        editText_emailCollaborator = findViewById(R.id.editText_emailCollaborator);
        editText_pwdCollaborator = findViewById(R.id.editText_pwdCollaborator);
        img_nextCreateAccountCollaborator = findViewById(R.id.img_nextCreateAccountCollaborator);
        text_helpCreateAccountCollaborator = findViewById(R.id.text_helpCreateAccountCollaborator);

        createAccountCollaboratorController = new CreateAccountCollaboratorController(this);
    }

    public CreateAccountCollaboratorController getCreateAccountCollaboratorController() {
        return createAccountCollaboratorController;
    }

    public void setCreateAccountCollaboratorController(CreateAccountCollaboratorController createAccountCollaboratorController) {
        this.createAccountCollaboratorController = createAccountCollaboratorController;
    }

    public EditText getEditText_nameCollaborator() {
        return editText_nameCollaborator;
    }

    public void setEditText_nameCollaborator(EditText editText_nameCollaborator) {
        this.editText_nameCollaborator = editText_nameCollaborator;
    }

    public EditText getEditText_numberCollaborator() {
        return editText_numberCollaborator;
    }

    public void setEditText_numberCollaborator(EditText editText_numberCollaborator) {
        this.editText_numberCollaborator = editText_numberCollaborator;
    }

    public EditText getEditText_emailCollaborator() {
        return editText_emailCollaborator;
    }

    public void setEditText_emailCollaborator(EditText editText_emailCollaborator) {
        this.editText_emailCollaborator = editText_emailCollaborator;
    }

    public EditText getEditText_pwdCollaborator() {
        return editText_pwdCollaborator;
    }

    public void setEditText_pwdCollaborator(EditText editText_pwdCollaborator) {
        this.editText_pwdCollaborator = editText_pwdCollaborator;
    }

    public ImageView getImg_nextCreateAccountCollaborator() {
        return img_nextCreateAccountCollaborator;
    }

    public void setImg_nextCreateAccountCollaborator(ImageView img_nextCreateAccountCollaborator) {
        this.img_nextCreateAccountCollaborator = img_nextCreateAccountCollaborator;
    }

    public TextView getText_helpCreateAccountCollaborator() {
        return text_helpCreateAccountCollaborator;
    }

    public void setText_helpCreateAccountCollaborator(TextView text_helpCreateAccountCollaborator) {
        this.text_helpCreateAccountCollaborator = text_helpCreateAccountCollaborator;
    }
}
