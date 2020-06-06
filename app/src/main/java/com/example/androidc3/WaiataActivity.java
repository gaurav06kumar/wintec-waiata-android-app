package com.example.androidc3;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Model.WaiataModel;

import java.util.ArrayList;

public class WaiataActivity extends AppCompatActivity {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private RecyclerView charRecyclerview;
    private Toolbar toolbar;
    private GridLayoutManager gridLayoutManager;
    Boolean swapView;
    private int span_count_1 = 1, span_count_2 = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata);

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

        //Toolbar
//        Toolbar toolbarList = findViewById(R.id.toolbarList);
//        toolbarList.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
////                CustomIntent.customType(view.getContext(), "right-to-left");
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemlist:
                Toast.makeText(this, "item list selected", Toast.LENGTH_SHORT).show();
                swapView(item);
                return true;
            case R.id.item2:
                Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void swapView(MenuItem item){
        if(gridLayoutManager.getSpanCount() == span_count_2)
        if(swapView == true){
            swapView = false;
            item.setIcon(R.drawable.ic_grid);
        }else if (swapView == false){
            swapView = true;
            item.setIcon(R.drawable.ic_list);
        }

    }


}