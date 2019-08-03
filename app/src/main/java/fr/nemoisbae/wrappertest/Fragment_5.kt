package fr.nemoisbae.wrappertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment_5 : Fragment() {

    companion object {
        fun newInstance() : Fragment_5 {
            return Fragment_5()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_fragment_5, container, false)
    }
}

