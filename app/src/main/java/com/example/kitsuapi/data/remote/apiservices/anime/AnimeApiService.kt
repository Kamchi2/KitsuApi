package com.example.kitsuapi.data.remote.apiservices.anime

import com.example.kitsuapi.models.anime.AnimeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(
        @Query("page[limit]") limit: Int = 24,
        @Query("page[offset]") offset: Int = 0
    ): Response<AnimeResponse>
}
