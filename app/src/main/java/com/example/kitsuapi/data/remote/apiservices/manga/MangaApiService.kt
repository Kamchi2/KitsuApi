package com.example.kitsuapi.data.remote.apiservices.manga

import com.example.kitsuapi.models.manga.MangaResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int
    ): Response<MangaResponse>
}
