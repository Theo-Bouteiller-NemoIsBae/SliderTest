package fr.nemoisbae.wrappertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment_3 : Fragment() {

    companion object {
        fun newInstance() : Fragment_3 {
            return Fragment_3()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_fragment_3, container, false)
    }
}

