package com.comp.myapplicationtails

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class developerViewHolder(itemView: View):RecyclerView.ViewHolder (itemView) {

private val developerNameTextView: TextView =itemView.findViewById(R.id.developer_name_text)

fun bind (name:String) {

    developerNameTextView.text = name

}


}