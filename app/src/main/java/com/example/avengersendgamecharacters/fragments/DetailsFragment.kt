package com.example.avengersendgamecharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.avengersendgamecharacters.databinding.FragmentDetailsBinding
import com.example.avengersendgamecharacters.model.Character
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.android.material.transition.MaterialContainerTransform

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

        sharedElementEnterTransition = MaterialContainerTransform()

        val displayCharacter = args.character // get data from HomeFragment

        // convert jsonString to Character model
        val mapper = jacksonObjectMapper()
        val characterDetails: Character = mapper.readValue(displayCharacter, Character::class.java)

        // insert in fragment objects
        binding.imageviewDetails.setImageResource(characterDetails.bigger_image)
        binding.charNameDetails.text = context?.resources!!.getString(characterDetails.name)
        binding.charRoleDetails.text = context?.resources!!.getString(characterDetails.role)

        return view
    }

    
}