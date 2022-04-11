package com.example.testchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppSingleton.icon = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewChat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChatRecyclerAdapter(AppSingleton.users)
    }
}