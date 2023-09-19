package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pravupad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pravupad);
        getSupportActionBar().hide();
    }

    public void home(View view) {
        startActivity(new Intent(this, PageOne.class));
    }
}