package com.example.kamonwan.thaispellinggame.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.model.RoyalLearn;

/**
 * Created by kamonwan on 6/15/2017.
 */

public class LearnActivity extends AppCompatActivity {
    Button btn_learn_transliterate;
    Button btn_learn_royal;
    Button btn_learn_use_everyday;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        btn_learn_transliterate = (Button) findViewById(R.id.btn_learn_transliterate);
        btn_learn_royal = (Button) findViewById(R.id.btn_learn_royal);
        btn_learn_use_everyday = (Button) findViewById(R.id.btn_learn_use_everyday);

    }
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_learn_royal:
            intent.setClass(context, LearnRoyalActivity.class);
            startActivity(intent);
            break;
        }

    }
}



