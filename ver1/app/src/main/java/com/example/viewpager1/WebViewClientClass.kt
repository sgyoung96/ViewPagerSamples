package com.example.viewpager1

import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewClientClass : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
        Log.d("check URL", url)
        view?.loadUrl("https://www.naver.com/")
        return true
    }
}