package com.example.matkul_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul(
    @StringRes val matkulNameRes: Int,
    @StringRes val sksRes: Int,
    @DrawableRes val imageRes: Int
)