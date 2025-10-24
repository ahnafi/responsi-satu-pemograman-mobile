package com.ahnafi.responsi1mobileh1d023026.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ahnafi.responsi1mobileh1d023026.R
import com.ahnafi.responsi1mobileh1d023026.data.model.entity.Contract
import com.ahnafi.responsi1mobileh1d023026.databinding.FragmentDetailPlayerBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

//    @SerializedName("firstName")
//    val firstName: String,
//    @SerializedName("lastName")
//    val lastName: String,
//    @SerializedName("name")
//    val name: String,
//    @SerializedName("position")
//    val position: String,
//    @SerializedName("dateOfBirth")
//    val dateOfBirth: String,
//    @SerializedName("nationality")
//    val nationality: String,
//    @SerializedName("shirtNumber")
//    val shirtNumber: Int,
//    @SerializedName("marketValue")
//    val marketValue: Int,

class DetailPlayerFragment(
    private val playerName: String,
    private val position: String,
    private val nationality: String,
    private val dateOfBirth: String,
    private val shirtNumber: Int,
    private val marketValue: Int,
    private val contract: Contract?
) : BottomSheetDialogFragment() {

    private var _binding: FragmentDetailPlayerBinding? = null
    private val binding get() = _binding!!

    override fun getTheme(): Int = R.style.ThemeOverlay_App_BottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailPlayerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun loadData() {
        binding.tvPlayerName.text = playerName
        binding.tvPosition.text = position
        binding.tvNationality.text = nationality
        binding.tvDateOfBirth.text = dateOfBirth
        binding.tvShirtNumber.text = shirtNumber.toString()
        binding.tvMarketValue.text = marketValue.toString()
        binding.tvContract.text = if (contract != null) {
            "Contract: From ${contract.start} to ${contract.until}"
        } else {
            "Contract: Not available"
        }
    }

}