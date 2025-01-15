package com.example.birthdaygreat

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var nameInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the layout first

        enableEdgeToEdge()

        nameInput = findViewById(R.id.nameInput) // Initialize after setting the layout

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    /*Intent is used for - when we click on a button it will lead us to
        another page, In intent we pass 2 parameters , current page and where we want to get after
       clicking that button*/

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
        //Toast.makeText(this, "Your Greeting card is being ready", Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}
