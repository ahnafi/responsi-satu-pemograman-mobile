package com.ahnafi.responsi1mobileh1d023026.data.model.entity

import com.google.gson.annotations.SerializedName

data class Team(

    @SerializedName("lastUpdated")
    val lastUpdated: String,

    //squad
    @SerializedName("squad")
    val squad: List<Player>,

    @SerializedName("marketValue")
    val marketValue: Int,

//    area
    @SerializedName("area")
    val area: Area,

    @SerializedName("coach")
    val coach: Coach,

    @SerializedName("runningCompetitions")
    val runningCompetitions: List<Competition>
)