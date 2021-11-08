package com.yantimirov_timur.app_task3

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class OptionsMenu : AppCompatActivity() {


    /**
     * Options menu on every activity
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentActivityAbout = Intent(this, ActivityAbout::class.java)
        startActivity(intentActivityAbout)
        return super.onOptionsItemSelected(item)
    }
}