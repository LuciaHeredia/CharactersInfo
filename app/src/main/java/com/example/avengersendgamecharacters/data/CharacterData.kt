package com.example.avengersendgamecharacters.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class CharacterData(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val role: Int
)

