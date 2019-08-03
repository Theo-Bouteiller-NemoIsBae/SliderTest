package fr.nemoisbae.wrappertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import android.support.v4.view.ViewPager

/*tuto https://www.raywenderlich.com/324-viewpager-tutorial-getting-started-in-kotlin*/

class MainActivity : AppCompatActivity() {


    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        val fragments: Array<Fragment> = arrayOf(Fragment_1.newInstance(),
                                                 Fragment_2.newInstance(),
                                                 Fragment_3.newInstance(),
                                                 Fragment_4.newInstance(),
                                                 Fragment_5.newInstance())

        pagerAdapter = PagerAdapter(supportFragmentManager, fragments)
        viewPager.adapter = pagerAdapter

    }


}
