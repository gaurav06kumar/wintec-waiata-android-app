package com.example.androidc3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

import static maes.tech.intentanim.CustomIntent.customType;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        simulateDayNight(/* DAY */ 0);
        Element Disclaimer = new Element();
        Element Te_Whanau = new Element();
        Element version  = new Element();




        Disclaimer.setTitle("Disclaimer").setGravity(1);
        Te_Whanau.setTitle("Te Whanau").setGravity(1);
        version.setTitle("Version 1.0").setGravity(1);




        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.d)
                .setDescription("This SWINFO APP is a mobile app that helps people learn Wintec songs and Wintec Marae ")
                .addItem(Disclaimer)

                .addGroup("The Waiata App is a Prototype version for Wintec Staff and Students. It is intended that staff and students shall use this to get an understanding of singing Wintec Waiata and information related to the Wintec Marae. Waiata or Information on the Marae may change change accordingly making older versions redundant – Wintec takes no responsibility of outdated information displayed on the app.")

                .addItem(Te_Whanau)
                .addGroup("GROUP LEADER - Gaurav")
                .addGroup("UX/UI DESIGN - Karan,Sudharsan")
                .addGroup("APP PROGRAMMING - Gaurav,Gautum")
                .addGroup("MULTIMEDIA - Nikunj")
                .addGroup("DATA COLLECTION - Karan")




             //   .addItem(new Element().setTitle("Te Whanau"))






                .addItem(version )
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("About Us");
    }

    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUsActivity.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
    void simulateDayNight(int currentSetting) {
        final int DAY = 0;
        final int NIGHT = 1;
        final int FOLLOW_SYSTEM = 3;

        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        if (currentSetting == DAY && currentNightMode != Configuration.UI_MODE_NIGHT_NO) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        } else if (currentSetting == NIGHT && currentNightMode != Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        } else if (currentSetting == FOLLOW_SYSTEM) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemaboutus);
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
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}