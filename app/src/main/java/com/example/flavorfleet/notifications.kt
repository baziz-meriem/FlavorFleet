package com.example.flavorfleet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class notifications : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_notifications)

    val notifications: List<String> = listOf(
        "Food being Prepared",
        "Order on the way",
        "Order Picked up ",
        "Food being prepared",
        "Food being prepared",
        "Order on the way"
    )

    val NotificationRecyclerView = findViewById<RecyclerView>(R.id.notificationRecyclerView)
    val Notificationadapter = NotificationAdapter(notifications)
    val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    NotificationRecyclerView.adapter = Notificationadapter
    NotificationRecyclerView.layoutManager = layoutManager
}
}