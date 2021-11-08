package com.yantimirov_timur.app_task4

import android.content.Intent


import android.os.Bundle
import android.widget.Button


class Activity3 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val intentFirstActivity = Intent(this, MainActivity::class.java)
        val intentSecondActivity = Intent(this, Activity2::class.java)

        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            startActivity(intentSecondActivity)

        }
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            startActivity(intentFirstActivity)

        }
    }
}