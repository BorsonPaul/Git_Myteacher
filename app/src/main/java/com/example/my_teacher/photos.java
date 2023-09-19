package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class photos extends AppCompatActivity {
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        Objects.requireNonNull(getSupportActionBar()).hide();
        webView1 = findViewById(R.id.web_photo01);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://subhagswami.com/photos");
        webView1.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);


    }

    public void Images(View view) {
        startActivity(new Intent(this, ImageViewsss.class));
    }
}