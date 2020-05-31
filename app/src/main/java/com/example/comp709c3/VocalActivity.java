package com.example.comp709c3;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import maes.tech.intentanim.CustomIntent;

public class VocalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal);

        VideoView videoView=findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName() + "/" + R.raw.ekorekoe_1;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);  //buttons
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);       //position on screen
        //Toolbar
        Toolbar toolbarList = findViewById(R.id.toolbarList);
        toolbarList.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                CustomIntent.customType(view.getContext(), "right-to-left");
            }
        });
    }

}