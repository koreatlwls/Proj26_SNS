package com.example.proj26_sns.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {

    constructor(): this("", "")
}
