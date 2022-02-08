package com.example.webview_boillerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }

        webview.loadUrl("http://memento.webview.s3-website.ap-northeast-2.amazonaws.com")
    }

    override fun onBackPressed() {
        if (webview.canGoBack())
        {
            webview.goBack()
        }
        else
        {
            finish()
        }
    }
}