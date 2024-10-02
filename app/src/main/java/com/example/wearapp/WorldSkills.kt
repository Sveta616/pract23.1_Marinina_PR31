package com.example.wearapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class WorldSkills : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_skills)
    }
    fun rez(view: View)
    {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()

    }
}