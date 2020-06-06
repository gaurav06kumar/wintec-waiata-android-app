package com.example.androidc3;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Model.WaiataModel;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class WaiataActivity extends AppCompatActivity {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private RecyclerView charRecyclerview;
    private Toolbar toolbar;
    private GridLayoutManager gridLayoutManager;
    Boolean swapView;
    private int span_count_1 = 1, span_count_2 = 2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Waiata");

        swapView = true;

        //toolbar = findViewById(R.id.toolbarList);
        //store the value in the form of array
        WaiataModel charModel0 = new WaiataModel(1,R.drawable.ekorekoeengaro, "E Kore Koe E Ngaro", "Zeus, the Lord of Heaven, is a ranged intelligence hero who functions almost solely as a nuker. He is usually played as a semi-carry ganker type hero, who instead of utilizing disables, focuses solely on delivering tremendous amounts of magical damage to his foes.", "Electric Shock","Attack + defence", R.raw.ekorekoe_1 );
        charList.add(charModel0);

        WaiataModel charModel1 = new WaiataModel(2,R.drawable.hemaimaiarohanatawhiao, "He Maimai Aroha na Tawhiao", "Lucifer, the Doom, is a melee strength hero with strong farming capabilities, good versatility, and one of the strongest single-target disables in the game. His very low starting armor makes him vulnerable to harassment, but his abilities and high health allow him to lane or even jungle quite effectively.", "Fire","Attack + defence + Carry", R.raw.ekorekoe_2 );
        charList.add(charModel1);
        gridOfCharAdapter = new GridOfCharAdapter(charList);
        charRecyclerview = findViewById(R.id.recyclerview);

        //        for grid
        gridLayoutManager = new GridLayoutManager(this, span_count_2);
        charRecyclerview.setLayoutManager(gridLayoutManager);
        charRecyclerview.setItemAnimator(new DefaultItemAnimator());
        charRecyclerview.setAdapter(gridOfCharAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemhome);
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
            case R.id.itemlist:
                swapView(item);
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void swapView(MenuItem item){
        if(gridLayoutManager.getSpanCount() == span_count_2)
        {
            item.setIcon(R.drawable.ic_grid);
            gridLayoutManager.setSpanCount(span_count_1);
        }else if(gridLayoutManager.getSpanCount()==span_count_1){
            item.setIcon(R.drawable.ic_list);
            gridLayoutManager.setSpanCount(span_count_2);
        }

    }


}