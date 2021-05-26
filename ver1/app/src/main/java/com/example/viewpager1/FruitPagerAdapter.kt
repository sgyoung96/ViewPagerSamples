package com.example.viewpager1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FruitPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {

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