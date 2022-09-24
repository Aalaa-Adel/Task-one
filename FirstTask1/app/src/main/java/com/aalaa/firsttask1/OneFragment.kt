package com.aalaa.firsttask1

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aalaa.firsttask1.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOneBinding.inflate(layoutInflater)
        return binding.root
      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        FragmentOneBinding.bind(view)
        val petsList= ArrayList<Pets>()
            petsList.add(Pets( R.drawable.img,"Cat"))
            petsList.add(Pets(  R.drawable.img_1,"Dog"))
            petsList.add(Pets(  R.drawable.img_2,"Horses"))
            petsList.add(Pets( R.drawable.img_3,"Rabbit"))
            petsList.add( Pets( R.drawable.img_4,"Canary"))
            petsList.add(Pets( R.drawable.img_5,"Parrot"))
            petsList.add(Pets( R.drawable.img_6,"Lizard"))
            petsList.add(Pets( R.drawable.img_7,"Tortoise"))
            petsList.add(Pets( R.drawable.img_8,"Frog"))
            petsList.add( Pets( R.drawable.img_9,"Hamster"))
            petsList.add(Pets( R.drawable.img_10,"Monkey"))

        var recyclerView  :RecyclerView=binding.recycler
        recyclerView .adapter=Adapter(petsList)
    }



}