package com.example.talkbackbugexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val launchButton: Button = this.findViewById<Button>(R.id.launch_dialogue_button).apply {
            this.setOnClickListener {
                SimpleDialogFragment.newInstance().show(manager, null)
            }
        }
    }
}