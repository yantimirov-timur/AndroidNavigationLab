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
        val intentAbout = Intent(this, ActivityAbout::class.java)
        startActivity(intentAbout)
        return super.onOptionsItemSelected(item)
    }

}