package com.example.flavorfleet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val notes: List<String>) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {
     inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val noteTextView: TextView = itemView.findViewById(R.id.note)
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_note_card, parent, false)
         return ViewHolder(view)
     }

     @SuppressLint("SuspiciousIndentation")
     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         holder.noteTextView.text = notes[position]

     }


     override fun getItemCount() =notes.size
}
