package com.example.data.repositories

import com.example.data.remote.animedtos.toDomain
import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = sendRequest {
        animeApiService.fetchAnime().toDomain()
    }


}