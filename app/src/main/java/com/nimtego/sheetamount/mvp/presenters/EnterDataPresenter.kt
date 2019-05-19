package com.nimtego.sheetamount.mvp.presenters

import com.arellomobile.mvp.InjectViewState
import com.nimtego.sheetamount.mvp.view_model.EnterDateModel
import com.nimtego.sheetamount.mvp.view.EnterDataView
import com.nimtego.sheetamount.mvp.view_model.CalculateData

@InjectViewState
class EnterDataPresenter : BasePresenter<EnterDataView>() {
    fun dataChange(enterDateModel: EnterDateModel) {
        viewState.changeCurrent(CalculateData(calculate(enterDateModel)))
    }

    private fun calculate(enterDateModel: EnterDateModel): Double {
        val current = enterDateModel.power / 0.6574
        return Math.round(current * 100.0) / 100.0

    }
}