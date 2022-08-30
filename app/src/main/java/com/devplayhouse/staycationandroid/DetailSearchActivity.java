package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class DetailSearchActivity extends AppCompatActivity {
    ImageView buttonBackToHome;
    EditText searchContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_search);

        buttonBackToHome = findViewById(R.id.buttonBackToHome);
        searchContent = findViewById(R.id.searchContent);

        buttonBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        searchContent.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(30),
        });
    }
}