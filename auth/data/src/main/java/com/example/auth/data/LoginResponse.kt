package com.example.auth.data

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExpiryTimeStamp: Long,
    val userId: String
)
