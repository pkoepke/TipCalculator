package com.paulkoepke.tipcalculator;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    WebView mainWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setTitle("Tip Calculator");

        mainWebView = (WebView) findViewById(R.id.mainWebView);
        mainWebView.setBackgroundColor(Color.BLACK);
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.loadUrl("file:///android_asset/index.html");
    }
    @Override
    public void onContentChanged() { }
}
