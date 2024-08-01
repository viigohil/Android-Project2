package jlin2.examples.localtesting

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ShowTextActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)
        //val text = intent.getStringExtra("EXTRA_INPUT_TEXT")
        val textView = findViewById<TextView>(R.id.showTextView)
        val inputText = intent.getStringExtra("input_text") ?: "No text provided"
        textView.text = inputText



    }
    }

