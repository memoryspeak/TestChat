package com.example.testchat

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val arguments = intent.extras
        val name = arguments!!["name"].toString()
        AppSingleton.icon = arguments["icon"] as Int?

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        val toolbar = findViewById<Toolbar>(R.id.content_toolbar)
        toolbar.title = name
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        //initRecycler()
        initRecyclerView()
        //initRecyclerViewSelf()
    }

    private fun initRecyclerView() {
        val recyclerViewContent: RecyclerView = findViewById(R.id.recyclerViewContent)
        recyclerViewContent.layoutManager = LinearLayoutManager(this)
        recyclerViewContent.adapter = ContentRecyclerAdapter(fillList())
    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }

    private fun initRecyclerViewSelf() {
        val recyclerViewContent: RecyclerView = findViewById(R.id.recyclerViewContent)
        recyclerViewContent.layoutManager = LinearLayoutManager(this)
        recyclerViewContent.adapter = ContentSelfRecyclerAdapter(fillListSelf())
    }

    private fun fillListSelf(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }
}