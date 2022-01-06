package com.example.avengersendgamecharacters.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Character(
    @DrawableRes val image: Int,
    @DrawableRes val bigger_image: Int,
    @StringRes val name: Int,
    @StringRes val role: Int
)

