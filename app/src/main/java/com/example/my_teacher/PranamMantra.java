package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class PranamMantra extends AppCompatActivity {
    YouTubePlayerView yv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranam_mantra);
        getSupportActionBar().hide();
        yv = (YouTubePlayerView) findViewById(R.id.youtube_pranam);


    }


    public void home(View view) {
        startActivity(new Intent(this, PageOne.class));
    }
}