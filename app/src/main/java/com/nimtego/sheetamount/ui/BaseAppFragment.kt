package com.nimtego.sheetamount.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.nimtego.sheetamount.R

open class BaseAppFragment : MvpAppCompatFragment() {

//    override fun onCreate(savedInstanceState: Bundle) {
//        super.onCreate(savedInstanceState)
//        if (arguments != null && arguments.containsKey(RESPONSE)) {
//            searchText = arguments.getString(RESPONSE)
//        } else {
//            throw IllegalArgumentException("created through newInstance(...)!")
//        }
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_user_data, container, false)
    }

    companion object {
        fun getInstance(response: String): BaseAppFragment {
            val fragment = BaseAppFragment()
            val arguments = Bundle()
            //arguments.putString(RESPONSE, response)
            // fragment.setArguments(arguments)
            return fragment
        }
    }
}