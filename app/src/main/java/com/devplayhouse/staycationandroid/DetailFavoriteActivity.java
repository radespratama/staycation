package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailFavoriteActivity extends AppCompatActivity {
    ImageView buttonBackToHome;
    TextView detailTitle, detailLocation, detailDescription, detailRating, detailPrice;
    RelativeLayout detailImage;
    String contentTitle, contentLocation, contentDescription, contentRating, contentPrice;
    Integer contentImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_favorite);

        buttonBackToHome = findViewById(R.id.buttonBackToHome);

        detailTitle = findViewById(R.id.contentDetailTitle);
        detailLocation = findViewById(R.id.contentDetailLocation);
        detailDescription = findViewById(R.id.contentDetailDescription);
        detailRating = findViewById(R.id.contentDetailRating);
        detailPrice = findViewById(R.id.contentDetailPrice);
        detailImage = findViewById(R.id.contentDetailBackground);

        Bundle bundleContent = getIntent().getExtras();

        contentTitle = bundleContent.getString("contentTitle", "Anonymous");
        contentLocation = bundleContent.getString("contentLocation", "Anonymous");
        contentDescription = bundleContent.getString("contentDescription", "Anonymous");
        contentRating = bundleContent.getString("contentRating", "Anonymous");
        contentPrice = bundleContent.getString("contentPrice", "Anonymous");
        contentImage = bundleContent.getInt("contentImage", 0);

        detailTitle.setText(contentTitle);
        detailLocation.setText(contentLocation);
        detailDescription.setText(contentDescription);
        detailRating.setText(contentRating);
        detailPrice.setText(contentPrice);
        detailImage.setBackground(getResources().getDrawable(contentImage));

        buttonBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}