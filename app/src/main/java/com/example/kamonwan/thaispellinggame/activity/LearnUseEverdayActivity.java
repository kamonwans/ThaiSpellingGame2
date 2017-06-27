package com.example.kamonwan.thaispellinggame.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.TextView;

import com.example.kamonwan.thaispellinggame.R;
import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnRoyal;
import com.example.kamonwan.thaispellinggame.adapter.CustomAdapterLearnUseEveryday;
import com.example.kamonwan.thaispellinggame.model.RoyalLearn;
import com.example.kamonwan.thaispellinggame.model.UseLearn;

import java.util.ArrayList;
import java.util.List;

public class LearnUseEverdayActivity extends AppCompatActivity {

    TextView textOne,textTwo;
    CustomAdapterLearnUseEveryday customAdapterLearnUseEveryday;
    List<UseLearn> useLearnList;
    RecyclerView recyclerViewLearnUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_use_everday);
        init();

        useLearnList.add(new UseLearn("แอปพลิเคชัน", "แอพพลิเคชัน"));
        useLearnList.add(new UseLearn("เกม", "เกมส์"));
        useLearnList.add(new UseLearn("กะเพรา", "กระเพรา"));
        useLearnList.add(new UseLearn("กะเทย", "กระเทย"));
        useLearnList.add(new UseLearn("ขโมย", "โขมย"));
        useLearnList.add(new UseLearn("ขี้เกรียจ", "ขี้เกลียด"));
        useLearnList.add(new UseLearn("ไข่มุก", "ไข่มุข"));
        useLearnList.add(new UseLearn("ดำริ", "ดำหริ"));
        useLearnList.add(new UseLearn("คณบดี", "คณะบดี"));
        useLearnList.add(new UseLearn("คลินิก", "คลีนิก"));
        useLearnList.add(new UseLearn("แคบหมู", "แคปหมู"));
        useLearnList.add(new UseLearn("ฆาตกร", "ฆาตรกร"));
        useLearnList.add(new UseLearn("ฉบับ", "ฉะบับ"));
        useLearnList.add(new UseLearn("ฉะนั้น", "ฉนั้น"));


        recyclerViewLearnUse.setLayoutManager(new LinearLayoutManager(LearnUseEverdayActivity.this));
        customAdapterLearnUseEveryday = new CustomAdapterLearnUseEveryday(LearnUseEverdayActivity.this,useLearnList);
        recyclerViewLearnUse.setAdapter(customAdapterLearnUseEveryday);
    }
    private void init() {
        recyclerViewLearnUse = (RecyclerView) findViewById(R.id.recyclerViewLearnUse);
        textOne = (TextView) findViewById(R.id.tvWordOne);
        textTwo = (TextView) findViewById(R.id.tvWordTwo);

        useLearnList = new ArrayList<>();
    }
}
