package com.example.motioneditor_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_04.*
import kotlinx.android.synthetic.main.activity_art.*

class AnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_art)

        dino1.setOnClickListener {
            Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG).show()
        }
    }




}