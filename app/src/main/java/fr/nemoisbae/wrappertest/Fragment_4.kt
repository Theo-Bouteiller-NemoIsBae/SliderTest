package fr.nemoisbae.wrappertest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment_4 : Fragment() {

    companion object {
        fun newInstance() : Fragment_4 {
            return Fragment_4()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_fragment_4, container, false)
    }
}
