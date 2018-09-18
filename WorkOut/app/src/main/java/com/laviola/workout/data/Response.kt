package com.laviola.workout.data

data class Response<out T> (
        val status: Int,
        val data: T?,
        val error: Throwable?
)