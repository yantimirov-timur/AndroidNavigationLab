package com.yantimirov_timur.app_task2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.yantimirov_timur.lab3.R

class Activity3 : MainActivity() {
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

//    override fun onSupportNavigateUp(): Boolean {
//        finish()
//        return super.onSupportNavigateUp()
//    }

}