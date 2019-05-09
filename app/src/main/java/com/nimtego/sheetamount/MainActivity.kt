package com.nimtego.sheetamount

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity

class MainActivity : MvpAppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
