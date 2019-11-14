package com.shomazzapp.ststest.items

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.shomazzapp.ststest.viewObjects.ItemVo

abstract class AbstractItem(val itemVo: ItemVo) {

    @LayoutRes
    abstract fun getResourceId(): Int

    abstract fun getViewType(): Int

    abstract fun bindView(viewHolder: RecyclerView.ViewHolder)

    abstract fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

}