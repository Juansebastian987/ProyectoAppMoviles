package com.application.proyectoappmoviles.view.account.products;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.accountController.productsController.PagoController;

public class Pago extends AppCompatActivity {

    private TextView fullName, email, celphone, costo, costoTotal, productoSeleccionado, codeProducto;
    private Button pagar;
    private PagoController pagoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        fullName = findViewById(R.id.txt_infoFullnamePago);
        email = findViewById(R.id.txt_infocorreoPago);
        celphone = findViewById(R.id.txt_infoCelPago);
        costo = findViewById(R.id.txt_infocostoPago);
        costoTotal = findViewById(R.id.txt_infocostoTotalPago);
        productoSeleccionado = findViewById(R.id.txt_infoproductSelectPago);
        codeProducto = findViewById(R.id.txt_infocodePago);
        pagar = findViewById(R.id.btn_efectuarPago);

        pagoController = new PagoController(this);

    }

    public TextView getFullName() {
        return fullName;
    }

    public void setFullName(TextView fullName) {
        this.fullName = fullName;
    }

    public TextView getEmail() {
        return email;
    }

    public void setEmail(TextView email) {
        this.email = email;
    }

    public TextView getCelphone() {
        return celphone;
    }

    public void setCelphone(TextView celphone) {
        this.celphone = celphone;
    }

    public TextView getCosto() {
        return costo;
    }

    public void setCosto(TextView costo) {
        this.costo = costo;
    }

    public TextView getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(TextView costoTotal) {
        this.costoTotal = costoTotal;
    }

    public TextView getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(TextView productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public TextView getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(TextView codeProducto) {
        this.codeProducto = codeProducto;
    }

    public Button getPagar() {
        return pagar;
    }

    public void setPagar(Button pagar) {
        this.pagar = pagar;
    }

    public PagoController getPagoController() {
        return pagoController;
    }

    public void setPagoController(PagoController pagoController) {
        this.pagoController = pagoController;
    }
}
