package com.aalaa.firsttask1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager

import com.aalaa.firsttask1.databinding.FragmentOneBinding

class OneFragment : Fragment(R.layout.fragment_one) {

    lateinit var binding: FragmentOneBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentOneBinding.bind(view)
        val petsList = ArrayList<Pets>()
        petsList.add(Pets(R.drawable.img, "Cat"))
        petsList.add(Pets(R.drawable.img_1, "Dog"))
        petsList.add(Pets(R.drawable.img_2, "Horses"))
        petsList.add(Pets(R.drawable.img_3, "Rabbit"))
        petsList.add(Pets(R.drawable.img_4, "Canary"))
        petsList.add(Pets(R.drawable.img_5, "Parrot"))
        petsList.add(Pets(R.drawable.img_6, "Lizard"))
        petsList.add(Pets(R.drawable.img_7, "Tortoise"))
        petsList.add(Pets(R.drawable.img_8, "Frog"))
        petsList.add(Pets(R.drawable.img_9, "Hamster"))
        petsList.add(Pets(R.drawable.img_10, "Monkey"))

        // recycler manager must be defined
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = Adapter(petsList)
    }


}