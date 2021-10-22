package com.yantimirov_timur.lab3


import android.os.Bundle
import android.widget.Button

class Activity3 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        findViewById<Button>(R.id.buttonToSecond).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonToFirst).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }
}