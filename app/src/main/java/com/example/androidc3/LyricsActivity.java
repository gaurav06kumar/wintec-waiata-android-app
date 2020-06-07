package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static maes.tech.intentanim.CustomIntent.customType;

public class LyricsActivity extends AppCompatActivity {
    TextView textView, textView1;
    Button btnLyrics;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        btnLyrics = findViewById(R.id.btnlyrics);

        intent = getIntent();
        actionBar.setTitle(intent.getStringExtra("name"));
        textView.setText(intent.getStringExtra("name"));
        textView1.setText(intent.getStringExtra("lyricsmaori"));

        btnLyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLyrics();
            }
        });
    }
    public void changeLyrics(){
        if (btnLyrics.getText().equals("English")){
            textView1.setText(intent.getStringExtra("lyricseng"));
            btnLyrics.setText("Maori");
        }else if (btnLyrics.getText().equals("Maori")){
            textView1.setText(intent.getStringExtra("lyricsmaori"));
            btnLyrics.setText("English");
        }
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