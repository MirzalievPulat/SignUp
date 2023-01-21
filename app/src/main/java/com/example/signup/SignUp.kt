package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val bt_signUp = findViewById<Button>(R.id.bt_signUp)
        val tv_signIn = findViewById<TextView>(R.id.tv_signIn)

        bt_signUp.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        tv_signIn.setOnClickListener {finish()}
    }
}