package com.ahnafi.responsi1mobileh1d023026.data.model.entity

import com.google.gson.annotations.SerializedName

//            "id": 11656,
//            "firstName": "Agustín",
//            "lastName": "Rossi",
//            "name": "Agustín Rossi",
//            "position": "Goalkeeper",
//            "dateOfBirth": "1995-08-21",
//            "nationality": "Argentina",
//            "shirtNumber": 1,
//            "marketValue": 3200000,
//            "contract": {
//                "start": "2017-02",
//                "until": "2023-12"
//             }

data class Player(
    @SerializedName("id")
    val id: Int,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String,
    @SerializedName("nationality")
    val nationality: String,
    @SerializedName("shirtNumber")
    val shirtNumber: Int,
    @SerializedName("marketValue")
    val marketValue: Int,
    @SerializedName("contract")
    val contract: Contract
)

data class Contract(
    @SerializedName("start")
    val start: String,
    @SerializedName("until")
    val until: String
)
