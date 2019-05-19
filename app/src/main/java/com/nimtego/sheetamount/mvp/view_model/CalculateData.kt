package com.nimtego.sheetamount.mvp.view_model

import java.io.Serializable

data class CalculateData (
        val current380: Double,
        val current220: Double,
        val current36: Double,
        val current24: Double,
        val current12: Double
): Serializable