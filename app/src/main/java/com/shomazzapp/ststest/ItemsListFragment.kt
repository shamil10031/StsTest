package com.shomazzapp.ststest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shomazzapp.ststest.dataStore.VosDataStore
import kotlinx.android.synthetic.main.fragment_items_list.view.*
import kotlin.random.Random

class ItemsListFragment : Fragment() {

    private val itemsVo = List(Random.nextInt(10, 100)) { VosDataStore.getNextItem() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_items_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterItems = itemsVo.filterIsInstance<ItemWrapper>()

        view.recycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ItemsAdapter(adapterItems) { item ->
                if (item is LayoutWrapper)
                    openDetailsFragment(item)
            }
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        }
    }

    private fun openDetailsFragment(layoutWrapper: LayoutWrapper) {
        val manager = activity?.supportFragmentManager
        if (manager == null) {
            Toast.makeText(
                context, "Не удалось открыть детали!", Toast.LENGTH_SHORT
            ).show()
        } else {
            val fragment = DetailsFragment.newInstance(layoutWrapper.getLayoutWrapper())
            manager.beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()

        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ItemsListFragment()
    }
}
