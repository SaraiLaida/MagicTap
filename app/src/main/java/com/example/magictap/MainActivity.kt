package com.example.magictap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = findViewById<TextView>(R.id.textView)
        var counter = 0
        val upgradeButton = findViewById<Button>(R.id.upgrade_button)
        val button = findViewById<Button>(R.id.counter_button)

        button.setOnClickListener{
        counter ++
            display.text= counter.toString()
//display.text tells the program I am adjusting the text of my variable. counter.toString turns the output into a string which can then be displayed by the textview.

            if (counter >= 100) {
        //make upgrade button visible
        upgradeButton.visibility = View.VISIBLE

        //when the upgrade button is clicked
        upgradeButton.setOnClickListener{
            button.text = "Add 2!"

            //makes all the necessary changes to the original button
            button.setOnClickListener{
                counter += 2
                display.text = counter.toString()
            }

//Make the  upgrade button invisible again after you click it
            upgradeButton.visibility = View.INVISIBLE
            }


        }
    }


    }
} //main activity