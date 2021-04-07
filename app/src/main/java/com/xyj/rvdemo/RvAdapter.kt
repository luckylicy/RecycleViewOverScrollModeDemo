package com.xyj.rvdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * RvAdapter.kt
 * description: TODO
 *
 * @author : Licy
 * @date : 2021/4/6
 * email ：licy3051@qq.com
 */

class RvAdapter(private val data: MutableList<String>) : RecyclerView.Adapter<RvViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        var inflate = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return RvViewHolder(inflate)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {

        holder.content.text = data[position]
    }

}

class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val content: TextView = itemView.findViewById(R.id.tv)

}