package com.animesh.roy.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {

        val boxThreeTxt = findViewById<TextView>(R.id.box_three_txt)
        val boxFourTxt = findViewById<TextView>(R.id.box_four_txt)
        val boxFiveTxt = findViewById<TextView>(R.id.box_five_txt)

        when(view.id) {
            R.id.box_one_txt -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_txt -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_txt -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_txt -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_txt -> view.setBackgroundColor(Color.RED)

            // Boxes using custom colors for background
            R.id.red_button -> {
                boxThreeTxt.setBackgroundResource(R.color.my_red)
                // view.setBackgroundColor(Color.RED)
            }
            R.id.yellow_button -> boxFourTxt.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveTxt.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
         val boxOneTxt = findViewById<TextView>(R.id.box_one_txt)
         val boxTwoTxt = findViewById<TextView>(R.id.box_two_txt)
         val boxThreeTxt = findViewById<TextView>(R.id.box_three_txt)
         val boxFourTxt = findViewById<TextView>(R.id.box_four_txt)
         val boxFiveTxt = findViewById<TextView>(R.id.box_five_txt)

        val rootConstrainLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickableView: List<View> = listOf(boxOneTxt, boxTwoTxt, boxThreeTxt, boxFourTxt, boxFiveTxt, rootConstrainLayout,
                                        redButton, greenButton, yellowButton)

        for (item in clickableView) {
            item.setOnClickListener {
                makeColored(it)
            }
        }

    }
}