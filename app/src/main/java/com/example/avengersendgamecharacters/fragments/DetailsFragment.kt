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
import com.example.avengersendgamecharacters.model.Character
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper


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

        // convert json to Character model
        val mapper = jacksonObjectMapper()
        val characterDetails: Character = mapper.readValue(displayCharacter, Character::class.java)

        // insert in fragment objects
        binding.imageviewDetails.setImageResource(characterDetails.bigger_image)
        binding.charNameDetails.text = context?.resources!!.getString(characterDetails.name)
        binding.charRoleDetails.text = context?.resources!!.getString(characterDetails.role)

        binding.buttonBack.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_detailsFragment_to_homeFragment)
        }

        return view
    }

    
}