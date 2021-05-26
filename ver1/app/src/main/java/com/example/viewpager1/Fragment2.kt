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
import kotlinx.android.synthetic.main.fragment_2.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment2 : Fragment() {

    private var webSetting: WebSettings? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_2, container, false)
        view.wvDaum.webViewClient = WebViewClient()
        webSetting = view.wvDaum.settings
        webSetting?.javaScriptEnabled = true

        view.wvDaum.loadUrl("https://www.daum.net")
        return view
    }

}