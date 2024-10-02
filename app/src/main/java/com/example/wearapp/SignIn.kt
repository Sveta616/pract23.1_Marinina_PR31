package com.example.wearapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity




class SignIn : ComponentActivity() {

    private lateinit var login: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
    }

    fun next(view: View) {
        if (login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            val intent = Intent(this, WorldSkills::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Заполните логин или пароль", Toast.LENGTH_SHORT).show()
        }
    }
}