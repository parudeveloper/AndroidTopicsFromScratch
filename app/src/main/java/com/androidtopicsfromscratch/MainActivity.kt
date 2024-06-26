package com.androidtopicsfromscratch

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.androidtopicsfromscratch.databinding.ActivityMainBinding
import com.pathak.listviewdemo.PlayersAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var playerData = ArrayList<PlayerData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()

    }

    private fun initViews() {
        val playersList= sendDataToAdapter()
        val playersAdapter = PlayersAdapter(this,playersList)
        binding.listOfPlayers.adapter = playersAdapter
    }

    private fun sendDataToAdapter(): ArrayList<PlayerData> {
        playerData = ArrayList()
        playerData.add(PlayerData(1,"Surya Kumar","IND",895))
        playerData.add(PlayerData(2,"Travis Head","AUS",890))
        playerData.add(PlayerData(3,"Virat Kohli","IND",880))
        playerData.add(PlayerData(4,"Marsh","AUS",875))
        playerData.add(PlayerData(5,"Deviliers","SA",870))
        playerData.add(PlayerData(6,"Gayle","WI",865))
        playerData.add(PlayerData(7,"Pointing","AUS",860))
        playerData.add(PlayerData(8,"Rashid Khan","AFG",855))
        playerData.add(PlayerData(9,"Mucculum","NZ",850))
        playerData.add(PlayerData(10,"ChrisLynn","AUS",845))


        return playerData

    }
}