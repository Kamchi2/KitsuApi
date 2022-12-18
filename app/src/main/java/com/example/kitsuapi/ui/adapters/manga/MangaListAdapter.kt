package com.example.kitsuapi.ui.adapters.manga

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kitsuapi.base.BaseDiffUtilItemCallback
import com.example.kitsuapi.databinding.ItemMangaBinding
import com.example.kitsuapi.models.manga.MangaModel
import com.example.kitsuapi.ui.adapters.anime.AnimeListAdapter
import com.example.kitsuapi.ui.fragments.anime.AnimeListFragment


class MangaListAdapter :
    ListAdapter<MangaModel, MangaListAdapter.FilmsViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = FilmsViewHolder(
        ItemMangaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    inner class FilmsViewHolder(private val binding: ItemMangaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: MangaModel) {
            binding.mangaIconIv.load(model.attributes.posterImage.original)
            binding.mangaTitleTv.text = model.attributes.canonicalTitle
        }
    }
}