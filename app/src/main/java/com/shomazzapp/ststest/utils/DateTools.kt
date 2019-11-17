package com.shomazzapp.ststest.utils

import android.text.format.DateFormat
import java.util.*

fun Date.toReadableString(): String =
    DateFormat.format("hh:mm dd/MM/yyyy", this).toString()
