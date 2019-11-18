package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.ItemWrapper
import com.shomazzapp.ststest.LayoutWrapper
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.MoveItem
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.MoveLayoutWrapper

data class MoveVo(
    val fromPlace: String? = null,
    val toPlace: String? = null,
    private val estimateTime: TimeInterval? = null
) : Vo(), LayoutWrapper, ItemWrapper {

    override fun getLayoutWrapper(): AbstractLayoutWrapper<*> = MoveLayoutWrapper(this)

    override fun getAbstractItem(): AbstractItem<*> = MoveItem(this)

    fun getEstimateTimeString(): String {
        val value = estimateTime?.value
        val unit = estimateTime?.unit?.getUnitString()

        return if (estimateTime != null) {
            "$value $unit."
        } else ""
    }
}

class TimeInterval(
    val value: Int,
    val unit: TimeUnit
)

enum class TimeUnit {

    SECOND {
        override fun getUnitString() = "сек"
    },
    MINUTE {
        override fun getUnitString() = "мин"
    },
    HOUR {
        override fun getUnitString() = "ч"
    };
    //можно вынести в strings.xml, но в задаче простая логика, смысла нет пока

    abstract fun getUnitString(): String
}