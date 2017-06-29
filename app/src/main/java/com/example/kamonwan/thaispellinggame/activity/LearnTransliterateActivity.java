package com.example.kamonwan.thaispellinggame.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnTransliterate;
import com.example.kamonwan.thaispellinggame.model.TransliterateLearn;

import java.util.ArrayList;
import java.util.List;

public class LearnTransliterateActivity extends AppCompatActivity {
    TextView textOne,textTwo;
    CustomAdapterLearnTransliterate customAdapterLearnTransliterate;
    List<TransliterateLearn> transliterateLearnList;
    RecyclerView recyclerViewLearnTransliterate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_transliterate);
        init();

        transliterateLearnList.add(new TransliterateLearn("อินเทอร์เน็ต", "อินเตอร์เน็ต"));
        transliterateLearnList.add(new TransliterateLearn("ดิจิทัล", "ดิจิตอล"));
        transliterateLearnList.add(new TransliterateLearn("กราฟิก", "กราฟฟิก"));
        transliterateLearnList.add(new TransliterateLearn("เว็บไซต์", "เว็บไซท์"));
        transliterateLearnList.add(new TransliterateLearn("สคริปต์", "สครอปท์"));
        transliterateLearnList.add(new TransliterateLearn("ซอฟต์แวร์", "ซอฟท์แวร์"));
        transliterateLearnList.add(new TransliterateLearn("อีเมล", "อีเมล์"));
        transliterateLearnList.add(new TransliterateLearn("เมาส์", "เม้าส์"));
        transliterateLearnList.add(new TransliterateLearn("อิเล็กทรอนิกส์", "อิเล็กโทรนิคส์"));
        transliterateLearnList.add(new TransliterateLearn("คลิก", "คลิ๊ก"));
        transliterateLearnList.add(new TransliterateLearn("เบราว์เซอร์", "บราวเซอร์"));
        transliterateLearnList.add(new TransliterateLearn("ซูเปอร์คอมพิวเตอร์", "ซุปเปอร์คอมพิวเตอร์"));
        transliterateLearnList.add(new TransliterateLearn("แล็บ", "แล็ป"));
        transliterateLearnList.add(new TransliterateLearn("เกม", "เกมส์"));

        recyclerViewLearnTransliterate.setLayoutManager(new LinearLayoutManager(LearnTransliterateActivity.this));
        customAdapterLearnTransliterate = new CustomAdapterLearnTransliterate(LearnTransliterateActivity.this, transliterateLearnList);
        recyclerViewLearnTransliterate.setAdapter(customAdapterLearnTransliterate);
    }
    private void init() {
        recyclerViewLearnTransliterate = (RecyclerView) findViewById(R.id.recyclerViewLearnTransliterate);
        textOne = (TextView) findViewById(R.id.tvWordOne);
        textTwo = (TextView) findViewById(R.id.tvWordTwo);

        transliterateLearnList = new ArrayList<>();
    }
}
