package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class VideoPage extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_video_page);
        webView = (WebView) findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/@SubhagSwami");
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }

    public void home(View view) {
        startActivity(new Intent(this, PageOne.class));
    }
}