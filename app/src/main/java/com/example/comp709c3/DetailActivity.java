package com.example.comp709c3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class DetailActivity extends AppCompatActivity {
    String name;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        Intent intent = getIntent();
        name = intent.getStringExtra("name");

        VideoView videoView=findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName() + "/" + R.raw.ekorekoe_1;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);  //buttons
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);       //position on screen

    }
}