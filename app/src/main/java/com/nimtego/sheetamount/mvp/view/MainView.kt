package com.nimtego.sheetamount.mvp.view

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.nimtego.sheetamount.mvp.model.CalculateData

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : BaseView {
    fun showCalculateData(calculateData: CalculateData)
}