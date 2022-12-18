package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class Attributes (
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("posterImage")
    val posterImage: PosterImage
)