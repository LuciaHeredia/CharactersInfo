package com.example.avengersendgamecharacters.data

import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.model.Character

class DataSource {
    fun loadCharacters(): List<Character> {
        return listOf(
            Character(R.drawable.tony_1, R.string.char1, R.string.char1role),
            Character(R.drawable.captain_america_2, R.string.char2, R.string.char2role ),
            Character(R.drawable.thor_3, R.string.char3, R.string.char3role ),

            Character(R.drawable.captain_america_2, R.string.char2, R.string.char2role ),
            Character(R.drawable.captain_america_2, R.string.char2, R.string.char2role ),
            Character(R.drawable.captain_america_2, R.string.char2, R.string.char2role ),
            Character(R.drawable.captain_america_2, R.string.char2, R.string.char2role )

        )
    }
}