package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText emailFieldLogin, passwordFieldLogin;
    TextView buttonHandlerLogin, toRegisterActivity;
    ImageView buttonBackToStartOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailFieldLogin = findViewById(R.id.emailFieldLogin);
        passwordFieldLogin = findViewById(R.id.passwordFieldLogin);
        buttonHandlerLogin = findViewById(R.id.buttonHandlerLogin);

        buttonBackToStartOne = findViewById(R.id.buttonBackToStartOne);
        toRegisterActivity = findViewById(R.id.toRegisterActivity);

        SharedPreferences dataAuthPreference = getSharedPreferences("UserInformation", MODE_PRIVATE);

        buttonHandlerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String emailLogin = emailFieldLogin.getText().toString();
                    String passwordLogin = passwordFieldLogin.getText().toString();

                    String emailSP = dataAuthPreference.getString("email", "Email is not available");
                    String passwordSP = dataAuthPreference.getString("password", "Password is incorrect");

                    if(emailLogin.equals(emailSP) && passwordLogin.equals(passwordSP)){
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "Email or Password incorrect", Toast.LENGTH_SHORT).show();
                    }
                } catch(Exception e){

                }
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