package com.shomazzapp.ststest.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.MoveVo
import kotlinx.android.synthetic.main.item_move.view.*

class MoveItem(itemVo: MoveVo): AbstractItem<MoveVo>(itemVo) {

    override fun getResourceId(): Int = R.layout.item_move

    override fun getViewType(): Int = R.layout.item_move

    override fun onCreateViewHolder(view: View): RecyclerView.ViewHolder = ViewHolder(view)

    override fun bindView(viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.apply {
            moveFromPlace.text = itemVo.fromPlace
            moveToPlace.text = itemVo.toPlace
            moveEstimateTime.text = itemVo.getEstimateTimeString()
        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}