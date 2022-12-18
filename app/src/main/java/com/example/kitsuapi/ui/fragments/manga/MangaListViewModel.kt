package com.example.kitsuapi.ui.fragments.manga

import com.example.kitsuapi.base.BaseViewModel
import com.example.kitsuapi.data.repositorys.manga.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaListViewModel @Inject constructor(private val repository: MangaRepository) :
BaseViewModel() {

    fun fetchManga(limit: Int, offset: Int) = repository.fetchManga(limit, offset)

}
