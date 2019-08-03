package fr.nemoisbae.wrappertest

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Fragment_1 : Fragment() {

    companion object {
        fun newInstance() : Fragment_1 {
            return Fragment_1()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_fragment_1, container, false)
    }
}
