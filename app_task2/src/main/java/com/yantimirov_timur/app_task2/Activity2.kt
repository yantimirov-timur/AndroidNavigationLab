package com.yantimirov_timur.app_task2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.yantimirov_timur.lab3.R


class Activity2 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intentThirdActivity = Intent(this, Activity3::class.java)

        findViewById<Button>(R.id.buttonToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonToThird).setOnClickListener {
            launcherActivity.launch(intentThirdActivity)
        }
    }

    private val launcherActivity =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                finish()
            }
        }
}