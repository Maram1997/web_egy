package com.example.egydesigner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class offers extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        webView=(WebView)findViewById(R.id.offers_web);
        webView.setWebViewClient(new WebViewClient()); // load site in app
        webView.getSettings().setJavaScriptEnabled(true);
        // Load URL
        webView.loadUrl("http://www.egydesigner.com/marketing-place.html");

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); }
        else{ super.onBackPressed(); }
    }
}
