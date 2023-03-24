package com.example.flavorfleet

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CuisineTypeAdapter(private val context: RestaurantsList, private val cuisineTypes: List<String>) : RecyclerView.Adapter<CuisineTypeAdapter.ViewHolder>() {
    private var selectedPosition = 0
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cuisineTypeTextView: TextView = itemView.findViewById(R.id.cuisine)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cuisine_type_item, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("ResourceAsColor", "SuspiciousIndentation")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val customTypeface = Typeface.createFromAsset(context.assets, "fonts/Quicksand-Medium.ttf")
        holder.cuisineTypeTextView.text = cuisineTypes[position]

            // Default color and style of the textView
            holder.cuisineTypeTextView.setTextColor(Color.BLACK)

        // Set the click listener
        holder.itemView.setOnClickListener {
            // Change the style of the previously selected textView
            notifyItemChanged(selectedPosition)

            // Change the style of the clicked textView
            holder.cuisineTypeTextView.setTextColor(R.color.primary)
            holder.cuisineTypeTextView.setTypeface(customTypeface, Typeface.BOLD)

            // Update the selected position
            selectedPosition = holder.adapterPosition
        }
    }


     override fun getItemCount() = cuisineTypes.size
}






