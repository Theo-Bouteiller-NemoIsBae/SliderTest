package fr.nemoisbae.wrappertest

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class PagerAdapter(fragmentManager: FragmentManager, val layoutFragments: Array<Fragment>) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return layoutFragments.get(position)
    }

    override fun getCount(): Int {
        return layoutFragments.size
    }

}