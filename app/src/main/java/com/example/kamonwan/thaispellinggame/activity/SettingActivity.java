package com.example.kamonwan.thaispellinggame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.kamonwan.thaispellinggame.R;


public class SettingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button Btn_HowToPlay = (Button) findViewById(R.id.Btn_HowToPlay);
        final ImageView ImageSound = (ImageView) findViewById(R.id.ImageSound);
        ImageView ImageMusic = (ImageView) findViewById(R.id.ImageMusic);

        Btn_HowToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingActivity.this, HowToActivity.class);
                startActivity(intent);

            }
        });

        ImageSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        ImageMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
