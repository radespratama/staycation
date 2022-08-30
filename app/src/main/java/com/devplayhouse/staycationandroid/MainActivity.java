package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    EditText searchContent;
    ImageView toFavoriteOne, toFavoriteTwo, toFavoriteThree, toFavoriteFour;
    String contentTitle, contentLocation, contentDescription, contentRating, contentPrice;
    RelativeLayout contentDetailBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchContent = findViewById(R.id.searchContent);

        toFavoriteOne = findViewById(R.id.toFavoriteOne);
        toFavoriteTwo = findViewById(R.id.toFavoriteTwo);
        toFavoriteThree = findViewById(R.id.toFavoriteThree);
        toFavoriteFour = findViewById(R.id.toFavoriteFour);

        toFavoriteOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentTitle = getResources().getString(R.string.content_title);
                contentLocation = getResources().getString(R.string.content_location);
                contentDescription = getResources().getString(R.string.content_description);
                contentRating = getResources().getString(R.string.content_rating);
                contentPrice = getResources().getString(R.string.content_price);

                Intent toDetailIntent = new Intent(MainActivity.this, DetailFavoriteActivity.class);

                toDetailIntent.putExtra("contentTitle", contentTitle);
                toDetailIntent.putExtra("contentLocation", contentLocation);
                toDetailIntent.putExtra("contentDescription", contentDescription);
                toDetailIntent.putExtra("contentRating", contentRating);
                toDetailIntent.putExtra("contentPrice", contentPrice);
                toDetailIntent.putExtra("contentImage", R.drawable.overlay_favorite_one);

                startActivity(toDetailIntent);
            }
        });

        toFavoriteTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentTitle = getResources().getString(R.string.content_title_two);
                contentLocation = getResources().getString(R.string.content_location_two);
                contentDescription = getResources().getString(R.string.content_description_two);
                contentRating = getResources().getString(R.string.content_rating_two);
                contentPrice = getResources().getString(R.string.content_price_two);

                Intent toDetailIntent = new Intent(MainActivity.this, DetailFavoriteActivity.class);

                toDetailIntent.putExtra("contentTitle", contentTitle);
                toDetailIntent.putExtra("contentLocation", contentLocation);
                toDetailIntent.putExtra("contentDescription", contentDescription);
                toDetailIntent.putExtra("contentRating", contentRating);
                toDetailIntent.putExtra("contentPrice", contentPrice);
                toDetailIntent.putExtra("contentImage", R.drawable.overlay_favorite_two);

                startActivity(toDetailIntent);
            }
        });

        toFavoriteThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentTitle = getResources().getString(R.string.content_title_three);
                contentLocation = getResources().getString(R.string.content_location_three);
                contentDescription = getResources().getString(R.string.content_description_three);
                contentRating = getResources().getString(R.string.content_rating_three);
                contentPrice = getResources().getString(R.string.content_price_three);

                Intent toDetailIntent = new Intent(MainActivity.this, DetailFavoriteActivity.class);

                toDetailIntent.putExtra("contentTitle", contentTitle);
                toDetailIntent.putExtra("contentLocation", contentLocation);
                toDetailIntent.putExtra("contentDescription", contentDescription);
                toDetailIntent.putExtra("contentRating", contentRating);
                toDetailIntent.putExtra("contentPrice", contentPrice);
                toDetailIntent.putExtra("contentImage", R.drawable.overlay_favorite_three);

                startActivity(toDetailIntent);
            }
        });

        toFavoriteFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentTitle = getResources().getString(R.string.content_title_four);
                contentLocation = getResources().getString(R.string.content_location_four);
                contentDescription = getResources().getString(R.string.content_description_four);
                contentRating = getResources().getString(R.string.content_rating_four);
                contentPrice = getResources().getString(R.string.content_price_four);

                Intent toDetailIntent = new Intent(MainActivity.this, DetailFavoriteActivity.class);

                toDetailIntent.putExtra("contentTitle", contentTitle);
                toDetailIntent.putExtra("contentLocation", contentLocation);
                toDetailIntent.putExtra("contentDescription", contentDescription);
                toDetailIntent.putExtra("contentRating", contentRating);
                toDetailIntent.putExtra("contentPrice", contentPrice);
                toDetailIntent.putExtra("contentImage", R.drawable.overlay_favorite_four);

                startActivity(toDetailIntent);
            }
        });


        searchContent.setFilters(new InputFilter[] {
                new InputFilter.LengthFilter(30),
        });
    }
}