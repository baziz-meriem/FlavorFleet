package com.example.flavorfleet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Cart : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val orders: List<String> = listOf(
            "Chinese Burger",
            "Japense Burger",
            "Kabyle Burger",
            "Arabian Burger",
            "American fries",
            "Canadian nugets",
            "Japense fries",
            "Kabyle plate",
            "Arabian food",
            "American steak",
            "Canadian shawarma"
        )

        val CartRecyclerView = findViewById<RecyclerView>(R.id.orderRecyclerView)
        val Cartadapter = CartAdapter(orders)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        CartRecyclerView.adapter = Cartadapter
        CartRecyclerView.layoutManager = layoutManager
    }
}