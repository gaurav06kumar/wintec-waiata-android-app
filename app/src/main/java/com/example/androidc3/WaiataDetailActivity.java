package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class WaiataDetailActivity extends AppCompatActivity {
    String name;
    TextView textWaiataDetail;
    Button btnvocal, btnlyrics, btnnonvocal, btnbrief;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata_detail);

        textWaiataDetail = findViewById(R.id.text_waiata_detail);

//        btnvocal = findViewById(R.id.btnvocal);
//        btnlyrics = findViewById(R.id.btnlyrics);
//        btnnonvocal = findViewById(R.id.btnnonvocal);

        intent = getIntent();

        name = intent.getStringExtra("name");
        textWaiataDetail.setText(name.toString());

        //Toolbar
        Toolbar toolbarList = findViewById(R.id.toolbarList);
        toolbarList.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
//                CustomIntent.customType(view.getContext(), "right-to-left");
            }
        });

    }
}