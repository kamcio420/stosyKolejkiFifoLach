package com.example.stosykolejkififolach

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Stack part

        val stackElementsOutput = findViewById<TextView>(R.id.stackValText)
        val stackOutput = findViewById<TextView>(R.id.outputTextStack)
        val inputStack = findViewById<TextInputEditText>(R.id.inputStack)

        val stack = ArrayDeque<Int>()

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
                stackOutput.text = stack.peek()?.toString()
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

        val queueElementsOutput = findViewById<TextView>(R.id.queueValText)
        val queueOutput = findViewById<TextView>(R.id.outputTextQueue)
        val inputQueue = findViewById<TextInputEditText>(R.id.inputQueue)

        val queue: Queue<Int> = LinkedList()

        findViewById<Button>(R.id.addButtonQueue).setOnClickListener {
            if(inputQueue.text?.isNotEmpty() == true) {
                queue.add(inputQueue.text.toString().toInt())
                queueElementsOutput.text = queue.toString()
            }
        }

        findViewById<Button>(R.id.popButtonQueue).setOnClickListener {
            if(!queue.isEmpty()) {
                queue.remove()
                queueElementsOutput.text = queue.toString()
            }
        }

        findViewById<Button>(R.id.topButtonQueue).setOnClickListener {
            if(!queue.isEmpty()) {
                queueOutput.text = queue.last().toString()
            }
        }

        findViewById<Button>(R.id.sizeButtonQueue).setOnClickListener {
            queueOutput.text = queue.size.toString()
        }

        findViewById<Button>(R.id.emptyButtonQueue).setOnClickListener {
            if(queue.isEmpty()) {
                queueOutput.text = "Yes"
            }
            else if(!stack.isEmpty()) {
                queueOutput.text = "No"
            }
        }
    }
}