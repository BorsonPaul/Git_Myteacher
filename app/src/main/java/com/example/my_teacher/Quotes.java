package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Quotes extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        getSupportActionBar().hide();
        webView = findViewById(R.id.web_quates);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://quotes.iskcondesiretree.com/category/authors/d-iskcon-sannyasis/subhag-swami/");
    }

    public void home(View view) {
        startActivity(new Intent(this, PageOne.class));
    }
}