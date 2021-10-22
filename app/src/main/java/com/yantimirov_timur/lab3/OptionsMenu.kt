package com.yantimirov_timur.lab3

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class OptionsMenu : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentActivity1 = Intent(this, Activity1::class.java)
        val intentActivity2 = Intent(this, Activity2::class.java)
        val intentActivity3 = Intent(this, Activity3::class.java)

        var a = intent == intentActivity1
        a

        when (item.itemId) {
            R.id.activity1 -> {
                startActivity(intentActivity1)
                finish()
            }
            R.id.activity2 -> {
                startActivity(intentActivity2)
                finish()
            }
            R.id.activity3 -> {
                startActivity(intentActivity3)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}