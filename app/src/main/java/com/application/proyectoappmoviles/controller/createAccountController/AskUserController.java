package com.application.proyectoappmoviles.controller.createAccountController;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.application.proyectoappmoviles.model.QuestionsUser;
import com.application.proyectoappmoviles.model.User;
import com.application.proyectoappmoviles.view.createAccount.AskUser;
import com.application.proyectoappmoviles.view.createAccount.ValidateAccountUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AskUserController implements View.OnClickListener {

    private AskUser askUser;
    private User user;

    public AskUserController(AskUser askUser) {
        this.askUser = askUser;
        user = (User) askUser.getIntent().getSerializableExtra("user");
        askUser.getImgButton_nextAskUser().setOnClickListener(this);
    }

    public AskUser getAskUser() {
        return askUser;
    }

    public void setAskUser(AskUser askUser) {
        this.askUser = askUser;
    }

    @Override
    public void onClick(View view) {
        if(askUser.getImgButton_nextAskUser() == view){

            String numberPets = askUser.getEditText_petsAskUser().getText().toString();
            String[] names = askUser.getEditText_namePetsUser().getText().toString().split(",");
            String[] ages = askUser.getEditText_agePetsUser().getText().toString().split(",");

            List<String> al = new ArrayList<String>();
            al = Arrays.asList(names);

            List<String> al2 = new ArrayList<String>();
            al2 = Arrays.asList(ages);

            QuestionsUser questionsUser = new QuestionsUser(numberPets, al, al2);

            User newUser = new User(user.getId(), user.getFull_name(), user.getNumber(), user.getEmail(), user.getPassword(), user.getType(), questionsUser);
            Intent i = new Intent(askUser, ValidateAccountUser.class);
            i.putExtra("user", newUser);
            askUser.startActivity(i);
            askUser.finish();
        }
    }
}
