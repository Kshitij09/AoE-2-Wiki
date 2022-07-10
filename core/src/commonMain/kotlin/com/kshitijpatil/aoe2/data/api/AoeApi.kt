package com.kshitijpatil.aoe2.data.api

interface AoeApi {
    suspend fun getAllCivilizations(): List<CivilizationDto>
}
