package com.cynthia.postapp2

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (var posts: List<Post>):
    RecyclerView.Adapter<PostAppViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAppViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.posts,parent,false)
        return PostAppViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: PostAppViewHolder, position: Int) {
        val post=posts[position]
        holder.body.text=post.body
        holder.title.text=post.title
        holder.id.text="ID:${post.Id}"
        holder.userId.text="UserId:${post.userId}"
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}

class PostAppViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var body=itemView.findViewById<TextView>(R.id.tvBody)
    var title=itemView.findViewById<TextView>(R.id.tvtitle)
    var id=itemView.findViewById<TextView>(R.id.tvId)
    var userId=itemView.findViewById<TextView>(R.id.tvUserId)

}