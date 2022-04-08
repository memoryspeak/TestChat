package com.example.testchat

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppSingleton.icon = 0
        //AppSingleton.activityMainIntent = Intent(this,MainActivity::class.java)
        //AppSingleton.activityContentIntent = Intent(this, ContentActivity::class.java)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewChat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChatRecyclerAdapter(AppSingleton.users)
    }


    /*private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }*/


    /*private fun showUsers() {
        scrollChatLayout.removeAllViews()

        AppSingleton.users.forEach { it ->
            val userButton: Button = Button(this)
            userButton.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
            val userIcon: Drawable? = ContextCompat.getDrawable(this, it.icon)
            userIcon?.setBounds(0, 0, 5, 5)
            //userButton.setCompoundDrawables(userIcon, null, null, null)
            //val userIcon: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_baseline_menu_24)
            userButton.setCompoundDrawablesWithIntrinsicBounds(userIcon, null, null, null)

            userButton.text = "    " +
                    it.name +
                    "\n" +
                    "    " +
                    it.theme

            userButton.gravity = Gravity.CENTER_VERTICAL or Gravity.LEFT
            userButton.setPadding(paddingButton, paddingButton, paddingButton, paddingButton)
            userButton.setBackgroundColor(Color.parseColor("#FFFFFF"))

            scrollChatLayout.addView(userButton)

            userButton.setOnClickListener {
                val intent = Intent(this@MainActivity, ContentActivity::class.java)
                startActivity(intent)
            }
        }
    }*/

}