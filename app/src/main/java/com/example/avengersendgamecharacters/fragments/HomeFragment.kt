package com.example.avengersendgamecharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.adapter.DataAdapter
import com.example.avengersendgamecharacters.data.DataSource
import com.example.avengersendgamecharacters.databinding.FragmentHomeBinding
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.android.material.card.MaterialCardView

class HomeFragment : Fragment(){
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        val myDataset = DataSource().loadCharacters()
        binding.recyclerview.layoutManager = LinearLayoutManager(activity) // vertical layout Manager
        val adapter = DataAdapter(this.requireContext(), myDataset)
        binding.recyclerview.adapter = adapter // Setting Adapter with recyclerview
        adapter.setOnItemClickListener(object : DataAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {

                // convert Character model to jsonString
                val mapper = jacksonObjectMapper()
                val jsonString = mapper.writeValueAsString(myDataset[position])

                // MaterialDesign Transition + SafeArgs + Navigation
                val cardView = view.findViewById<MaterialCardView>(R.id.details_view)
                val transitionName = getString(R.string.character_card_transition)
                val extras = FragmentNavigatorExtras(cardView to transitionName)
                val directions = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(jsonString)
                findNavController().navigate(directions,extras)

            }
        })

        return view
    }

}