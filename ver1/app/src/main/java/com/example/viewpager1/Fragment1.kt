package com.example.viewpager1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {

    private var webSetting: WebSettings? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_1, container, false)
        view.wvNaver.webViewClient = WebViewClient()
        webSetting = view.wvNaver.settings
        webSetting?.javaScriptEnabled = true

        view.wvNaver.loadUrl("https://www.naver.com")
        return view
    }
}