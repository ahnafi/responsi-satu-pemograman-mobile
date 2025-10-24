package com.ahnafi.responsi1mobileh1d023026.data.model.entity

import com.google.gson.annotations.SerializedName

data class Coach(

    @SerializedName("id")
    val id: Int,

    @SerializedName("firstName")
    val firstName: String,

    @SerializedName("lastName")
    val lastName: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String,

    @SerializedName("nationality")
    val nationality: String,

    @SerializedName("contract")
    val contract: Contract,


)
