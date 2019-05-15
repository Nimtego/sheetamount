package com.nimtego.sheetamount

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import android.view.WindowManager


class MainActivity : MvpAppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_container, UserDataFragment.getInstance("TEST"))
            .commit()
    }
}
