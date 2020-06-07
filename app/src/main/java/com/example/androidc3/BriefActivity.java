package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import static maes.tech.intentanim.CustomIntent.customType;

public class BriefActivity extends AppCompatActivity {
    Intent intent;
    String name, description;
    int image;
    ImageView imageView;
    TextView textView, textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);

        intent = getIntent();
        name = intent.getStringExtra("name");
        description = intent.getStringExtra("description");
        image = intent.getIntExtra("image",0);

        imageView.setImageResource(image);
        textView.setText(name+" Brief");
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView1.setText(description);
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