package com.example.viewpager1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.layout_fruit.view.*

class FruitPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//        val inflater = LayoutInflater.from(container.context)
//        val view = inflater.inflate(R.layout.layout_fruit, container, false)
//
//        view.tvItemTitle.text = list[position].title
//
//        container.addView(view)
//        return view
//    }
//
//    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//        container.removeView(`object` as View?)
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view == `object`
//    }
//
//    override fun getCount(): Int {
//        return list.size
//    }

//    var data = mutableListOf<Fruit>()

    private val mFragmentList = ArrayList<Fragment>()
    private val mfragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mfragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mfragmentTitleList.add(title)
    }
}