package com.yantimirov_timur.app_task2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.yantimirov_timur.lab3.R


class Activity2 : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intentThirdActivity = Intent(this, Activity3::class.java)
         //supportActionBar?.setDisplayHomeAsUpEnabled(true)
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToThird).setOnClickListener {
            launcherActivity.launch(intentThirdActivity)
        }
    }

    private val launcherActivity =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                finish()
            }
        }

//    override fun onSupportNavigateUp(): Boolean {
//        finish()
//        return super.onSupportNavigateUp()
//    }

}