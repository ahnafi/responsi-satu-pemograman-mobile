package com.ahnafi.responsi1mobileh1d023026

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahnafi.responsi1mobileh1d023026.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private fun initLayout() {
        binding.layoutHistory.let {
            it.imgIcon.setImageResource(R.drawable.ball)
            it.tvLayout.setText(R.string.history)
        }

        binding.layoutCoach.let {
            it.imgIcon.setImageResource(R.drawable.coach)
            it.tvLayout.setText(R.string.coach)
        }

        binding.layoutPlayer.let {
            it.imgIcon.setImageResource(R.drawable.player)
            it.tvLayout.setText(R.string.player)
        }
    }

    private fun initListeners() {
        binding.layoutHistory.root.setOnClickListener {
//            Toast.makeText(this, "History clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        binding.layoutCoach.root.setOnClickListener {
            // Handle coach layout click
            val intent = Intent(this, Coach::class.java)
            startActivity(intent)
        }

        binding.layoutPlayer.root.setOnClickListener {
            // Handle player layout click
            val intent = Intent(this, Player::class.java)
            startActivity(intent)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
        initListeners()
    }
}