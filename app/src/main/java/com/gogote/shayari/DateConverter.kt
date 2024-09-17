package com.gogote.shayari

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {

    @TypeConverter
    fun toTimeStamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun toDate(timeStamp: Long?): Date? {
        return timeStamp?.let { Date(it) }
    }
}
