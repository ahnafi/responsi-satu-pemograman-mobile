package com.ahnafi.responsi1mobileh1d023026.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.ahnafi.responsi1mobileh1d023026.data.model.entity.Team
import com.ahnafi.responsi1mobileh1d023026.data.network.FootballApi
import kotlinx.coroutines.launch

class TeamViewModel(private val api: FootballApi) : ViewModel() {

    private val _team = MutableLiveData<Result<Team>>()
    val team: MutableLiveData<Result<Team>> = _team

    fun getDetailTeam() {
        viewModelScope.launch {
            try {
                val response = api.getTeam();
                if (response.isSuccessful) {
                    val teamResponse = response.body()
                    if (teamResponse != null) {
                        _team.postValue(Result.success(teamResponse))
                        Log.d("TeamViewModel", "Fetched team: $teamResponse")
                    } else {
                        _team.postValue(Result.failure(Exception("Empty response body")))
                        Log.e("TeamViewModel", "Empty response body")
                    }
                } else {
                    val errorMsg = "Error: ${response.code()} ${response.message()}"
                    _team.postValue(Result.failure(Exception(errorMsg)))
                    Log.e("TeamViewModel", errorMsg)
                }

            } catch (e: Exception) {
                Log.e("TeamViewModel", "Exception during API call: ${e.message}", e)
                _team.postValue(Result.failure(e))
            }
        }
    }

}