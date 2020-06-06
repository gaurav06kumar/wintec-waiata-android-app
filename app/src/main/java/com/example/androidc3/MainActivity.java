package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
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
    }

    public void openWaiata(){
        Intent intent = new Intent(this, WaiataActivity.class);
        startActivity(intent);
    }
}