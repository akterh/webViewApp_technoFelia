package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView()
    }

    private fun webView() {
       val sportWeb : WebView = findViewById(R.id.sport_web)
        sportWeb.webViewClient = WebViewClient()
        sportWeb.apply{
            loadUrl ("https://technofelia.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }


}