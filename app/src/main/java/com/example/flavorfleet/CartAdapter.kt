package com.example.flavorfleet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private val orders: List<String>) : RecyclerView.Adapter<CartAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val orderTextView: TextView = itemView.findViewById(R.id.order)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_order_card, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.orderTextView.text = orders[position]

    }


    override fun getItemCount() =orders.size
}