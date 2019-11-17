package com.shomazzapp.ststest.layoutWrappers

import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.EventVo
import kotlinx.android.synthetic.main.fragment_event.view.*

class EventLayoutWrapper(eventVo: EventVo) : AbstractLayoutWrapper<EventVo>(eventVo) {

    override fun getResourceId(): Int = R.layout.fragment_event

    override fun onViewCreated(view: View) {
        view.fragmentEventName.text = viewObject.name
    }
}