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
            Character(R.drawable.hawkeye_8, R.drawable.hawkeye_88, R.string.char8, R.string.char8role ),
            Character(R.drawable.war_machine_9, R.drawable.war_machine_99, R.string.char9, R.string.char9role ),
            Character(R.drawable.nebula_10, R.drawable.nebula_1010, R.string.char10, R.string.char10role ),
            Character(R.drawable.okoye_11, R.drawable.okoye_1111, R.string.char11, R.string.char11role ),
            Character(R.drawable.rocket_12, R.drawable.rocket_1212, R.string.char12, R.string.char12role ),
            Character(R.drawable.wong_13, R.drawable.wong_1313, R.string.char13, R.string.char13role )
        )
    }
}