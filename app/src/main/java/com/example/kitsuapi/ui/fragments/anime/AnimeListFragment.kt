package com.example.kitsuapi.ui.fragments.anime

import android.util.Log
import android.view.View.OnScrollChangeListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.base.BaseFragment
import com.example.kitsuapi.databinding.ActivityMainBinding.bind
import com.example.kitsuapi.databinding.FragmentAnimeListBinding
import com.example.kitsuapi.databinding.FragmentMangaListBinding
import com.example.kitsuapi.models.anime.AnimeModel
import com.example.kitsuapi.models.anime.AnimeResponse
import com.example.kitsuapi.ui.adapters.anime.AnimeListAdapter
import com.example.kitsuapi.ui.adapters.manga.MangaListAdapter
import com.example.kitsuapi.ui.fragments.manga.MangaListFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.subscribe
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AnimeListFragment : BaseFragment<FragmentAnimeListBinding, AnimeListViewModel>(R.layout.fragment_anime_list) {

    override val binding by viewBinding(FragmentAnimeListBinding::bind)
    override val viewModel: AnimeListViewModel by viewModels()
    private val animeAdapter = AnimeListAdapter()
    private var items = listOf<AnimeModel>()

    var limit = 18
    var offset = 1

    override fun initialize() {
        setupRecyclerView()
    }

    override fun setupSubscribes() {
        subscribeToAnime()
    }

    override fun setupListeners() {
        recyclerViewScrolled()
        mangaTabClick()
    }

    private fun setupRecyclerView() {
        binding.animeRv.adapter = animeAdapter
        fun AnimeListAdapter.itemClick() {

        }
    }

    private fun subscribeToAnime() {
        viewModel.fetchAnime(limit, offset).subscribe(
            onSuccess = {
                if(items==null) {
                    items = it.data
                }
                else {
                    items += it.data
                }
                animeAdapter.submitList(items)
            },
            onError = {
                Log.e("log", it)
            }
        )
    }

    private fun recyclerViewScrolled() = with(binding) {
        animeRv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    offset += 18
                    subscribeToAnime()
                }
            }
        })
    }

    private fun mangaTabClick() {
        binding.mangaTabBtn.setOnClickListener {
            findNavController().navigate(
                AnimeListFragmentDirections.actionAnimeFragmentToMangaFragment()
            )
        }
    }
}