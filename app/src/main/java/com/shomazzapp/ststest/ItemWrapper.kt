package com.shomazzapp.ststest

import com.shomazzapp.ststest.items.AbstractItem

interface ItemWrapper {

    fun getAbstractItem(): AbstractItem<*>

}