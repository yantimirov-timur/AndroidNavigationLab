package com.yantimirov_timur.app_task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : OptionsMenu() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        val intentActivity2 = Intent(this, Activity2::class.java)

        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            startActivity(intentActivity2)
        }
    }
}