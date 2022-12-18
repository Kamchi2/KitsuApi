package com.example.kitsuapi.models.anime

import com.example.kitsuapi.models.Links
import com.google.gson.annotations.SerializedName

data class AnimeResponse (
    @SerializedName("data")
    val data: List<AnimeModel>,
    @SerializedName("links")
    val links: Links
)
