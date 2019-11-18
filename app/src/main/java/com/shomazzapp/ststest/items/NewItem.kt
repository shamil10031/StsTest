package com.shomazzapp.ststest.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.shomazzapp.ststest.R
import com.shomazzapp.ststest.viewObjects.NewVo
import kotlinx.android.synthetic.main.item_new.view.*

class NewItem(itemVo: NewVo) : AbstractItem<NewVo>(itemVo) {

    override fun getResourceId(): Int = R.layout.item_new

    override fun getViewType(): Int = R.layout.item_new

    override fun onCreateViewHolder(view: View): RecyclerView.ViewHolder = ViewHolder(view)

    override fun bindView(viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.apply {
            newText.text = itemVo.text
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}