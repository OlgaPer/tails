package com.comp.myapplicationtails

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

bottomNavigationView=findViewById(R.id.bottom_navigator)

bottomNavigationView.setOnItemSelectedListener { item->
    var fragment:Fragment?=null
    when (item.itemId) {


        R.id.cnow_roll->{
    fragment=TailsFragment()

        }

        R.id.about->{
            fragment=AboutFragment()
        }
    }
replaceFragment(fragment!!)
    true
}
bottomNavigationView.selectedItemId=R.id.cnow_roll
    }

fun replaceFragment(fragment: Fragment){
    supportFragmentManager
        .beginTransaction()
        .replace(R.id.fragment_container,fragment)
        .commit()
}



}