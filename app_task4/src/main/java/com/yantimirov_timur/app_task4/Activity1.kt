package com.yantimirov_timur.app_task4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity1 : OptionsMenu() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val intentActivity2 = Intent(this, Activity2::class.java)
        val intentActivity3 = Intent(this, Activity3::class.java)

        findViewById<Button>(R.id.buttonToSecond).setOnClickListener {
            startActivity(intentActivity2)
        }

        findViewById<Button>(R.id.buttonToThird).setOnClickListener {
            startActivity(intentActivity3)
        }

    }
}