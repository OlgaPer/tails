package com.comp.myapplicationtails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class TailsFragment : Fragment() {

lateinit var TailImageView: ImageView
    lateinit var TailsButton: Button

private val TailsImageList :List<Int> = listOf(
R.drawable.nuts,
    R.drawable.tail,)




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

val view = inflater.inflate(R.layout.fragment_tails,container,false)
        TailImageView=view.findViewById(R.id.Tails_image)
        TailsButton=view.findViewById(R.id.Tails_Button)

TailsButton.setOnClickListener {
   TailImageView.setImageResource(TailsImageList.random())
}


        return view

    }
}