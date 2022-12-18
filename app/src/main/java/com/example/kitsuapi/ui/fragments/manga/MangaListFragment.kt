package com.example.kitsuapi.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.base.BaseFragment
import com.example.kitsuapi.databinding.FragmentMangaListBinding
import com.example.kitsuapi.models.anime.AnimeModel
import com.example.kitsuapi.models.manga.MangaModel
import com.example.kitsuapi.ui.activity.MainActivity
import com.example.kitsuapi.ui.adapters.manga.MangaListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaListFragment : BaseFragment<FragmentMangaListBinding, MangaListViewModel>(R.layout.fragment_manga_list) {

    override val binding by viewBinding(FragmentMangaListBinding::bind)
    override val viewModel: MangaListViewModel by viewModels()
    private val mangaAdapter = MangaListAdapter()
    private var items = listOf<MangaModel>()
    var limit = 18
    var offset = 1

    override fun initialize() {
        setupRecyclerView()
    }

    override fun setupSubscribes() {
        subscribeToManga()
    }

    override fun setupListeners() {
        recyclerViewScrolled()
        animeTabClick()
    }

    private fun setupRecyclerView() {
        binding.mangaRv.adapter = mangaAdapter
    }

    private fun subscribeToManga() {
        viewModel.fetchManga(limit, offset).subscribe (
            onSuccess = {
                if(items==null) {
                    items = it.data
                }
                else {
                    items += it.data
                }
                mangaAdapter.submitList(items)
            },
            onError = {
                Log.e("log", it)
            }
        )
    }

    private fun recyclerViewScrolled() = with(binding) {
        mangaRv .addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    offset += 18
                    subscribeToManga()
                }
            }
        })
    }
    private fun animeTabClick() {
        binding.animeTabBtn.setOnClickListener {
            findNavController().navigate(
                MangaListFragmentDirections.actionMangaFragmentToAnimeFragment()
            )
        }
    }
}
