package com.example.docbao3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        webView = (WebView) findViewById(R.id.webviewxeco);

        Intent intent = getIntent();

        String link = intent.getStringExtra("linkXeCo") ;

        webView.loadUrl(link);

        webView.setWebViewClient( new WebViewClient());

    }
}