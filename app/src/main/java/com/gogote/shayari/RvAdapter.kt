package com.gogote.shayari

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gogote.shayari.databinding.RvJtemBinding

class RvAdapter(
    var context: Context,
    var shayariList: List<DataEntity> // Corrected naming convention for list
) : RecyclerView.Adapter<RvAdapter.ViewHolder>() { // Fixing Adapter declaration

    // ViewHolder class definition
    class ViewHolder(val binding: RvJtemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RvJtemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shayariList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView2.text = shayariList[position].shayari
    }
}