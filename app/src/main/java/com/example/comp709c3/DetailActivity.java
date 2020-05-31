package com.example.comp709c3;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import maes.tech.intentanim.CustomIntent;

public class DetailActivity extends AppCompatActivity {
    String name, description;
    int image;
    TextView textView,textView1;
    ImageView imageview;
    Button btnvocal, btnlyrics, btnnonvocal;
    static final String STATE_USER = "name";
    Intent intent;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.name);
        textView1 = findViewById(R.id.description);
        imageview = findViewById(R.id.imageview);

        btnvocal = findViewById(R.id.btnvocal);
        btnlyrics = findViewById(R.id.btnlyrics);
        btnnonvocal = findViewById(R.id.btnnonvocal);



        intent = getIntent();

        name = intent.getStringExtra("name");
        description = intent.getStringExtra("description");
        image = intent.getIntExtra("image", 1);

        textView.setText(name.toString());
        textView1.setText(description.toString());
        imageview.setImageResource(image);

        btnvocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVocal();
            }
        });

        //Toolbar
        Toolbar toolbarList = findViewById(R.id.toolbarList);
        toolbarList.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                CustomIntent.customType(view.getContext(), "right-to-left");
            }
        });
    }

    public void openVocal(){
        Intent intent = new Intent(this, VocalActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "left-to-right");
    }


}