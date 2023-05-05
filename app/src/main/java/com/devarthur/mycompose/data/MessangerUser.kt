package com.devarthur.mycompose.data

import androidx.annotation.DrawableRes

data class MessangerUser(
    val name: String,
    val lastMessage: String,
    @DrawableRes val avatar: Int,
)
