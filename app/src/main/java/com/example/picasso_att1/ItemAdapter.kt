package com.example.picasso_att1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ImageAdapter(var versionList: ArrayList<ImageGet>):RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = versionList.size

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
        holder.bindItems(versionList[position])
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(img : ImageGet){
            val imageView = itemView.findViewById<ImageView>(R.id.imageview)
            Picasso.get().load(img.imageURL).into(imageView)
        }
    }
}

