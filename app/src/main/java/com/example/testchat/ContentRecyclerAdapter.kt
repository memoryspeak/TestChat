package com.example.testchat


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<ContentRecyclerAdapter.ContentViewHolder>() {

    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentIcon: ImageView? = itemView.findViewById(R.id.content_icon)
        val contentText: TextView? = itemView.findViewById(R.id.content_text)
        val contentTextSelf: TextView? = itemView.findViewById(R.id.content_text_self)
    }

    override fun getItemViewType(position: Int): Int {
        return if (position%3 == 0 || position%5 == 0) {
            0
        } else {
            1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemView = if (viewType == 0) {
            LayoutInflater.from(parent.context).inflate(R.layout.content_recyclerview_item, parent, false)
        } else {
            LayoutInflater.from(parent.context).inflate(R.layout.content_recyclerview_item_self, parent, false)
        }
        return ContentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        when (getItemViewType(position)) {
            0 -> {
                AppSingleton.icon?.let { holder.contentIcon?.setImageResource(it) }
                ///holder.contentIcon?.setImageResource(R.drawable.b)
                holder.contentText?.text = "123456789lkasdjlfkajsldkjfaslkdfjlaksjdlfjasldkfjlaksdjlfkjasldkfjlaskdjflkajsdlkfjlaskdjflkajsdlfkjalsddkjfahsdlfhalksjdhflkjashdlkfjhalksjdhflkajshdlkfjhalksjdhflkajhsdlkfjksdjhflkajsdhlfkjahslkdjfhlkajsdhlfkjahsldkjfh"
            }
            1 -> {
                holder.contentTextSelf?.text = "адфлыоврадлофрывдлоардфлоыврдалофрыдвлоардфлоыврдларфдылвоардлофыврдл"
            }
        }
    }

    override fun getItemCount() = names.size

}
