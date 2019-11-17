package com.shomazzapp.ststest.utils

import com.shomazzapp.ststest.VoType
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.EventLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.MoveLayoutWrapper
import com.shomazzapp.ststest.layoutWrappers.NoticeLayoutWrapper
import com.shomazzapp.ststest.viewObjects.EventVo
import com.shomazzapp.ststest.viewObjects.MoveVo
import com.shomazzapp.ststest.viewObjects.NoticeVo
import com.shomazzapp.ststest.viewObjects.Vo

class LayoutWrapperMapper {

    //гыыы, враппер-маппер (да, над названиями старался не думать особо, т к это просто пример)
    //можно было сделать статическим, но потом может появится логика, требующая зависимостей

    fun map(vo: Vo): AbstractLayoutWrapper<*> {
        return when (vo.voType) {
            VoType.EVENT -> EventLayoutWrapper(vo as EventVo)
            VoType.MOVE -> MoveLayoutWrapper(vo as MoveVo)
            VoType.NOTICE -> NoticeLayoutWrapper(vo as NoticeVo)
        }
    }

}