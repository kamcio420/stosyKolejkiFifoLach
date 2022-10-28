package com.example.stosykolejkififolach

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Stack part

        val stackElementsOutput = findViewById<TextView>(R.id.stackValText).text
        val stackOutput = findViewById<TextView>(R.id.outputTextStack).text

        val inputStack = findViewById<TextInputEditText>(R.id.inputStack).text

        findViewById<Button>(R.id.addButtonStack).setOnClickListener {

        }

        findViewById<Button>(R.id.popButtonStack).setOnClickListener {

        }

        findViewById<Button>(R.id.topButtonStack).setOnClickListener {

        }

        findViewById<Button>(R.id.sizeButtonStack).setOnClickListener {

        }

        findViewById<Button>(R.id.emptyButtonStack).setOnClickListener {

        }

        //Queue part

        val queueElementsOutput = findViewById<TextView>(R.id.queueValText).text
        val queueOutput = findViewById<TextView>(R.id.outputTextQueue).text

        val queueStack = findViewById<TextInputEditText>(R.id.inputQueue).text

        findViewById<Button>(R.id.addButtonQueue).setOnClickListener {

        }

        findViewById<Button>(R.id.popButtonQueue).setOnClickListener {

        }

        findViewById<Button>(R.id.topButtonQueue).setOnClickListener {

        }

        findViewById<Button>(R.id.sizeButtonQueue).setOnClickListener {

        }

        findViewById<Button>(R.id.emptyButtonQueue).setOnClickListener {

        }
    }
}