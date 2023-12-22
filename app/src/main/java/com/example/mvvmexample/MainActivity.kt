package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.ViewModel.NumberViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: NumberViewModel
    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        viewModel = ViewModelProvider(this)[NumberViewModel::class.java]

        viewModel.currentNumber.observe(this, Observer {
            textView.text = it.toString()
        })

        button.setOnClickListener{
            viewModel.incrementText()
        }
    }
}