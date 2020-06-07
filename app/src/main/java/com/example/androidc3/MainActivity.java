package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    CardView cardWaiata, cardMarae;
    TextView textWaiata, textMarae;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardWaiata = findViewById(R.id.card_waiata);
        cardMarae = findViewById(R.id.card_marae);

        textWaiata = findViewById(R.id.text_waiata);
        textMarae = findViewById(R.id.text_marae);

        cardWaiata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWaiata();
            }
        });

        cardMarae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarae();
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    public void openWaiata(){
        Intent intent = new Intent(this, WaiataActivity.class);
        startActivity(intent);
    }

    public void openMarae(){
        Intent intent = new Intent(this, MaraeActivity.class);
        startActivity(intent);
    }
}