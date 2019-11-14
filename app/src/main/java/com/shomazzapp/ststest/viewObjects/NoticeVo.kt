package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.VoType
import java.util.*

data class NoticeVo(
    val flightDate: Date? = null,
    val gate: String? = null
) : ItemVo(VoType.NOTICE)