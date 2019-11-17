package com.shomazzapp.ststest.utils

import com.shomazzapp.ststest.VoType
import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.EventItem
import com.shomazzapp.ststest.items.MoveItem
import com.shomazzapp.ststest.items.NoticeItem
import com.shomazzapp.ststest.viewObjects.EventVo
import com.shomazzapp.ststest.viewObjects.Vo
import com.shomazzapp.ststest.viewObjects.MoveVo
import com.shomazzapp.ststest.viewObjects.NoticeVo

class ItemMapper {

    //можно было сделать статическим, но потом может появится логика, требующая зависимостей

    fun map(vo: Vo): AbstractItem<*> {
        return when (vo.voType) {
            VoType.EVENT -> EventItem(vo as EventVo)
            VoType.MOVE -> MoveItem(vo as MoveVo)
            VoType.NOTICE -> NoticeItem(vo as NoticeVo)
        }
    }

}