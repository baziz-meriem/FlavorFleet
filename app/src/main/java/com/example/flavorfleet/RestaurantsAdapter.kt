package com.example.flavorfleet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestaurantsAdapter( private val restaurantsList: List<String>) : RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val restaurantImageView: ImageView = itemView.findViewById(R.id.restaurant_image)
        val restaurantNameTextView: TextView = itemView.findViewById(R.id.restaurant)
       // val restaurantIconImageView: ImageView = itemView.findViewById(R.id.restaurant_icon)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_restaurant_card, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val restaurantName = restaurantsList[position]
        holder.restaurantNameTextView.text = restaurantName

        // Set the restaurant image and icon
        // ...
    }

    override fun getItemCount()=restaurantsList.size


}