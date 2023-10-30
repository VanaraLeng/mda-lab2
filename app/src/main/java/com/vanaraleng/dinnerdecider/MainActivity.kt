package com.vanaraleng.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var foods = mutableListOf(
        "Hamburger",
        "Pizza",
        "Mexican",
        "American",
        "Chinese"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addFoodOnClick(view: View) {
        val newFood = editTextFoodName.text.toString()
        foods.add(newFood)
        // update food name label
        textViewFoodName.text = newFood
    }

    fun decideOnClick(view: View) {
        textViewFoodName.text = foods.random()
    }


}