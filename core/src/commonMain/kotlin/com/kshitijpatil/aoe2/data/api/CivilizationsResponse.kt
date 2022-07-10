package com.kshitijpatil.aoe2.data.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class CivilizationsResponse(
    @SerialName("civilizations")
    val civilizations: List<CivilizationDto> = emptyList()
)
