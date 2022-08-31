package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    TextView goToSignUp, goToSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        goToSignIn = findViewById(R.id.goToSignInActivity);
        goToSignUp = findViewById(R.id.goToSignUpActivity);

        goToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignUp = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(toSignUp);
            }
        });

        goToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignIn = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(toSignIn);
            }
        });

    }
}