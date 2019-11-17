package com.shomazzapp.ststest.layoutWrappers

import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.MoveVo
import kotlinx.android.synthetic.main.fragment_event.view.*
import kotlinx.android.synthetic.main.fragment_move.view.*

class MoveLayoutWrapper(vo: MoveVo) : AbstractLayoutWrapper<MoveVo>(vo) {

    override fun getResourceId(): Int = R.layout.fragment_move

    override fun onViewCreated(view: View) {
        view.fragmentMoveText.text = "${viewObject.fromPlace} to ${viewObject.toPlace}"
    }
}