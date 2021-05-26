package com.example.viewpager1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    var data = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tbTab.setupWithViewPager(vpViewPager)
        val adapter = FruitPagerAdapter(supportFragmentManager)

        adapter.addFragment(Fragment1(), "NAVER")
        adapter.addFragment(Fragment2(), "DAUM")
        adapter.addFragment(Fragment3(), "GOOGLE")

//        data.apply {
//            add(Fruit(title = "사과"))
//            add(Fruit(title = "바나나"))
//            add(Fruit(title = "오렌지"))
//        }

//        adapter.data = data
        vpViewPager.adapter = adapter
        vpViewPager.offscreenPageLimit = 1

    }

}