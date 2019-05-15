package com.nimtego.sheetamount.mvp.view

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(OneExecutionStateStrategy::class)
interface ProgressView : BaseView {
    fun showProgress()
    fun hideProgress()
}