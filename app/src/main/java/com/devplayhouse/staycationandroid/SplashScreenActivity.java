package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loadingIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(loadingIntent);
                finish();
            }
        }, 2000);
    }
}