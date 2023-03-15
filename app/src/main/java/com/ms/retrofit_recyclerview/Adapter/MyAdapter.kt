package com.ms.retrofit_recyclerview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ms.retrofit_recyclerview.DataClass.MyDataItem
import com.ms.retrofit_recyclerview.R
import com.squareup.picasso.Picasso

class MyAdapter(val context: Context, val userList: List<MyDataItem>) : Adapter<MyAdapter.MyViewHolder>() {



    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        var userId : TextView
        var title : TextView
        var img_movie : ImageView

        init {
            userId = itemView.findViewById(R.id.userId)
            title= itemView.findViewById(R.id.title)
            img_movie = itemView.findViewById(R.id.img_movie)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.userId.text = userList[position].userId.toString()
        holder.title.text = userList[position].title
        val url = "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"
        //Picasso.with(this).load(url).into(imageView)
        Picasso.get().load(url).into(holder.img_movie)

    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

