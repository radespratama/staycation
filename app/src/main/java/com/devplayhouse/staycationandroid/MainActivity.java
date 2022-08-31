package com.devplayhouse.staycationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ImageView toFavoriteOne, toFavoriteTwo, toFavoriteThree, toFavoriteFour, searchContent;
    String contentTitle, contentLocation, contentDescription, contentRating, contentPrice;
    RelativeLayout contentDetailBackground;
    TextView showUserName;

    FloatingActionButton floatingActionAppOne, floatingActionAppTwo;
    Animation icOpen, icClose, icRotateForward, icRotateBackward;

    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchContent = findViewById(R.id.searchContent);

        toFavoriteOne = findViewById(R.id.toFavoriteOne);
        toFavoriteTwo = findViewById(R.id.toFavoriteTwo);
        toFavoriteThree = findViewById(R.id.toFavoriteThree);
        toFavoriteFour = findViewById(R.id.toFavoriteFour);

        floatingActionAppOne = findViewById(R.id.floatingActionAppOne);
        floatingActionAppTwo = findViewById(R.id.floatingActionAppTwo);

        showUserName = findViewById(R.id.showUserName);

        icOpen = AnimationUtils.loadAnimation(this, R.anim.ic_open);
        icClose = AnimationUtils.loadAnimation(this, R.anim.ic_close);
        icRotateBackward = AnimationUtils.loadAnimation(this, R.anim.ic_rotate_backward);
        icRotateForward = AnimationUtils.loadAnimation(this, R.anim.ic_rotate_forward);

        SharedPreferences valueUsername = getSharedPreferences("LoginPreferences", MODE_PRIVATE);
        String printUsername = valueUsername.getString("usernameValue", "Anonymous Person");
        Boolean isAlreadyLogin = valueUsername.getBoolean("isLoged", false);

        floatingActionAppOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateIc();
            }
        });

        floatingActionAppTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateIc();
                SharedPreferences.Editor edit = valueUsername.edit();
                edit.remove("LoginPreferences");
                edit.apply();

                Intent moveToLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(moveToLogin);
            }
        });

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

        searchContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailSearchIntent = new Intent(MainActivity.this, DetailSearchActivity.class);
                startActivity(toDetailSearchIntent);
            }
        });
    }

    private void animateIc(){
        if(isOpen){
            floatingActionAppOne.startAnimation(icRotateForward);
            floatingActionAppTwo.startAnimation(icClose);
            floatingActionAppTwo.setClickable(false);
            isOpen = false;
        } else {
            floatingActionAppOne.startAnimation(icRotateBackward);
            floatingActionAppTwo.startAnimation(icOpen);
            floatingActionAppTwo.setClickable(true);
            isOpen = true;
        }
    }
}