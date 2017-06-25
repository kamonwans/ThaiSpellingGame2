package com.example.kamonwan.thaispellinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class RandomUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_user);

        Button Btn_use_everyday = (Button) findViewById(R.id.Btn_use_everyday);
        Button Btn_royal = (Button) findViewById(R.id.Btn_royal);
        Button Btn_transliterate = (Button) findViewById(R.id.Btn_transliterate);

        Btn_use_everyday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomUserActivity.this, GameEasyActivity.class);
                startActivity(intent);
            }
        });

        Btn_royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomUserActivity.this, GameMediumActivity.class);
                startActivity(intent);

            }
        });

        Btn_transliterate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RandomUserActivity.this, GameHardActivity.class);
                startActivity(intent);
            }
        });
    }
}
