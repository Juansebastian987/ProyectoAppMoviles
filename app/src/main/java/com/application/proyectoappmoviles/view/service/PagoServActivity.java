package com.application.proyectoappmoviles.view.service;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.ServicPaymentController.PaymentSerController;

public class PagoServActivity extends AppCompatActivity {

    private TextView txt_name, txt_mail, txt_tel, txt_serv, txt_cost, txt_comiss,txt_total, txt_code;
    private Button btn_payment;
    private PaymentSerController controller;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagoserv);

        txt_name= findViewById(R.id.txt_name);
        txt_mail= findViewById(R.id.txt_mail_col);
        txt_tel= findViewById(R.id.txt_tel);
        txt_serv= findViewById(R.id.txt_serv);
        txt_cost= findViewById(R.id.txt_cost);
        txt_comiss= findViewById(R.id.txt_comiss);
        txt_total= findViewById(R.id.txt_total);
        txt_code=findViewById(R.id.txt_code);
        btn_payment=findViewById(R.id.btn_payment);

        controller= new PaymentSerController(this);
    }

    public TextView getTxt_code() {
        return txt_code;
    }

    public void setTxt_code(TextView txt_code) {
        this.txt_code = txt_code;
    }

    public PaymentSerController getController() {
        return controller;
    }

    public void setController(PaymentSerController controller) {
        this.controller = controller;
    }

    public TextView getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(TextView txt_name) {
        this.txt_name = txt_name;
    }

    public TextView getTxt_mail() {
        return txt_mail;
    }

    public void setTxt_mail(TextView txt_mail) {
        this.txt_mail = txt_mail;
    }

    public TextView getTxt_tel() {
        return txt_tel;
    }

    public void setTxt_tel(TextView txt_tel) {
        this.txt_tel = txt_tel;
    }

    public TextView getTxt_serv() {
        return txt_serv;
    }

    public void setTxt_serv(TextView txt_serv) {
        this.txt_serv = txt_serv;
    }

    public TextView getTxt_cost() {
        return txt_cost;
    }

    public void setTxt_cost(TextView txt_cost) {
        this.txt_cost = txt_cost;
    }

    public TextView getTxt_comiss() {
        return txt_comiss;
    }

    public void setTxt_comiss(TextView txt_comiss) {
        this.txt_comiss = txt_comiss;
    }

    public TextView getTxt_total() {
        return txt_total;
    }

    public void setTxt_total(TextView txt_total) {
        this.txt_total = txt_total;
    }

    public Button getBtn_payment() {
        return btn_payment;
    }

    public void setBtn_payment(Button btn_payment) {
        this.btn_payment = btn_payment;
    }
}
