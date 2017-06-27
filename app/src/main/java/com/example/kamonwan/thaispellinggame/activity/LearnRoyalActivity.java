package com.example.kamonwan.thaispellinggame.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnRoyal;
import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.model.RoyalLearn;

import java.util.ArrayList;
import java.util.List;

public class LearnRoyalActivity extends AppCompatActivity {

    TextView textOne,textTwo;
    CustomAdapterLearnRoyal customAdapterLearnRoyal;
    List<RoyalLearn> royalLearnList;
    RecyclerView recyclerViewLearnRoyal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_royal);
        init();

        royalLearnList.add(new RoyalLearn("ดำริ", "ดำหริ"));
        royalLearnList.add(new RoyalLearn("ชนมพรรษา", "ชนม์พรรษา"));
        royalLearnList.add(new RoyalLearn("ชนมายุ", "ชนม์มายุ"));
        royalLearnList.add(new RoyalLearn("ทูลกระหม่อม", "ทูนกระหม่อม"));
        royalLearnList.add(new RoyalLearn("ธำมรงค์", "ธำมรง"));
        royalLearnList.add(new RoyalLearn("ประสูติ", "ประสูต"));
        royalLearnList.add(new RoyalLearn("ราชสาส์น", "ราชสาสน์"));
        royalLearnList.add(new RoyalLearn("ดำริ", "ดำหริ"));
        royalLearnList.add(new RoyalLearn("ชนมพรรษา", "ชนม์พรรษา"));
        royalLearnList.add(new RoyalLearn("ชนมายุ", "ชนม์มายุ"));
        royalLearnList.add(new RoyalLearn("ทูลกระหม่อม", "ทูนกระหม่อม"));
        royalLearnList.add(new RoyalLearn("ธำมรงค์", "ธำมรง"));
        royalLearnList.add(new RoyalLearn("ประสูติ", "ประสูต"));
        royalLearnList.add(new RoyalLearn("ราชสาส์น", "ราชสาสน์"));


        recyclerViewLearnRoyal.setLayoutManager(new LinearLayoutManager(LearnRoyalActivity.this));
        customAdapterLearnRoyal = new CustomAdapterLearnRoyal(LearnRoyalActivity.this,royalLearnList);
        recyclerViewLearnRoyal.setAdapter(customAdapterLearnRoyal);
    }
    private void init() {
        recyclerViewLearnRoyal = (RecyclerView) findViewById(R.id.recyclerViewLearnRoyal);
        textOne = (TextView) findViewById(R.id.tvWordOne);
        textTwo = (TextView) findViewById(R.id.tvWordTwo);

        royalLearnList = new ArrayList<>();
    }
}
