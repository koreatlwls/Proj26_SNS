package com.example.proj26_sns.gallery

import android.net.Uri

data class GalleryPhoto(
    val id: Long,
    val uri: Uri,
    val name: String,
    val date: String,
    val size: Int,
    var isSelected: Boolean = false
)
