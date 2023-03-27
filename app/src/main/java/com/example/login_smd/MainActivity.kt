package com.example.login_smd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val getStarted = findViewById<Button>(R.id.button4);
        val login = findViewById<Button>(R.id.button3);
//        val getStarted = findViewById<Button>(R.id.button3);

        val intent = Intent(this, activity_login::class.java)
//        val signupIntent = Intent(this, activity::class.java)
        getStarted.setOnClickListener {
            startActivity(intent)
        }

//        login.setOnClickListener{
//            startActivity(signupIntent)
//        }

    }
}