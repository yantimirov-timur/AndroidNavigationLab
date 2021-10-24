package com.yantimirov_timur.app2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        val intentActivity2 = Intent(this, Activity2::class.java)

        findViewById<Button>(R.id.buttonToSecond).setOnClickListener {
            startActivity(intentActivity2)
        }
    }
}