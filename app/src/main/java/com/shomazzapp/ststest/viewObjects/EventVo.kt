package com.shomazzapp.ststest.viewObjects

import com.shomazzapp.ststest.VoType
import java.util.*

data class EventVo(
    var name: String? = null,
    var startTime: Date? = null,
    var endTime: Date? = null
) : ItemVo(VoType.EVENT)