package com.ahnafi.responsi1mobileh1d023026.data.model.entity

import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("flag")
    val flag: String
)