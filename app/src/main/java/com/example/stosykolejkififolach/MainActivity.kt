package com.example.stosykolejkififolach

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Stack part

        var stackElementsOutput = findViewById<TextView>(R.id.stackValText)
        var stackOutput = findViewById<TextView>(R.id.outputTextStack)
        var inputStack = findViewById<TextInputEditText>(R.id.inputStack)

        var stack = ArrayDeque<Int>()

        findViewById<Button>(R.id.addButtonStack).setOnClickListener {
            if(inputStack.text?.isNotEmpty() == true) {
                stack.push(inputStack.text.toString().toInt())
                stackElementsOutput.text = stack.toString()
            }
        }

        findViewById<Button>(R.id.popButtonStack).setOnClickListener {
            if(!stack.isEmpty()) {
                stack.pop()
                stackElementsOutput.text = stack.toString()
            }
        }

        findViewById<Button>(R.id.topButtonStack).setOnClickListener {
            if(!stack.isEmpty()) {
                stackOutput.text = stack.peek().toString()
            }
        }

        findViewById<Button>(R.id.sizeButtonStack).setOnClickListener {
            stackOutput.text = stack.size.toString()
        }

        findViewById<Button>(R.id.emptyButtonStack).setOnClickListener {
            if(stack.isEmpty()) {
                stackOutput.text = "Yes"
            }
            else if(!stack.isEmpty()) {
                stackOutput.text = "No"
            }
        }

        //Queue part

        var queueElementsOutput = findViewById<TextView>(R.id.queueValText)
        var queueOutput = findViewById<TextView>(R.id.outputTextQueue)
        var queueStack = findViewById<TextInputEditText>(R.id.inputQueue)

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