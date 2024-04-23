package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void openCartPage(View view){
        Intent in=new Intent(this, Cart.class);
        startActivity(in);
    }
    public void openHomePage(View view){
        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
    }
    public void openiphon14promaxPage(View view){
        Intent in=new Intent(this, iphone14promax.class);
        startActivity(in);
    }

    public void signout(View view){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }

}