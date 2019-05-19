package com.nimtego.sheetamount.mvp.presenters

import com.arellomobile.mvp.InjectViewState
import com.nimtego.sheetamount.mvp.view_model.EnterDateModel
import com.nimtego.sheetamount.mvp.view.EnterDataView
import com.nimtego.sheetamount.mvp.view_model.CalculateData

@InjectViewState
class EnterDataPresenter : BasePresenter<EnterDataView>() {
    fun dataChange(enterDateModel: EnterDateModel) {
        val calculateData = calculate(enterDateModel)
        viewState.changeCurrent(calculateData)
    }

    private fun calculate(enterDateModel: EnterDateModel): CalculateData {
        val power = enterDateModel.power

        return CalculateData(current380 = Math.round((power / 0.6574) * 100.0) / 100.0,
                             current220 = Math.round((power / 0.22) * 100.0) / 100.0,
                             current36  = Math.round((power / 0.036) * 100.0) / 100.0,
                             current24  = Math.round((power / 0.024) * 100.0) / 100.0,
                             current12  = Math.round((power / 0.012) * 100.0) / 100.0)

    }
}