package com.shomazzapp.ststest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shomazzapp.ststest.dataStore.ItemsDataStore
import kotlinx.android.synthetic.main.fragment_items_list.view.*
import kotlin.random.Random

class ItemsListFragment : Fragment() {

    val itemsVo = List(Random.nextInt(10, 100)) { ItemsDataStore.getNextItem() }
    val itemMapper = ItemMapper()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.recycler.adapter = ItemsAdapter(itemsVo.map(itemMapper::map))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_items_list, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = ItemsListFragment()
    }
}
