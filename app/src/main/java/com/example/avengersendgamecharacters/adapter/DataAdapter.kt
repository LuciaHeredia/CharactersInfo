package com.example.avengersendgamecharacters.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.data.CharacterData

class DataAdapter(
    private val context: Context,
    private val dataset: List<CharacterData>
    ): RecyclerView.Adapter<DataAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageview)
        val nameTextView: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.material_card_view_design, parent, false)
        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.image)
        holder.nameTextView.text = context.resources.getString(item.name)
        //holder.itemView.setOnClickListener()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}