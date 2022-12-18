package com.example.kitsuapi.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kitsuapi.base.BaseDiffUtilItemCallback
import com.example.kitsuapi.databinding.ItemAnimeBinding
import com.example.kitsuapi.databinding.ItemMangaBinding
import com.example.kitsuapi.models.anime.AnimeModel
import com.example.kitsuapi.models.manga.MangaModel
import com.example.kitsuapi.ui.adapters.manga.MangaListAdapter
import com.example.kitsuapi.ui.fragments.anime.AnimeListFragment


class AnimeListAdapter :
    ListAdapter<AnimeModel, AnimeListAdapter.AnimeListViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AnimeListViewHolder(
        ItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: AnimeListViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    fun itemClick() {

    }

    inner class AnimeListViewHolder(private val binding: ItemAnimeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: AnimeModel) {
            binding.animeIconIv.load(model.attributes.posterImage.original)
            binding.animeTitleTv.text = model.attributes.canonicalTitle
            binding.animeIconIv.setOnClickListener {
                itemClick()
            }
        }
    }
}