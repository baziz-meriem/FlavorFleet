package com.example.flavorfleet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Notes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val notes: List<String> = listOf(
            "Chinese Note",
            "Japense Note",
            "Kabyle Note",
            "Arabian Note",
            "American Note",
            "Canadian Note",
            "Japense Note",
            "Kabyle Note",
            "Arabian Note"
        )

        val NotesRecyclerView = findViewById<RecyclerView>(R.id.notesRecyclerView)
        val Noteadapter = NoteAdapter(notes)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        NotesRecyclerView.adapter = Noteadapter
        NotesRecyclerView.layoutManager = layoutManager
    }
}