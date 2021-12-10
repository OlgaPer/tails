package com.comp.myapplicationtails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class developerAdapter(private val developersNames: List<String>):RecyclerView.Adapter
<developerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): developerViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.developers_list, parent,
            false)
        return developerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: developerViewHolder, position: Int) {
        val name=developersNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {


        return developersNames.size
    }

}