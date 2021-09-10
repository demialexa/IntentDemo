package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapButton: Button = findViewById(R.id.map_button)
        mapButton.setOnClickListener { openMap() }

    }

    private fun openMap() {
        val mapIntentUri = Uri.parse(getString(R.string.map_uri))
        val mapIntent = Intent(Intent.ACTION_VIEW, mapIntentUri)
        mapIntent.setPackage(getString(R.string.map_package))
        startActivity(mapIntent)
    }
}