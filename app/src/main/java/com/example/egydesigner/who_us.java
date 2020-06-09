package com.example.egydesigner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class who_us extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_us);

        webView=(WebView)findViewById(R.id.who_web);
        webView.setWebViewClient(new WebViewClient()); // load site in app
        webView.getSettings().setJavaScriptEnabled(true);
        // Load URL
        webView.loadUrl("http://www.egydesigner.com/aboutus.html");

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); }
        else{ super.onBackPressed(); }
    }
}
