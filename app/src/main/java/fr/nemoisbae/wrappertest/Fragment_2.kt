package fr.nemoisbae.wrappertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment_2 : Fragment() {

    companion object {
        fun newInstance() : Fragment_2 {
            return Fragment_2()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_fragment_2, container, false)
    }
}

