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
import androidx.cardview.widget.CardView;

import static maes.tech.intentanim.CustomIntent.customType;

public class WaiataDetailActivity extends AppCompatActivity {
    String name, description, lyricsmaori, lyricseng, lyricsurdu;
    int image, vocal;
    Intent intent;
    CardView cardBrief, cardVocal, cardLyrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        cardBrief = findViewById(R.id.card_brief);
        cardVocal = findViewById(R.id.card_vocal);
        cardLyrics = findViewById(R.id.card_lyric);

        cardBrief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrief();
            }
        });

        cardVocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVocal();
            }
        });

        cardLyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLyrics();
            }
        });

        intent = getIntent();
        name = intent.getStringExtra("name");
        description = intent.getStringExtra("description");
        lyricsmaori = intent.getStringExtra("lyricsmaori");
        lyricseng = intent.getStringExtra("lyricseng");
        lyricsurdu = intent.getStringExtra("lyricsurdu");
        image = intent.getIntExtra("image", 0);
        vocal = intent.getIntExtra("vocal", 0);
        actionBar.setTitle(name);
    }

    public void openBrief(){
        intent = new Intent(this, BriefActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("image", image);
        startActivity(intent);
    }

    public void openVocal(){
        intent = new Intent(this, VocalActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("vocal", vocal);
        intent.putExtra("lyricsmaori", lyricsmaori);
        intent.putExtra("lyricseng", lyricseng);
        intent.putExtra("lyricsurdu", lyricsurdu);
        startActivity(intent);
    }

    public void openLyrics(){
        intent = new Intent(this, LyricsActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("lyricsmaori", lyricsmaori);
        intent.putExtra("lyricseng", lyricseng);
        intent.putExtra("lyricsurdu", lyricsurdu);
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
                finish();
                return true;
            case R.id.itemhome:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}