package com.example.kamonwan.thaispellinggame.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.example.kamonwan.thaispellinggame.adapter.CustomerAdapterTest;
import com.example.kamonwan.thaispellinggame.R;

import java.util.ArrayList;
import java.util.List;


public class TestActivity extends AppCompatActivity {

    RecyclerView recyclerViewTest;
    CustomerAdapterTest recyclerAdapterTest;

    List<String> listTitleName = new ArrayList<>();
    List<String> listrdOne = new ArrayList<>();
    List<String> listrsTwo = new ArrayList<>();
    List<String> listrdThere = new ArrayList<>();
    List<String> listrdFour = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        listTitleName.add("1. จงเลือกคำตอบที่เขียนถูกต้อง");
        listTitleName.add("2. จงเลือกคำตอบที่เขียนผิด");
        listTitleName.add("3. จงเลือกคำตอบที่เขียนผิด");
        listTitleName.add("4. จงเลือกคำตอบที่เขียนผิด");
        listrdOne.add("แอปพลิเคชัน");
        listrdOne.add("บันได");
        listrdOne.add("โขมย");
        listrdOne.add("แอปพลิเคชัน");
        listrsTwo.add("เกมส์");
        listrsTwo.add("คอมเมนต์");
        listrsTwo.add("โทรศัพท์");
        listrsTwo.add("เกมส์");
        listrdThere.add("กระเพรา");
        listrdThere.add("กระทะ");
        listrdThere.add("กุญแจ");
        listrdThere.add("กระทะ");
        listrdFour.add("เลิกลา");
        listrdFour.add("โทรทัศน์");
        listrdFour.add("อัพเดท");
        listrdFour.add("โทรทัศน์");

        recyclerViewTest = (RecyclerView) findViewById(R.id.recyclerViewTest);
        recyclerViewTest.setLayoutManager(new LinearLayoutManager(TestActivity.this));
        recyclerAdapterTest = new CustomerAdapterTest(TestActivity.this, listTitleName, listrdOne, listrsTwo, listrdThere,listrdFour);
        recyclerViewTest.setAdapter(recyclerAdapterTest);


    }
}
