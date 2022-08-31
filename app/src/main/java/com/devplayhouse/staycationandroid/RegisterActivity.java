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

public class RegisterActivity extends AppCompatActivity {
    ImageView buttonBackToStartTwo;
    EditText usernameFieldRegister, passwordFieldRegister, emailFieldRegister;
    TextView buttonHandlerRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonBackToStartTwo = findViewById(R.id.buttonBackToStartTwo);

        usernameFieldRegister = findViewById(R.id.usernameFieldRegister);
        emailFieldRegister = findViewById(R.id.emailFieldRegister);
        passwordFieldRegister = findViewById(R.id.passwordFieldRegister);
        buttonHandlerRegister = findViewById(R.id.buttonHandlerRegister);

        SharedPreferences authPreferences = getSharedPreferences("UserInformation", MODE_PRIVATE);

        buttonHandlerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String usernameRegister = usernameFieldRegister.getText().toString();
                    String emailRegister = emailFieldRegister.getText().toString();
                    String passwordRegister = passwordFieldRegister.getText().toString();

                    if(usernameRegister.isEmpty() || emailRegister.isEmpty() || passwordRegister.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please fill out all fields!", Toast.LENGTH_SHORT).show();
                    } else {
                        SharedPreferences.Editor editor = authPreferences.edit();

                        editor.putString("username", usernameRegister);
                        editor.putString("email", emailRegister);
                        editor.putString("password", passwordRegister);
                        editor.putBoolean("isLogged", true);
                        editor.commit();

                        Toast.makeText(getApplicationContext(), "User Created Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    }

                } catch (Exception e){

                }
            }
        });

        buttonBackToStartTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}