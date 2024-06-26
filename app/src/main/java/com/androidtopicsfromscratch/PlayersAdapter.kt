package com.pathak.listviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.androidtopicsfromscratch.PlayerData
import com.androidtopicsfromscratch.R

class PlayersAdapter(
    private val context: Context,
    private val newsList: ArrayList<PlayerData>
) : BaseAdapter() {


    override fun getCount() = newsList.size

    override fun getItem(position: Int) = newsList[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var convertView: View? = view

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)

            with(convertView) {
                val playerName = findViewById<TextView>(R.id.tvPlayerName)
                val playerRank = findViewById<TextView>(R.id.tvPlayerRank)
                val team = findViewById<TextView>(R.id.tvTeam)
                val points = findViewById<TextView>(R.id.tvPoints)

                val news = getItem(position)

                playerName.text = news.playerName
                playerRank.text = news.playerRank.toString()
                team.text = news.team
                points.text = news.points.toString()

            }
        }
        return convertView!!
    }
}