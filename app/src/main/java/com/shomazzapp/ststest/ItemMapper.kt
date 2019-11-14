package com.shomazzapp.ststest

import com.shomazzapp.ststest.items.AbstractItem
import com.shomazzapp.ststest.items.EventItem
import com.shomazzapp.ststest.items.MoveItem
import com.shomazzapp.ststest.items.NoticeItem
import com.shomazzapp.ststest.viewObjects.EventVo
import com.shomazzapp.ststest.viewObjects.ItemVo
import com.shomazzapp.ststest.viewObjects.MoveVo
import com.shomazzapp.ststest.viewObjects.NoticeVo

class ItemMapper() {

    //можно было сделать статическим, но потом может появится логика, требующая зависимости

    fun map(itemVo: ItemVo): AbstractItem {
        return when (itemVo.voType) {
            VoType.EVENT -> EventItem(itemVo as EventVo)
            VoType.MOVE -> MoveItem(itemVo as MoveVo)
            VoType.NOTICE -> NoticeItem(itemVo as NoticeVo)
        }
    }

}