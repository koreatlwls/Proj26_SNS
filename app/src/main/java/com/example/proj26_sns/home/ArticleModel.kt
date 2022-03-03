package com.example.proj26_sns.home

data class ArticleModel(
    val sellerId: String,
    val title: String,
    val createdAt: Long,
    val content: String,
    val imageUrlList: List<String>
) {

    constructor(): this("", "", 0, "", listOf())

}
