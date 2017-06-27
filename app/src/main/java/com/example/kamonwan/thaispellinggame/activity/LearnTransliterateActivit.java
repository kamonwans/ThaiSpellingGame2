package com.example.kamonwan.thaispellinggame.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnRoyal;
import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnTrasliterate;
import com.example.kamonwan.thaispellinggame.model.RoyalLearn;
import com.example.kamonwan.thaispellinggame.model.TransliterateLearn;

import java.util.ArrayList;
import java.util.List;

public class LearnTransliterateActivit extends AppCompatActivity {
    TextView textOne,textTwo;
    CustomAdapterLearnTrasliterate customAdapterLearnTrasliterate;
    List<TransliterateLearn> tarnsliterateLearnList;
    RecyclerView recyclerViewLearnTransliterate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_transliterate);
        init();

        tarnsliterateLearnList.add(new TransliterateLearn("อินเทอร์เน็ต", "อินเตอร์เน็ต"));
        tarnsliterateLearnList.add(new TransliterateLearn("ดิจิทัล", "ดิจิตอล"));
        tarnsliterateLearnList.add(new TransliterateLearn("กราฟิก", "กราฟฟิก"));
        tarnsliterateLearnList.add(new TransliterateLearn("เว็บไซต์", "เว็บไซท์"));
        tarnsliterateLearnList.add(new TransliterateLearn("สคริปต์", "สครอปท์"));
        tarnsliterateLearnList.add(new TransliterateLearn("ซอฟต์แวร์", "ซอฟท์แวร์"));
        tarnsliterateLearnList.add(new TransliterateLearn("อีเมล", "อีเมล์"));
        tarnsliterateLearnList.add(new TransliterateLearn("เมาส์", "เม้าส์"));
        tarnsliterateLearnList.add(new TransliterateLearn("อิเล็กทรอนิกส์", "อิเล็กโทรนิคส์"));
        tarnsliterateLearnList.add(new TransliterateLearn("คลิก", "คลิ๊ก"));
        tarnsliterateLearnList.add(new TransliterateLearn("เบราว์เซอร์", "บราวเซอร์"));
        tarnsliterateLearnList.add(new TransliterateLearn("ซูเปอร์คอมพิวเตอร์", "ซุปเปอร์คอมพิวเตอร์"));
        tarnsliterateLearnList.add(new TransliterateLearn("แล็บ", "แล็ป"));
        tarnsliterateLearnList.add(new TransliterateLearn("เกม", "เกมส์"));

        recyclerViewLearnTransliterate.setLayoutManager(new LinearLayoutManager(LearnTransliterateActivit.this));
        customAdapterLearnTrasliterate = new CustomAdapterLearnTrasliterate(LearnTransliterateActivit.this,tarnsliterateLearnList);
        recyclerViewLearnTransliterate.setAdapter(customAdapterLearnTrasliterate);
    }
    private void init() {
        recyclerViewLearnTransliterate = (RecyclerView) findViewById(R.id.recyclerViewLearnTransliterate);
        textOne = (TextView) findViewById(R.id.tvWordOne);
        textTwo = (TextView) findViewById(R.id.tvWordTwo);

        tarnsliterateLearnList = new ArrayList<>();
    }
}
