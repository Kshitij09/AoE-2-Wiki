package com.kshitijpatil.aoe2.data.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

internal class AoeApiImpl(private val client: HttpClient) : AoeApi {
    override suspend fun getAllCivilizations(): List<CivilizationDto> {
        return client
            .get("https://age-of-empires-2-api.herokuapp.com/api/v1/civilizations")
            .body<CivilizationsResponse>()
            .civilizations
    }
}
