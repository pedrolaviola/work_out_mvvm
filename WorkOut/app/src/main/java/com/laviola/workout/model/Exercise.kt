package com.laviola.workout.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
open class Exercise(@ColumnInfo(name = "name") var name: String,
                    @ColumnInfo(name = "series") var series: String,
                    @ColumnInfo(name = "repeat") var repeat: String,
                    @ColumnInfo(name = "machine") var machine: String) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
