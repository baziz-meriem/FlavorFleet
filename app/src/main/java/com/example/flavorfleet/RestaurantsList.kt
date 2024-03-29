package com.example.flavorfleet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantsList : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants_list)

       /* val customFont = Typeface.createFromAsset(this.assets, "fonts/Arvo-BoldItalic.ttf")
        val myTextView = findViewById<TextView>(R.id.welcome)
        myTextView.typeface = customFont*/
        val restaurantsList: List<String> = listOf(
            " Chin Restau",
            "NiHao",
            "JIANGSU",
            "Mvstic Hill",
            "KFC",
            "Mc Donald's",
            "JIANGSU",
            "Mvstic Hill",
            "KFC",
            "Mc Donald's",
        )
        val cuisineList: List<String> = listOf(
            "Chinese",
            "Japense",
            "Kabyle",
            "Arabian",
            "American",
            "Canadian",
            "Japense",
            "Kabyle",
            "Arabian",
            "American",
            "Canadian"
        )
        val recyclerView = findViewById<RecyclerView>(R.id.cuisineType)
        val adapter = CuisineTypeAdapter(this,cuisineList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        val RestaurantRecyclerView = findViewById<RecyclerView>(R.id.restaurant)
        val Restaurantadapter = RestaurantsAdapter(restaurantsList)
        val layoutManager = GridLayoutManager(this, 2)

        RestaurantRecyclerView.adapter = Restaurantadapter
        RestaurantRecyclerView.layoutManager = layoutManager
    }
}