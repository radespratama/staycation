package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText usernameField, passwordField;
    TextView buttonHandlerSignIn, toRegisterActivity;
    ImageView buttonBackToStartOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        buttonHandlerSignIn = findViewById(R.id.buttonHandlerSignIn);

        buttonBackToStartOne = findViewById(R.id.buttonBackToStartOne);
        toRegisterActivity = findViewById(R.id.toRegisterActivity);

        buttonHandlerSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences valuePreference = getSharedPreferences("LoginPreferences", MODE_PRIVATE);
                SharedPreferences.Editor editor = valuePreference.edit();

                String username = usernameField.getText().toString();
                String password = passwordField.getText().toString();

            }
        });

        toRegisterActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        buttonBackToStartOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}