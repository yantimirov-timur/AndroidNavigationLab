package com.yantimirov_timur.app2

import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val intentFirstActivity = Intent(this, Activity1::class.java)
        val intentSecondActivity = Intent(this, Activity2::class.java)

        findViewById<Button>(R.id.buttonToSecond).setOnClickListener {
            finish()

        }
        findViewById<Button>(R.id.buttonToFirst).setOnClickListener {
            startActivity(intentFirstActivity)

        }
    }
}