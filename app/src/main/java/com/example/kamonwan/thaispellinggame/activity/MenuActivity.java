package com.example.kamonwan.thaispellinggame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.kamonwan.thaispellinggame.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView ImageGame = (ImageView) findViewById(R.id.ImageGame);
        ImageView ImageLearn = (ImageView) findViewById(R.id.ImageLearn);
        ImageView ImageSetting = (ImageView) findViewById(R.id.ImageSetting);
        ImageView ImageContact = (ImageView) findViewById(R.id.ImageContact);
        ImageView ImageTest = (ImageView) findViewById(R.id.ImageTest);

        ImageGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        ImageTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });

        ImageContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });
        ImageLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, LearnActivity.class);
                startActivity(intent);
            }
        });
        ImageSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}
