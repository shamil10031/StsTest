package com.shomazzapp.ststest.layoutWrappers

import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.NewVo
import kotlinx.android.synthetic.main.fragment_new.view.*

class NewLayoutWrapper(vo: NewVo) : AbstractLayoutWrapper<NewVo>(vo) {

    override fun getResourceId(): Int = R.layout.fragment_new

    override fun onViewCreated(view: View) {
        view.fragmentNewText.text = viewObject.text
    }
}