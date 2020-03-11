package com.example.motioneditor_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_04.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_04)

        button3.setOnClickListener {
            startActivity(Intent(this, AnimalActivity::class.java))
        }

        button1.setOnClickListener {
            startActivity(Intent(this, GamesActivity::class.java))
        }

        button8.setOnClickListener {
            startActivity(Intent(this, MathActivity::class.java))
        }

        button7.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }




}