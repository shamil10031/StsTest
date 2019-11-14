package com.shomazzapp.ststest

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.shomazzapp.ststest.items.AbstractItem

class ItemsAdapter(
    private val items: List<AbstractItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //пока делаю без всяких коллбеков, без возможностей динамического добавления элементов и тд

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder =
        items[position].onCreateViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        items[position].bindView(holder)

}
