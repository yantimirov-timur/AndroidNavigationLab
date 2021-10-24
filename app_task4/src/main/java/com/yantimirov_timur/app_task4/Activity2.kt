package com.yantimirov_timur.app_task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intentThirdActivity = Intent(this, Activity3::class.java)

        findViewById<Button>(R.id.buttonToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonToThird).setOnClickListener {
            startActivity(intentThirdActivity)
        }
    }
}