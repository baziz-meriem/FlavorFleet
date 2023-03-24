package com.example.flavorfleet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerPage = View.OnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }
        val RegtextView: TextView = findViewById(R.id.register)
        val RegtextViewsm: TextView = findViewById(R.id.text_register)

            RegtextView.setOnClickListener(registerPage)
            RegtextViewsm.setOnClickListener(registerPage)

    }
}