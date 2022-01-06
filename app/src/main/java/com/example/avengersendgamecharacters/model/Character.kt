package com.example.avengersendgamecharacters.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Character(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val role: Int
) {
    override fun toString(): String {
        return "Character [image: ${this.image}, name: ${this.name}, role: ${this.role}]"
    }
}

