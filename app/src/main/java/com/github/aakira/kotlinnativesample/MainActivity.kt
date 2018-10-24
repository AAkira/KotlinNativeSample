package com.github.aakira.kotlinnativesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.github.aakira.kotlinnativesample.common.createApplicationScreenMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = createApplicationScreenMessage()
    }
}
