package com.ahnafi.responsi1mobileh1d023026.data.model.entity

import com.google.gson.annotations.SerializedName

// "id": 2011,
//            "name": "DFB-Pokal",
//            "code": "DFB",
//            "type": "CUP",
//            "emblem": "https://crests.football-data.org/DFB_CUP.png"

data class Competition(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("emblem")
    val emblem: String
)
