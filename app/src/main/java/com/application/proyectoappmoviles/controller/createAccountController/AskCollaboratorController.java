package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.application.proyectoappmoviles.model.QuestionsCollaborator;
import com.application.proyectoappmoviles.model.User;
import com.application.proyectoappmoviles.view.createAccount.AskCollaborator;
import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;

public class AskCollaboratorController implements View.OnClickListener {

    private AskCollaborator askCollaborator;
    private User user;

    public AskCollaboratorController(AskCollaborator askCollaborator) {
        this.askCollaborator = askCollaborator;
        user = (User) askCollaborator.getIntent().getSerializableExtra("user");
        askCollaborator.getImg_nextAskCollaborator().setOnClickListener(this);
    }

    public AskCollaborator getAskCollaborator() {
        return askCollaborator;
    }

    public void setAskCollaborator(AskCollaborator askCollaborator) {
        this.askCollaborator = askCollaborator;
    }

    @Override
    public void onClick(View view) {

        if(askCollaborator.getImg_nextAskCollaborator() == view){

            String time = askCollaborator.getEditText_timeCollaborator().getText().toString();
            String vehicle = askCollaborator.getEditText_vehicleCollaborator().getText().toString();
            String word = askCollaborator.getEditText_workPetsCollaborator().getText().toString();

            QuestionsCollaborator questionsCollaborator = new QuestionsCollaborator(word, time, vehicle);
            User newUser = new User(user.getId(), user.getFull_name(), user.getNumber(), user.getEmail(), user.getPassword(), user.getType(), questionsCollaborator);

            Intent i = new Intent(askCollaborator, ValidateAccountUser.class);
            i.putExtra("user", newUser);
            askCollaborator.startActivity(i);
            askCollaborator.finish();

        }

    }
}
