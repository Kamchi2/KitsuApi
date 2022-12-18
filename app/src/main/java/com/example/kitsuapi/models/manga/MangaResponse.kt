package com.example.kitsuapi.models.manga

import com.example.kitsuapi.models.Links
import com.google.gson.annotations.SerializedName

data class MangaResponse (
    @SerializedName("data")
    val data: List<MangaModel>,
    @SerializedName("links")
    val links: Links
)