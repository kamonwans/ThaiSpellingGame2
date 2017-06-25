package com.example.kamonwan.thaispellinggame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button buttonPlay = (Button) findViewById(R.id.Btn_Play);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
                builder.setMessage("กรุณาเลือกระดับในการเล่นเกม");
                builder.setNeutralButton("ระดับง่าย", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ProfileActivity.this, RandomUserActivity.class);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("ระดับปานกลาง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ProfileActivity.this, RandomUserActivity.class);
                        startActivity(intent);
                    }
                });
                builder.setPositiveButton("ระดับยาก", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ProfileActivity.this, RandomUserActivity.class);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        });
    }
}
