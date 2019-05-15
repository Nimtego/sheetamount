package com.nimtego.sheetamount.mvp.presenters

import android.util.Log
import com.arellomobile.mvp.MvpPresenter
import com.nimtego.sheetamount.mvp.view.BaseView

abstract class BasePresenter<T : BaseView> : MvpPresenter<T>() {

    protected val isViewAttached: Boolean get() = attachedViews.size > 0

    private val tag = javaClass.simpleName

    override fun attachView(view: T) {
        Log.i(this.tag, "attachView")
        super.attachView(view)
    }

    override fun detachView(view: T) {
        Log.i(this.tag, "detachView")
        super.detachView(view)
    }
}