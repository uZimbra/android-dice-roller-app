package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceImageView: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImageView = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val res = when (Random.nextInt(6)) {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageView.setImageResource(res)
    }
}