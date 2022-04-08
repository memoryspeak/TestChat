package com.example.testchat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.reflect.typeOf

class ChatRecyclerAdapter(private val users: List<User>) :
    RecyclerView.Adapter<ChatRecyclerAdapter.ChatViewHolder>() {

    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chatItem: LinearLayout = itemView.findViewById(R.id.chat_item)
        val chatIcon: ImageView = itemView.findViewById(R.id.chat_icon)
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_recyclerview_item, parent, false)
        return ChatViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val user = users[position]
        val icon = user.icon
        val name = user.name
        val theme = user.theme
        //val messages = user.messages.toTypedArray()

        holder.chatIcon.setImageResource(icon)
        holder.largeTextView.text = name
        holder.smallTextView.text = theme

        holder.chatItem.setOnClickListener { view ->
            val intent = Intent(view.context, ContentActivity::class.java)
            intent.putExtra("icon", icon);
            intent.putExtra("name", name);
            view.context.startActivity(intent)
        }
    }

    override fun getItemCount() = users.size
}