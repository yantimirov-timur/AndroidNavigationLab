package com.yantimirov_timur.app_task2


import android.os.Bundle
import android.widget.Button
import com.yantimirov_timur.lab3.R

class Activity3 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }
}