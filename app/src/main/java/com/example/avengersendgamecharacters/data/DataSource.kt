package com.example.avengersendgamecharacters.data

import com.example.avengersendgamecharacters.R

class DataSource {
    fun loadCharacters(): List<CharacterData> {
        return listOf(
            CharacterData(R.drawable.tony, R.string.char1, R.string.char1role),
            CharacterData(R.drawable.tony, R.string.char2, R.string.char2role ))
    }
}