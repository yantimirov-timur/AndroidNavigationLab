package com.yantimirov_timur.app_task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity2 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intentThirdActivity = Intent(this, Activity3::class.java)

        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToThird).setOnClickListener {
            startActivity(intentThirdActivity)
        }
    }
}