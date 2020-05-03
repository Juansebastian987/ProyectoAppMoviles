package com.application.proyectoappmoviles.view.createAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.createAccountController.AskCollaboratorController;

public class AskCollaborator extends AppCompatActivity {

    private EditText editText_workPetsCollaborator;
    private EditText editText_timeCollaborator;
    private EditText editText_vehicleCollaborator;
    private ImageButton img_nextAskCollaborator;
    private TextView txt_helpAskCollaborator;
    private AskCollaboratorController askCollaboratorController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_collaborator);

        editText_workPetsCollaborator = findViewById(R.id.editText_workPetsCollaborator);
        editText_timeCollaborator = findViewById(R.id.editText_timeCollaborator);
        editText_vehicleCollaborator = findViewById(R.id.editText_vehicleCollaborator);
        img_nextAskCollaborator = findViewById(R.id.img_nextAskCollaborator);
        txt_helpAskCollaborator = findViewById(R.id.txt_helpAskCollaborator);

        askCollaboratorController = new AskCollaboratorController(this);
    }

    public EditText getEditText_workPetsCollaborator() {
        return editText_workPetsCollaborator;
    }

    public void setEditText_workPetsCollaborator(EditText editText_workPetsCollaborator) {
        this.editText_workPetsCollaborator = editText_workPetsCollaborator;
    }

    public EditText getEditText_timeCollaborator() {
        return editText_timeCollaborator;
    }

    public void setEditText_timeCollaborator(EditText editText_timeCollaborator) {
        this.editText_timeCollaborator = editText_timeCollaborator;
    }

    public EditText getEditText_vehicleCollaborator() {
        return editText_vehicleCollaborator;
    }

    public void setEditText_vehicleCollaborator(EditText editText_vehicleCollaborator) {
        this.editText_vehicleCollaborator = editText_vehicleCollaborator;
    }

    public ImageButton getImg_nextAskCollaborator() {
        return img_nextAskCollaborator;
    }

    public void setImg_nextAskCollaborator(ImageButton img_nextAskCollaborator) {
        this.img_nextAskCollaborator = img_nextAskCollaborator;
    }

    public TextView getTxt_helpAskCollaborator() {
        return txt_helpAskCollaborator;
    }

    public void setTxt_helpAskCollaborator(TextView txt_helpAskCollaborator) {
        this.txt_helpAskCollaborator = txt_helpAskCollaborator;
    }
}
