package com.ahnafi.responsi1mobileh1d023026.ui

import android.graphics.Color
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.ahnafi.responsi1mobileh1d023026.data.model.entity.Player
import com.ahnafi.responsi1mobileh1d023026.databinding.ListPlayerBinding

class PlayerAdapter(
    var players: List<Player>,
    private val onClick: OnPlayerClickListener
) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {
    inner class PlayerViewHolder(val binding: ListPlayerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayerAdapter.PlayerViewHolder {
        val binding = ListPlayerBinding.inflate(
            android.view.LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PlayerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.binding.tvTitle.text = player.name
        holder.binding.tvAuthor.text = player.nationality

        val color = when (player.position.lowercase()) {
            "goalkeeper" -> Color.YELLOW
            "defence" -> Color.BLUE
            "midfield" -> Color.GREEN
            "centre-forward" -> Color.RED
            "offence" -> Color.MAGENTA
            "right-back" -> Color.CYAN
            "left-back" -> Color.LTGRAY
            "central-midfield" -> Color.DKGRAY
            else -> Color.GRAY
        }
        holder.binding.cardView.setBackgroundColor(color)

        holder.binding.root.setOnClickListener {
            onClick.onPlayerClick(player)
        }
    }

    override fun getItemCount(): Int = players.size

    interface OnPlayerClickListener {
        fun onPlayerClick(player: Player)
    }

}
