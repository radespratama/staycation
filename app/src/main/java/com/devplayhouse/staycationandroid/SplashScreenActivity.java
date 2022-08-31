package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences value = getSharedPreferences("LoginPreferences", MODE_PRIVATE);
        Boolean isAlreadyLogin = value.getBoolean("isLoged", false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loadingIntent = new Intent(SplashScreenActivity.this, StartActivity.class);
                startActivity(loadingIntent);
            }
        }, 2000);
    }
}