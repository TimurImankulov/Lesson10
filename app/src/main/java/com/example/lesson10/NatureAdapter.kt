package com.example.lesson10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item_vertical.view.*

class NatureAdapter (private val array: ArrayList<NatureExampleModel>): RecyclerView.Adapter<NatureViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NatureViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_vertical, parent, false)
        val holder = NatureViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: NatureViewHolder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}

class NatureViewHolder(view: View) :RecyclerView.ViewHolder(view) {
    fun bind(item : NatureExampleModel){
        itemView.tvText1.text = item.category
        itemView.tvText2.text = item.title
        itemView.tvText3.text = item.description
        itemView.ivImage.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.image))
    }
}
