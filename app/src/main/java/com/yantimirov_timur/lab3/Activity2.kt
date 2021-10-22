package com.yantimirov_timur.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button


class Activity2 : OptionsMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intentThirdActivity = Intent(this, Activity3::class.java)

        findViewById<Button>(R.id.buttonToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonToThird).setOnClickListener {
            startActivityForResult(intentThirdActivity, RESULT_OK)
        }
    }

    //Fix to registerLaunch
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                finish()
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}