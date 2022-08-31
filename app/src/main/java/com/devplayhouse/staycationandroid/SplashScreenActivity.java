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

        SharedPreferences dataAuthPreference = getSharedPreferences("UserInformation", MODE_PRIVATE);
        final Boolean isAlreadyLogin = dataAuthPreference.getBoolean("isLogged", false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(isAlreadyLogin){
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, StartActivity.class));
                }
            }
        }, 2000);
    }
}