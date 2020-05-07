package com.example.checklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val checkList: List<CheckBox> = listOf(
            findViewById(R.id.checkBox1),
            findViewById(R.id.checkBox2),
            findViewById(R.id.checkBox3),
            findViewById(R.id.checkBox4),
            findViewById(R.id.checkBox5),
            findViewById(R.id.checkBox6),
            findViewById(R.id.checkBox7),
            findViewById(R.id.checkBox8),
            findViewById(R.id.checkBox9),
            findViewById(R.id.checkBox10),
            findViewById(R.id.checkBox11)
        )
        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener() {
            clearChecks(checkList)
        }

    }

    private fun clearChecks(list: List<CheckBox>) {

        for (x in list) {
            if (x.isChecked) {
                x.isChecked = false
            }
        }
        Toast.makeText(this, R.string.message, Toast.LENGTH_SHORT).show()
    }
}