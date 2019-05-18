package com.nimtego.sheetamount.mvp.view

import com.nimtego.sheetamount.mvp.view_model.CalculateData

interface EnterDataView : BaseView {
    fun clearData()
    fun changeCurrent(calculateData: CalculateData)
}