package com.example.egydesigner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class home extends AppCompatActivity {
    private WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        webView=(WebView)findViewById(R.id.home_web);
        webView.setWebViewClient(new WebViewClient()); // load site in app
        webView.getSettings().setJavaScriptEnabled(true);
        // Load URL
        webView.loadUrl(" http://www.egydesigner.com/index.html");


    }



            @Override
            public void onBackPressed() {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    super.onBackPressed();
                }
            }}
