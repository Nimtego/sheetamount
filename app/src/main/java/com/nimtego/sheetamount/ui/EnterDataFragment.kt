package com.nimtego.sheetamount.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.nimtego.sheetamount.R
import com.nimtego.sheetamount.mvp.presenters.EnterDataPresenter
import com.nimtego.sheetamount.mvp.view.EnterDataView
import com.nimtego.sheetamount.mvp.view_model.EnterDateModel

class EnterDataFragment : MvpAppCompatFragment(), EnterDataView {

// MARK: - Properties

    @InjectPresenter
    internal lateinit var presenter: EnterDataPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_user_data, container, false)
    }

// MARK: view methods

    override fun clearData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

// MARK: private methods

    private fun dataSetChange() {
        this.presenter.dataChange(EnterDateModel(100))
    }
    companion object {
        fun getInstance() = EnterDataFragment()
    }
}