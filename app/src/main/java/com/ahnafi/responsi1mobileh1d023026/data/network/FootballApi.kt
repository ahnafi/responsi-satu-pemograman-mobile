package com.ahnafi.responsi1mobileh1d023026.data.network

import com.ahnafi.responsi1mobileh1d023026.data.model.entity.Team
import retrofit2.Response
import retrofit2.http.GET

interface FootballApi {

    @GET("teams/2")
    suspend fun getTeam(): Response<Team>

}
