package com.yantimirov_timur.app_task2

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.yantimirov_timur.lab3.R

abstract class OptionsMenu : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentActivity1 = Intent(this, Activity1::class.java)
        val intentActivity2 = Intent(this, Activity2::class.java)
        val intentActivity3 = Intent(this, Activity3::class.java)

        when (item.itemId) {
            R.id.activity1 -> {
                finish()
                startActivity(intentActivity1)
            }
            R.id.activity2 -> {
                finish()
                startActivity(intentActivity2)

            }
            R.id.activity3 -> {
                finish()
                startActivity(intentActivity3)

            }
        }
        return super.onOptionsItemSelected(item)
    }
}