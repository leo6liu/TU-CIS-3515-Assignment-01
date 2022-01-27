package edu.temple.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // change textview text when button is clicked
        val textView = findViewById<TextView>(R.id.textview)
        findViewById<Button>(R.id.button).setOnClickListener {
            textView.text = "You clicked the button"
        }
    }
}