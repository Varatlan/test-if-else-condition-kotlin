package com.example.test6

import android.graphics.Color
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var huhu :Button
    lateinit var editTexNim :EditText
    lateinit var editTexNam :EditText
    lateinit var editTexJur :EditText
    lateinit var texError :TextView
    lateinit var texNim :TextView
    lateinit var texNam :TextView
    lateinit var texJur :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        huhu = findViewById(R.id.huhu)
        editTexNim = findViewById(R.id.editTexNim)
        editTexNam = findViewById(R.id.editTexNam)
        editTexJur = findViewById(R.id.editTexJur)
        texError = findViewById(R.id.texError)
        texNim = findViewById(R.id.texNim)
        texNam = findViewById(R.id.texNam)
        texJur = findViewById(R.id.texJur)

        huhu.setOnClickListener {
                val edit1 = editTexNim.text.toString()
                val edit2 = editTexNam.text.toString()
                val edit3 = editTexJur.text.toString()

                if (TextUtils.isEmpty(edit1) ||
                    TextUtils.isEmpty(edit2) ||
                    TextUtils.isEmpty(edit3) ) {
                    texError.text = "***Please fill the empty fields***"
                    texError.setTextColor(Color.RED)
                } else {
                    texNim.text = editTexNim.text
                    texNam.text = editTexNam.text
                    texJur.text = editTexJur.text
                    texError.text = " :D "
                }
        }
    }
}