package com.example.avengersendgamecharacters.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.model.Character

class DataAdapter(
    private val context: Context,
    private val dataset: List<Character>
    ): RecyclerView.Adapter<DataAdapter.ItemViewHolder>() {

    private lateinit var mListener : OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        mListener = listener
    }

    class ItemViewHolder(view: View, listener: OnItemClickListener): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageview_card)
        val nameTextView: TextView = view.findViewById(R.id.char_name_card)

        init{
            itemView.setOnClickListener{
                listener.onItemClick(absoluteAdapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.material_card_view_design, parent, false)
        return ItemViewHolder(adapterLayout,mListener)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.image)
        holder.nameTextView.text = context.resources.getString(item.name)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}