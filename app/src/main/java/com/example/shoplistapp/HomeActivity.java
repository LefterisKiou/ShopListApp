package com.example.shoplistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout dressesLayout = findViewById(R.id.home_dresses);
        LinearLayout shoesLayout = findViewById(R.id.home_shoes);
        LinearLayout glaseesLayout = findViewById(R.id.home_sunglasses);
        LinearLayout watchesLayout = findViewById(R.id.home_watches);
        Button logoutBtn = findViewById(R.id.logout_btn);
        dressesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, dresses_activity.class);
                startActivity(intent);
            }
        });
        shoesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, shoes_activity.class);
                startActivity(intent);
            }
        });
        glaseesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, glasses_activity.class);
                startActivity(intent);
            }
        });
        watchesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, watches_activity.class);
                startActivity(intent);
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}