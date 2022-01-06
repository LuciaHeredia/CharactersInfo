package com.example.avengersendgamecharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.avengersendgamecharacters.adapter.DataAdapter
import com.example.avengersendgamecharacters.data.DataSource
import com.example.avengersendgamecharacters.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val myDataset = DataSource().loadCharacters()
        binding.recyclerview.layoutManager = LinearLayoutManager(activity) // vertical layout Manager
        val adapter = DataAdapter(this.requireContext(), myDataset)
        binding.recyclerview.adapter = adapter // Setting Adapter with recyclerview
        adapter.setOnItemClickListener(object : DataAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(myDataset[position].toString())
                Navigation.findNavController(binding.root).navigate(action)
            }
        })

        return binding.root
    }

}