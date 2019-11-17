package com.shomazzapp.ststest.layoutWrappers

import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.EventVo
import com.shomazzapp.ststest.viewObjects.NoticeVo
import kotlinx.android.synthetic.main.fragment_event.view.*
import kotlinx.android.synthetic.main.fragment_notice.view.*

class NoticeLayoutWrapper(vo: NoticeVo) : AbstractLayoutWrapper<NoticeVo>(vo) {

    override fun getResourceId(): Int = R.layout.fragment_notice

    override fun onViewCreated(view: View) {
        view.fragmentNoticeText.text = viewObject.gate
    }
}