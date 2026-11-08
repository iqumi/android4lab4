package com.example.topics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val titleResId: Int,
    val numberOfVideos: Int,
    @DrawableRes val imageResId: Int
)
