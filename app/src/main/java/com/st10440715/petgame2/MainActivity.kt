package com.st10440715.petgame2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class mainactivity2 : AppCompatActivity() {
    private val updateStatus: Unit? = null
    var Hunger: Int = 0
    var Happiness: Int = 100
    var Cleanliness: Int = 100

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)

        var Happiness = findViewById<TextView>(R.id.tvHappiness)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener{
            play()
            val panda = "Wanda"
            Happiness.text= "Wanda wants to play"
            updateStatus
         }
        fun play(){
            var happiness = 100
            var hunger = 50
            if (happiness > 100){
                happiness = 100
            }
            print("Wanda has played.")
        }

        var Hunger = findViewById<TextView>(R.id.tvHunger)
        val btnEat = findViewById<Button>(R.id.btnEat)
        btnEat.setOnClickListener {
            eat()
            val panda = "Wanda"
            Hunger.text= "Wanda wants to eat."
            updateStatus
        }
        fun eat(){
            var hunger = 100
            if (hunger < 50){
                hunger = 50
            }
            print("Wanda has eaten.")
        }
        var cleanliness = findViewById<TextView>(R.id.tvCleanliness)
        val btnClean = findViewById<Button>(R.id.btnClean)
        btnClean.setOnClickListener{
             clean()
            val panda = "Wanda"
            cleanliness.text= "Wanda needs to clean"
            updateStatus
        }
        fun clean(){
            var cleanliness = 60
            if(cleanliness > 80){
                cleanliness = 80
            }
            print("Wanda has been cleaned")
        }
    }

    private fun clean() {
        TODO("Wanda needs to clean")
    }

    private fun eat() {
        TODO("Wanda needs to eat")
    }

    private fun play() {
        TODO("Wanda needs to play")
    }

}
