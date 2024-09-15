package com.gogote.shayari

import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

object SampleData {
    val data1 = "This is 1st Shayari"
    val data2 = "This is 2nd Shayari"

    // Function to get the current date with a time difference
    fun getDate(diff: Int): Date {
        val calendar = GregorianCalendar()
        calendar.add(Calendar.MILLISECOND, diff)
        return calendar.time
    }

    // List of DataEntity items
    val data: List<DataEntity>
        get() {
            // Corrected initialization of tempList using ArrayList
            val tempList: MutableList<DataEntity> = ArrayList()
            tempList.add(DataEntity(1, getDate(45), data1))
            tempList.add(DataEntity(2, getDate(46), data2))
            return tempList
        }
}
