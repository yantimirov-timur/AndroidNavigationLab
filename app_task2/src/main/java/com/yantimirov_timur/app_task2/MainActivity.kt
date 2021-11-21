package com.yantimirov_timur.app_task2


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yantimirov_timur.lab3.R


open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val intent1 = Intent(this, Activity2::class.java)
        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            startActivity(intent1)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentAbout = Intent(this, ActivityAbout::class.java)
        startActivity(intentAbout)
        return super.onOptionsItemSelected(item)
    }
}