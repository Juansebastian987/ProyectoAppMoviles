package com.application.proyectoappmoviles.view.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.application.proyectoappmoviles.R;
import com.application.proyectoappmoviles.controller.homeController.HomeController;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Button btn_help;
    private Button btn_product;
    private Button btn_service;
    private Button btn_ordersPlaced;
    private HomeController controller;
    private FloatingActionButton fab;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_home);

    btn_help= findViewById(R.id.btn_help);
    btn_product= findViewById(R.id.btn_product);
    btn_service= findViewById(R.id.btn_service);
    btn_ordersPlaced=findViewById(R.id.btn_ordersPlaced);
    fab=findViewById(R.id.fab);

    drawerLayout = findViewById(R.id.drawer_layout);
    navigationView=findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);

    controller= new HomeController(this);

}


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public DrawerLayout getDrawerLayout() {
        return drawerLayout;
    }

    public void setDrawerLayout(DrawerLayout drawerLayout) {
        this.drawerLayout = drawerLayout;
    }

    public NavigationView getNavigationView() {
        return navigationView;
    }

    public void setNavigationView(NavigationView navigationView) {
        this.navigationView = navigationView;
    }


    public HomeController getController() {
        return controller;
    }

    public void setController(HomeController controller) {
        this.controller = controller;
    }

    public Button getBtn_help() {
        return btn_help;
    }

    public void setBtn_help(Button btn_help) {
        this.btn_help = btn_help;
    }

    public Button getBtn_product() {
        return btn_product;
    }

    public void setBtn_product(Button btn_product) {
        this.btn_product = btn_product;
    }

    public Button getBtn_service() {
        return btn_service;
    }

    public void setBtn_service(Button btn_service) {
        this.btn_service = btn_service;
    }

    public Button getBtn_ordersPlaced() {
        return btn_ordersPlaced;
    }

    public void setBtn_ordersPlaced(Button btn_ordersPlaced) {
        this.btn_ordersPlaced = btn_ordersPlaced;
    }

    public FloatingActionButton getFab() {
        return fab;
    }

    public void setFab(FloatingActionButton fab) {
        this.fab = fab;
    }
}
