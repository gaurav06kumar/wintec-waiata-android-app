package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import static maes.tech.intentanim.CustomIntent.customType;

public class MaraeActivity extends AppCompatActivity {
    Intent intent;
    CardView cardMaraeInfo, cardCarving;
    Boolean swap = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marae);

        cardMaraeInfo = findViewById(R.id.card_maraeinfo);
        cardCarving = findViewById(R.id.card_carving);

        cardMaraeInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMaraeInfo();
            }
        });

        cardCarving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarving();
            }
        });





        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Marae");
    }

    public void openMaraeInfo(){
        intent = new Intent(this, MaraeInfoActivity.class);
        startActivity(intent);
    }

    public void openCarving(){
        intent = new Intent(this, CarvingActivity.class);
        startActivity(intent);
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
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemhome:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemlist:
                swap = swapView(item, swap);
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public boolean swapView(MenuItem item, Boolean swap){
        if(swap == true){
            swap = false;
            item.setIcon(R.drawable.ic_grid);
        }else if(swap == false){
            swap = true;
            item.setIcon(R.drawable.ic_list);
        }
        return swap;
    }
}