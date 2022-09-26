package com.aalaa.firsttask1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.aalaa.firsttask1.databinding.ItemBinding
import com.aalaa.firsttask1.Pets as Pets

class Adapter(private val petsList: ArrayList<Pets>) :
    RecyclerView.Adapter<Adapter.MyViewHolder>() {

    // define your variables here
    class MyViewHolder(itemBinding: ItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        var imagePet = itemBinding.imagePet
        var text = itemBinding.textView
        var layout = itemBinding.layout

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            imagePet.setImageResource(petsList[position].image)
            text.text = petsList[position].textview
            layout.setOnClickListener {
                it.findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
            }
        }

    }

    override fun getItemCount(): Int {
        Log.d("getItemCount", petsList.size.toString())
        return petsList.size
    }
}