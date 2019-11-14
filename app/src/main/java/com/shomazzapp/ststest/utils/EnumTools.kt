package com.shomazzapp.ststest.utils

import kotlin.reflect.KClass

fun <T : Enum<*>> KClass<T>.getRandomValue(): T {
    return this.java.enumConstants.random()
}