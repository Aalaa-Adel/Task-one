package com.aalaa.firsttask1
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aalaa.firsttask1.databinding.ItemBinding
import com.aalaa.firsttask1.Pets as Pets

class Adapter(private val petsList: ArrayList<Pets>)
    :RecyclerView.Adapter<Adapter.MyViewHolder> (){
    class MyViewHolder(val itemBinding : ItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemBinding.apply {
            imagePet.setImageResource(petsList[position].image)
            textView.text=petsList[position].textview
        }
    }

    override fun getItemCount(): Int {
        return petsList.size
    }
}