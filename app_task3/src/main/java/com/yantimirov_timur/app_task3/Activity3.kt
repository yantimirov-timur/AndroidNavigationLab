package com.yantimirov_timur.app_task3

import android.content.Intent


import android.os.Bundle
import android.widget.Button


class Activity3 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val intentFirstActivity = Intent(this, MainActivity::class.java)

        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            startActivity(intentFirstActivity)
        }
    }
}