package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static maes.tech.intentanim.CustomIntent.customType;

public class MaraeInfoActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marae_info);
        TextView   textView1;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Te Kōpū Mānia o Kirikiriroa Info");
        textView1 = findViewById(R.id.textView1);
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                getResources().getDimension(R.dimen.textsize));

        textView1.setText("Nau mai haere mai ki Te Kōpū Mānia o Kirikiriroa.\n" +
                "Welcome to the Wintec Marae,named for the smooth fertile lands of Hamilton,which linked the Waikato hapu(sub tribes) who lived along the banks of the Waikato River.\n" +
                "Students and staff are able to utilise our multi-purpose marae to conduct and experience teaching,learning and pastoral support in a uniquely Maori environment.Comprising of three main buildings and seven significant carvings,the design marae depicts a contemporary version of traditional aspects with a focus on matauranga Maori and tikanga");

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
     public void more(View view)
     {
         Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wintec.ac.nz/about-wintec/m%C4%81ori-and-pasifika/wintec-marae?_ga=2.162256124.1775638048.1592859713-1269356284.1592859713"));
         startActivity(link);
        // Toast.makeText(this, "aw dawwa", Toast.LENGTH_SHORT).show();
     }

}