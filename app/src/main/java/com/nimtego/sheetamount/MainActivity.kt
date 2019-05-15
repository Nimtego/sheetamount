package com.nimtego.sheetamount

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import android.view.WindowManager
import com.nimtego.sheetamount.mvp.model.CalculateData
import com.nimtego.sheetamount.mvp.view.MainView


class MainActivity : MvpAppCompatActivity(), MainView {
    override fun showCalculateData(calculateData: CalculateData) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

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
