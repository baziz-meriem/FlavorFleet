package com.example.flavorfleet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CuisineTypeAdapter(private val cuisineTypes: List<String>) : RecyclerView.Adapter<CuisineTypeAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cuisineTypeTextView: TextView = itemView.findViewById(R.id.cuisine)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cuisine_type_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cuisineTypeTextView.text = cuisineTypes[position]
    }

     override fun getItemCount() = cuisineTypes.size
}






