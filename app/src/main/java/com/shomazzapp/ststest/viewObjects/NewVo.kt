package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.ItemWrapper
import com.shomazzapp.ststest.LayoutWrapper
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.NewItem
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.NewLayoutWrapper

class NewVo(val text: String): Vo(), LayoutWrapper, ItemWrapper{
    override fun getLayoutWrapper(): AbstractLayoutWrapper<*> = NewLayoutWrapper(this)

    override fun getAbstractItem(): AbstractItem<*> = NewItem(this)
}