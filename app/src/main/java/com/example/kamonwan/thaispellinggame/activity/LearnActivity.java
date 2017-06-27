package com.example.kamonwan.thaispellinggame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.kamonwan.thaispellinggame.R;

public class LearnActivity extends AppCompatActivity {
    Button btn_learn_transliterate;
    Button btn_learn_royal;
    Button btn_learn_use_everyday;
//    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        btn_learn_transliterate = (Button) findViewById(R.id.btn_learn_transliterate);
        btn_learn_royal = (Button) findViewById(R.id.btn_learn_royal);
        btn_learn_use_everyday = (Button) findViewById(R.id.btn_learn_use_everyday);

        btn_learn_royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LearnActivity.this, LearnRoyalActivity.class);
                startActivity(intent);
            }
        });
    }

}



