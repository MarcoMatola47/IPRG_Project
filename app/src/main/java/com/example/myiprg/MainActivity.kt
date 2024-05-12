package com.example.myiprg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resulttextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        calculateButton = findViewById(R.id.calculateButton)
        resulttextView = findViewById(R.id.resulttextView)


        calculateButton.setOnClickListener {
            val duration = editText.text.toString().toIntOrNull()


            if (duration != null && duration > 0) {
                val hours = duration / 60
                val minutes = duration - (hours * 60)
                val cost = 400 * hours + minutes

                resulttextView.text = "Hours: $hours, Minutes: $minutes, Total Cost: R$cost"
            } else {
                resulttextView.text = "Please enter a valid rental duration."
            }

        }
    }

}