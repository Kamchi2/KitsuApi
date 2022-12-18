package com.example.kitsuapi.models.anime

import com.example.kitsuapi.base.IBaseDiffModel
import com.example.kitsuapi.models.Attributes
import com.google.gson.annotations.SerializedName

data class AnimeModel (
    @SerializedName("id")
    override val id: Int,
    @SerializedName("attributes")
    val attributes: Attributes
): IBaseDiffModel<Int>
