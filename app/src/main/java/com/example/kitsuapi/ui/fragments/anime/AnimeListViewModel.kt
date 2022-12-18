package com.example.kitsuapi.ui.fragments.anime

import com.example.kitsuapi.base.BaseViewModel
import com.example.kitsuapi.data.repositorys.anime.AnimeRepository
import com.example.kitsuapi.data.repositorys.manga.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeListViewModel @Inject constructor(private val repository: AnimeRepository) :
BaseViewModel() {

    fun fetchAnime(limit: Int, offset: Int) = repository.fetchAnime(limit, offset)

}
