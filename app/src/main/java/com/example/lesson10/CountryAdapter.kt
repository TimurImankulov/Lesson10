package com.example.lesson10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item_horizontal.view.*
import kotlinx.android.synthetic.main.rv_item_vertical.view.*
import kotlinx.android.synthetic.main.rv_item_vertical.view.ivImage

class CountryAdapter (private val array: ArrayList<CountryExampleModel>): RecyclerView.Adapter<CountryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_horizontal, parent, false)
        val holder = CountryViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}

class CountryViewHolder(view: View) :RecyclerView.ViewHolder(view) {
    fun bind(item: CountryExampleModel){
        itemView.tvText.text = item.title
        itemView.ivImage.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.image))
    }
}
