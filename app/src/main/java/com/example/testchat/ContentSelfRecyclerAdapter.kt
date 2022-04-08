package com.example.testchat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentSelfRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<ContentSelfRecyclerAdapter.ContentSelfViewHolder>() {

    class ContentSelfViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentItemSelf: LinearLayout = itemView.findViewById(R.id.content_item_self)
        //val contentIcon: ImageView = itemView.findViewById(R.id.content_icon)
        val contentShapeSelf: LinearLayout = itemView.findViewById(R.id.content_shape_self)
        val contentTextSelf: TextView = itemView.findViewById(R.id.content_text_self)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentSelfViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.content_recyclerview_item_self, parent, false)
        return ContentSelfViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContentSelfViewHolder, position: Int) {
        //holder.chatIcon.setImageResource(R.drawable.a)
        //holder.largeTextView.text = names[position]
        //holder.smallTextView.text = "кот"

        /*holder.itemView.setOnClickListener { view ->
            val intent = Intent(view.context, ContentActivity::class.java)
            view.context.startActivity(intent)
        }*/
        //holder.contentIcon.setImageResource(R.drawable.b)
        holder.contentTextSelf.text = "адфлыоврадлофрывдлоардфлоыврдалофрыдвлоардфлоыврдларфдылвоардлофыврдл"
    }

    override fun getItemCount() = names.size
}