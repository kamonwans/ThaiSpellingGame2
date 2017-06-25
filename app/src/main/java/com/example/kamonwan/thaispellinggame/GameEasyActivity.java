package com.example.kamonwan.thaispellinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GameEasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_easy);



        Button btnText1 = (Button) findViewById(R.id.btn_text1);
        Button btnText2 = (Button) findViewById(R.id.btn_text2);
        Button btnText3 = (Button) findViewById(R.id.btn_text3);


    }
}
