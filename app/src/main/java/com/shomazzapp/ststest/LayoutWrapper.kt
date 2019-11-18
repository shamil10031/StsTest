package com.shomazzapp.ststest

import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper

interface LayoutWrapper {

    fun getLayoutWrapper(): AbstractLayoutWrapper<*>

}