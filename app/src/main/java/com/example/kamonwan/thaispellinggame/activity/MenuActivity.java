package com.example.kamonwan.thaispellinggame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.kamonwan.thaispellinggame.R;


public class MenuActivity extends AppCompatActivity {
    LinearLayout btnTest;
    LinearLayout btnProfile;
    LinearLayout btnSetting;
    LinearLayout btnLearn;
    LinearLayout btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnTest = (LinearLayout) findViewById(R.id.btnTest);
        btnProfile = (LinearLayout) findViewById(R.id.btnProfile);
        btnSetting = (LinearLayout) findViewById(R.id.btnSetting);
        btnLearn = (LinearLayout) findViewById(R.id.btnLearn);
        btnContact = (LinearLayout) findViewById(R.id.btnContact);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TestActivity.class);
                startActivity(intent);
                btnTest.setClickable(false);
                btnTest.setEnabled(false);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SettingActivity.class);
                startActivity(intent);

            }
        });
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, LearnActivity.class);
                startActivity(intent);

            }
        });
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ContactActivity.class);
                startActivity(intent);

            }
        });
    }
}
