package com.example.viewpager1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*
import kotlinx.android.synthetic.main.fragment_3.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment3 : Fragment() {

    private var webSetting: WebSettings? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_3, container, false)
        view.wvGoogle.webViewClient = WebViewClient()
        webSetting = view.wvGoogle.settings
        webSetting?.javaScriptEnabled = true

        view.wvGoogle.loadUrl("https://www.google.com")
        return view
    }
}