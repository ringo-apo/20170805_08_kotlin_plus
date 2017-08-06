package com.example.apo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {

    var textView: TextView? = null
    var editText: EditText? = null
    var editText2: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button) as Button
        button.setOnClickListener(this)

        textView = findViewById(R.id.textView) as TextView
        textView?.setText("0")

        editText = findViewById(R.id.editText) as EditText
        editText2 = findViewById(R.id.editText2) as EditText

    }

    override fun onClick(v: View?) {
        var a: Int = 0
        var b: Int = 0
        var c: Int = 0
        a = editText?.getText().toString().toInt()
        b = editText2?.getText().toString().toInt()
        c = a + b

        textView?.setText(c.toString())
    }
}




