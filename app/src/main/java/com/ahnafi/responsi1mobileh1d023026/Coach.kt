package com.ahnafi.responsi1mobileh1d023026

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahnafi.responsi1mobileh1d023026.databinding.ActivityCoachBinding
import com.ahnafi.responsi1mobileh1d023026.viewmodel.TeamViewModel
import com.ahnafi.responsi1mobileh1d023026.data.network.RetrofitInstance

class Coach : AppCompatActivity() {

    lateinit var binding: ActivityCoachBinding
    private lateinit var teamViewModel: TeamViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoachBinding.inflate(layoutInflater)
        setContentView(binding.root)

        teamViewModel = TeamViewModel(RetrofitInstance.getApiService())
        getDataCoach()
    }

    private fun getDataCoach() {
        teamViewModel.getDetailTeam()
        teamViewModel.team.observe(this) { result ->
            result.onSuccess { team ->
                val coach = team.coach
                binding.tvFullName.text = "Full Name: ${coach.firstName} ${coach.lastName}"
                binding.tvName.text = "Name: ${coach.name}"
                binding.tvDateOfBirth.text = "Date of Birth: ${coach.dateOfBirth}"
                binding.tvContract.text =
                    "Contract: From ${coach.contract.start} to ${coach.contract.until}"
                binding.tvNationality.text = "Nationality: ${coach.nationality}"
            }.onFailure { e ->
                e.printStackTrace()
            }
        }
    }

}