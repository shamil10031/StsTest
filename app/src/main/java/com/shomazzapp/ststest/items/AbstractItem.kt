package com.shomazzapp.ststest.items

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.View
import com.shomazzapp.ststest.viewObjects.Vo

abstract class AbstractItem<T: Vo>(val itemVo: T) {

    @LayoutRes
    abstract fun getResourceId(): Int

    abstract fun getViewType(): Int

    abstract fun bindView(viewHolder: RecyclerView.ViewHolder)

    abstract fun onCreateViewHolder(view: View): RecyclerView.ViewHolder

}