package com.example.dicethingfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    lateinit var randomNumberView: TextView
    lateinit var randomChoiceText : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        randomNumberView = findViewById(R.id.greetingTextView)
        randomChoiceText = findViewById(R.id.randomChoiceEditText)



        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val random = randomFunction()

            setGreeting(random)


        }

    }

    fun randomFunction() : List<Int> {
        val randomNumber = List(1) { Random.nextInt(0, getNumberFromEditText().toInt() ) }
// prints new sequence every time
        println(randomNumber)
        return randomNumber
    }

    fun setGreeting(random: List<Int>)  {
        randomNumberView.text = "$random"
    }

    fun getNumberFromEditText() : String {
        val number = randomChoiceText.text.toString()
        return number
    }

    //printRandomNumberView.text = randomValues.toString()







}