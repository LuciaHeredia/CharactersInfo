package com.example.avengersendgamecharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.databinding.FragmentDetailsBinding
import com.google.gson.Gson

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View {

        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        val displayCharacter = args.character // get data from HomeFragment
      //  val characterDetails = Gson().fromJson(displayCharacter, Character::class.java) // convert json to Character model

        binding.charRoleDetails.text = displayCharacter // NOT WORKING

        binding.buttonBack.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_detailsFragment_to_homeFragment)
        }

        return view
    }

    
}