    package com.application.proyectoappmoviles.controller.homeController;

    import android.content.Intent;
    import android.view.View;

    import androidx.activity.OnBackPressedCallback;

    import com.application.proyectoappmoviles.view.account.aboutUs.AboutUs;
    import com.application.proyectoappmoviles.view.home.OrdersPlacedActivity;
    import com.application.proyectoappmoviles.view.home.ProductActivity;
    import com.application.proyectoappmoviles.view.home.ServiceActivity;
    import com.application.proyectoappmoviles.view.home.HomeActivity;

    public class HomeController implements View.OnClickListener{

        private HomeActivity activity;
        private Intent intent;

        public HomeController(HomeActivity activity){
              this.activity=activity;
              activity.getBtn_help().setOnClickListener(this);
              activity.getBtn_ordersPlaced().setOnClickListener(this);
              activity.getBtn_product().setOnClickListener(this);
              activity.getBtn_service().setOnClickListener(this);
              activity.getFab().setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        if(activity.getBtn_product() == v){
            intent= new Intent(activity, ProductActivity.class);
            activity.startActivity(intent);
        }
        else if(activity.getBtn_service() == v){
            intent= new Intent(activity, ServiceActivity.class);
            activity.startActivity(intent);
        }
        else if(activity.getBtn_help() ==v){
            intent= new Intent(activity, AboutUs.class);
            activity.startActivity(intent);
        }
        else if(activity.getBtn_ordersPlaced() == v){
            intent= new Intent(activity, OrdersPlacedActivity.class);
            activity.startActivity(intent);
        }
        else if(activity.getFab() == v){
            intent= new Intent(activity, ServiceActivity.class);
            activity.startActivity(intent);
         }
        else{
            activity.onBackPressed();
        }
       }

    }








