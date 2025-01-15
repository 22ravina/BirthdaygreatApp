package com.example.birthdaygreat

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_birthday_greeting) // Call this first

    enableEdgeToEdge()

    val birthdayGreeting: TextView = findViewById(R.id.birthdayGreeting)

    val name = intent.getStringExtra(NAME_EXTRA)
    birthdayGreeting.text = "Happy Birthday\n $name!"
}

}
