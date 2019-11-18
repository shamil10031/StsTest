package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.ItemWrapper
import com.shomazzapp.ststest.LayoutWrapper
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.EventItem
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.EventLayoutWrapper
import java.util.*

data class EventVo(
    var name: String? = null,
    var startTime: Date? = null,
    var endTime: Date? = null
) : Vo(), LayoutWrapper, ItemWrapper {

    override fun getLayoutWrapper(): AbstractLayoutWrapper<*> = EventLayoutWrapper(this)

    override fun getAbstractItem(): AbstractItem<*> = EventItem(this)
}