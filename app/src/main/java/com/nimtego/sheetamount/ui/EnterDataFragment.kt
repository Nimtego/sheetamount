package com.nimtego.sheetamount.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.nimtego.sheetamount.R
import com.nimtego.sheetamount.mvp.presenters.EnterDataPresenter
import com.nimtego.sheetamount.mvp.view.EnterDataView
import com.nimtego.sheetamount.mvp.view_model.CalculateData
import com.nimtego.sheetamount.mvp.view_model.EnterDateModel
import kotlinx.android.synthetic.main.fragment_add_user_data.*

class EnterDataFragment : MvpAppCompatFragment(), EnterDataView {

// MARK: - Properties

    @InjectPresenter
    internal lateinit var presenter: EnterDataPresenter

    lateinit var listView: List<TextView>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_user_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        power?.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                this@EnterDataFragment.dataSetChange()
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
            }
        })
        this.listView = listOf(current380,
                               current220,
                               current36,
                               current24,
                               current12)
    }

// MARK: view methods

    override fun clearData() {
        setDefaultCurrent()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changeCurrent(calculateData: CalculateData) {
        current380.text = calculateData.current380.toString()
        current220.text = calculateData.current220.toString()
        current36.text = calculateData.current36.toString()
        current24.text = calculateData.current24.toString()
        current12.text = calculateData.current12.toString()
    }

// MARK: private methods

    private fun dataSetChange() {
        if (power.text.isNotEmpty()) {
            this.presenter.dataChange(EnterDateModel(power.text.toString().toDouble()))
        }
        else {
            setDefaultCurrent()
        }
    }

    private fun setDefaultCurrent() {
        this.listView.forEach { it.text = "-/-" }
    }

    companion object {
        fun getInstance() = EnterDataFragment()
    }
}