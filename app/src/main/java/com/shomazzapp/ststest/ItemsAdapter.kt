package com.shomazzapp.ststest

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.ViewGroup
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.viewObjects.Vo

class ItemsAdapter(
    private val items: List<ItemWrapper>,
    private val onClick: (Vo) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //пока делаю без всяких коллбеков, без возможностей динамического добавления элементов и тд

    //кэш для создания холдера по viewType
    private val itemTypesCache: SparseArray<AbstractItem<*>> = SparseArray()

    init {
        items.map { it.getAbstractItem() }
            .forEach(::regItemViewType)
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val item = itemTypesCache.get(viewType)
        val view = LayoutInflater.from(parent.context)
            .inflate(item.getResourceId(), parent, false)
        return item.onCreateViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position].getAbstractItem()
        item.bindView(holder)
        holder.itemView.setOnClickListener {
            onClick.invoke(item.itemVo)
        }
    }

    override fun getItemViewType(position: Int): Int =
        items[position].getAbstractItem().getViewType()

    private fun regItemViewType(item: AbstractItem<*>) {
        if (itemTypesCache.indexOfKey(item.getViewType()) <= 0) {
            itemTypesCache.put(item.getViewType(), item)
        }
    }
}
