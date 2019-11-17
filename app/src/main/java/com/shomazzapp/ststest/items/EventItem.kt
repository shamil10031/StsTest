package com.shomazzapp.ststest.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.utils.toReadableString
import com.shomazzapp.ststest.viewObjects.EventVo
import kotlinx.android.synthetic.main.item_event.view.*

class EventItem(itemVo: EventVo) : AbstractItem<EventVo>(itemVo) {

    override fun getResourceId(): Int = R.layout.item_event

    override fun getViewType(): Int = R.layout.item_event

    override fun onCreateViewHolder(view: View): RecyclerView.ViewHolder = ViewHolder(view)

    override fun bindView(viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.apply {
            eventName.text = itemVo.name
            eventStartTime.text = itemVo.startTime?.toReadableString()
            eventEndTime.text = itemVo.endTime?.toReadableString()
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}