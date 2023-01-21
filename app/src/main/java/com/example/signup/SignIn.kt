package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var bt_signIn = findViewById<Button>(R.id.bt_signIn)
        var bt_signUp = findViewById<TextView>(R.id.tv_signUp)

        bt_signIn.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        bt_signUp.setOnClickListener {
            var intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}