package com.ab_game.twine;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl("file:///android_asset/index.html");
        webView.getSettings().setDomStorageEnabled(true);            // DOM storage 활성화
        webView.getSettings().setDatabaseEnabled(true);              // Database storage 활성화
        webView.getSettings().setJavaScriptEnabled(true);            // 자바스크립트 활성화
        webView.getSettings().setAllowFileAccess(true);              // 파일 접근 허용


    }
}
