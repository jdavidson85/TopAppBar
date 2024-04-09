package com.example.topappbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_option1 -> {
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_option2 -> {
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show()
                true
            }
            android.R.id.home -> {
                // Handle Up button click
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}