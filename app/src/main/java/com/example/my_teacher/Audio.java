package com.example.my_teacher;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Audio extends AppCompatActivity {
    WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        getSupportActionBar().hide();
        webView = findViewById(R.id.web_audio);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://subhagswami.com/section/audio");
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }

    public void home(View view) {
        startActivity(new Intent(this, PageOne.class));
    }
}