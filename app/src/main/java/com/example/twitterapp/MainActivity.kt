package com.example.twitterapp

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.twitterapp.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.go_back), Toast.LENGTH_SHORT).show()

        }

        binding.mention  .setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.mention_tuwaiq), Toast.LENGTH_SHORT).show()

        }
        binding.favorate.setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.like), Toast.LENGTH_SHORT).show()
            binding.favorate.setImageResource(R.drawable.favorite)
        }
        binding.repeat.setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.retweet), Toast.LENGTH_SHORT).show()

        }
       binding.share.setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.share), Toast.LENGTH_SHORT).show()

        }
        binding.textIcon  .setOnClickListener {
            Toast.makeText(applicationContext, getString(R.string.replay), Toast.LENGTH_SHORT).show()

        }
        var currentDateTime = LocalDateTime.now()
        binding.date.setText(currentDateTime.toString())





    }


}