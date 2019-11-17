package com.shomazzapp.ststest.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.utils.toReadableString
import com.shomazzapp.ststest.viewObjects.NoticeVo
import kotlinx.android.synthetic.main.item_notice.view.*

class NoticeItem(itemVo: NoticeVo) : AbstractItem<NoticeVo>(itemVo) {

    override fun getResourceId(): Int = R.layout.item_notice

    override fun getViewType(): Int = R.layout.item_notice

    override fun onCreateViewHolder(view: View): RecyclerView.ViewHolder = ViewHolder(view)

    override fun bindView(viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.apply {
            noticeFlightDate.text = itemVo.flightDate?.toReadableString()
            noticeFlightGate.text = itemVo.gate.toString()
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}