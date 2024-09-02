package com.example.marsphotos.network

import com.google.gson.annotations.SerializedName

data class MarsPhoto(
    val id: String,
    @SerializedName("img_src") val imgSrc: String
)


