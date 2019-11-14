package com.shomazzapp.ststest.dataStore

import com.shomazzapp.ststest.utils.getRandomValue
import com.shomazzapp.ststest.viewObjects.*
import java.util.*
import kotlin.random.Random

class ItemsDataStore {

    companion object {

        fun getNextItem(): ItemVo {
            return when (val i = Random.nextInt(3)) {
                0 -> getRandomNotice()
                1 -> getRandomEvent()
                3 -> getRandomMove()
                else -> throw IllegalArgumentException("Not implemented case for number $i")
            }
        }

        private fun getRandomNotice(): NoticeVo {
            val noticeDate = Date()
            val gateNumber = Random.nextInt(1, 99)
            return NoticeVo(noticeDate, "Gate #$gateNumber")
        }

        private fun getRandomEvent(): EventVo {
            val start = Date()
            val end = Date()
            val eventNumber = Random.nextInt(1, 99)
            return EventVo("Event #$eventNumber", start, end)
        }

        private fun getRandomMove(): MoveVo {
            val placeNumber = Random.nextInt(1, 99)
            val time = Random.nextInt(1, 20)
            val timeInterval = TimeUnit::class.getRandomValue()
            return MoveVo(
                fromPlace = "Place #$placeNumber",
                toPlace = "Place #${placeNumber + 1}",
                estimateTime = TimeInterval(time, timeInterval)
            )
        }
    }
}