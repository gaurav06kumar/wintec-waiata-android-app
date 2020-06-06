package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
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

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


//        textWaiataDetail = findViewById(R.id.text_waiata_detail);

//        btnvocal = findViewById(R.id.btnvocal);
//        btnlyrics = findViewById(R.id.btnlyrics);
//        btnnonvocal = findViewById(R.id.btnnonvocal);

        intent = getIntent();

        name = intent.getStringExtra("name");
        actionBar.setTitle(name);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemlist);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 16908332://back
                finish();
                return true;
            case R.id.item2:
                return true;
            case R.id.item3:
                Intent intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}