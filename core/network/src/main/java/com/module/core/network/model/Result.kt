package com.module.core.network.model

sealed class Result<T>(
    val data: T?,
    val exception: Throwable?,
    val status: Status
) {
    class Loading<T> : Result<T>(null, null, Status.LOADING)
    class Error<T>(exception: Throwable) : Result<T>(null, exception, Status.ERROR)
    class Success<T>(data: T?) : Result<T>(data, null, Status.SUCCESS)
}

enum class Status {
    LOADING,
    SUCCESS,
    ERROR
}