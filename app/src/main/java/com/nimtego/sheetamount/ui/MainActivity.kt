package com.nimtego.sheetamount.ui

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import android.view.WindowManager
import com.nimtego.sheetamount.R
import com.nimtego.sheetamount.mvp.view_model.CalculateData
import com.nimtego.sheetamount.mvp.view.MainView


class MainActivity : MvpAppCompatActivity(), MainView {

// MARK: view methods

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

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
            .add(
                R.id.main_container,
                EnterDataFragment.getInstance()
            )
            .commit()
    }
}
