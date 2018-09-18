package com.laviola.workout

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required

@RealmClass
open class Exercise(@Required var name: String,
                    @Required var series: String,
                    @Required var repeat: String,
                    @Required var machine: String) : RealmObject() {
    @PrimaryKey
    var id: Int = 0

    constructor() : this("", "", "", "")
}
