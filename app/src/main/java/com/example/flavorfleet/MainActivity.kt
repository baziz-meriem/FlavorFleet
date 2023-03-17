package com.example.flavorfleet

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val textView = findViewById<TextView>(R.id.name_label)

// Set the font family
        //val typeface = Typeface.createFromAsset(assets, "fonts/Quicksand-Bold.xml")

       // textView.typeface = typeface
    }
}