package com.example.kitsuapi.data.remote

import com.example.kitsuapi.data.remote.apiservices.anime.AnimeApiService
import com.example.kitsuapi.data.remote.apiservices.manga.MangaApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://kitsu.io/api/edge/")
        .client(provideOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private fun provideOkHttpClient() = OkHttpClient().newBuilder()
        .addInterceptor(provideLoggingInterceptor())
        .callTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun provideMangaApiService() = retrofit.create(MangaApiService::class.java)

    fun provideAnimeApiService() = retrofit.create(AnimeApiService::class.java)
}