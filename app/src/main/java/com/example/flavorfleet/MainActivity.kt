package com.example.flavorfleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginPage = View.OnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        val logtextView: TextView = findViewById(R.id.login)
        val logtextViewsm: TextView = findViewById(R.id.text_login)

        logtextView.setOnClickListener(loginPage)
        logtextViewsm.setOnClickListener(loginPage)




    }
}