package com.paulkoepke.tipcalculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    //getSupportActionBar().setHomeButtonEnabled(true); // Probably unnecessary
    //getSupportActionBar().setTitle("Tip Calculator");

    WebView mainWebView = (WebView) findViewById(R.id.mainWebView);

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainWebView.setBackgroundColor(Color.BLACK);
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.loadUrl("file:///android_asset/index.html");
    }
    @Override
    public void onContentChanged() { }
}
