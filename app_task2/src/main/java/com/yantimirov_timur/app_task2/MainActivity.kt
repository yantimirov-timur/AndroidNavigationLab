package com.yantimirov_timur.app_task2


import android.content.Intent
import android.os.Bundle

import android.widget.Button
import com.yantimirov_timur.lab3.R


class MainActivity : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)



        val intent1 = Intent(this, Activity2::class.java)
        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            startActivity(intent1)
        }

    }

}