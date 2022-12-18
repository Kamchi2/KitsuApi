package com.example.kitsuapi.data.repositorys.anime

import com.example.kitsuapi.base.BaseRepository
import com.example.kitsuapi.data.remote.apiservices.anime.AnimeApiService
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val service: AnimeApiService) : BaseRepository() {

    fun fetchAnime(limit: Int, offset: Int) = doRequest {
        service.fetchAnime(limit, offset)
    }
}