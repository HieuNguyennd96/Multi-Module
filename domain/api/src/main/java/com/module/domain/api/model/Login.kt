package com.module.domain.api.model

import com.google.gson.annotations.SerializedName

class Login {
    data class Request(
        @SerializedName("user_name")
        val userName: String,
        @SerializedName("password")
        val password: String
    )

    data class Response(
        @SerializedName("access_token")
        val accessToken: String
    )
}