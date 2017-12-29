package com.example.kishanjha.kishan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class website extends AppCompatActivity {
    WebView mywebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        mywebsite = (WebView)findViewById(R.id.website);
        /* webview setting */
        WebSettings webSettings = mywebsite.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebsite.loadUrl("https://kjkishan.github.io");
        mywebsite.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (mywebsite.canGoBack()){
            mywebsite.goBack();
        } else
        super.onBackPressed();
    }
}
