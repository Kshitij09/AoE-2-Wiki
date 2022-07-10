package com.kshitijpatil.aoe2.data.api


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CivilizationDto(
    @SerialName("army_type")
    val armyType: String,
    @SerialName("civilization_bonus")
    val civilizationBonus: List<String> = emptyList(),
    @SerialName("expansion")
    val expansion: String,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("team_bonus")
    val teamBonus: String,
    @SerialName("unique_tech")
    val uniqueTech: List<String> = emptyList(),
    @SerialName("unique_unit")
    val uniqueUnit: List<String> = emptyList()
)
