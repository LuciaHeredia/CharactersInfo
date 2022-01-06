package com.example.avengersendgamecharacters.data

import com.example.avengersendgamecharacters.R
import com.example.avengersendgamecharacters.model.Character

class DataSource {
    fun loadCharacters(): List<Character> {
        return listOf(
            Character(R.drawable.tony_1, R.drawable.tony_11, R.string.char1, R.string.char1role),
            Character(R.drawable.captain_america_2, R.drawable.captain_america_22, R.string.char2, R.string.char2role ),
            Character(R.drawable.thor_3, R.drawable.thor_33, R.string.char3, R.string.char3role ),
            Character(R.drawable.black_widow_4, R.drawable.black_widow_44, R.string.char4, R.string.char4role ),
            Character(R.drawable.antman_5, R.drawable.antman_55, R.string.char5, R.string.char5role ),
            Character(R.drawable.captain_marvel_6, R.drawable.captain_marvel_66, R.string.char6, R.string.char6role ),
            Character(R.drawable.hulk_7, R.drawable.hulk_77, R.string.char7, R.string.char7role ),


            Character(R.drawable.captain_america_2, R.drawable.tony_1, R.string.char2, R.string.char2role ),

            Character(R.drawable.captain_america_2, R.drawable.tony_1, R.string.char2, R.string.char2role ),

            Character(R.drawable.captain_america_2, R.drawable.tony_1, R.string.char2, R.string.char2role ),

            Character(R.drawable.captain_america_2, R.drawable.tony_1, R.string.char2, R.string.char2role )

        )
    }
}