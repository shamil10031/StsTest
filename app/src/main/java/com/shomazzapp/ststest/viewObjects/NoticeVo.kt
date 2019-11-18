package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.ItemWrapper
import com.shomazzapp.ststest.LayoutWrapper
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.NoticeItem
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.NoticeLayoutWrapper
import java.util.*

data class NoticeVo(
    val flightDate: Date? = null,
    val gate: String? = null
) : Vo(), LayoutWrapper, ItemWrapper{

    override fun getLayoutWrapper(): AbstractLayoutWrapper<*> = NoticeLayoutWrapper(this)

    override fun getAbstractItem(): AbstractItem<*> = NoticeItem(this)
}