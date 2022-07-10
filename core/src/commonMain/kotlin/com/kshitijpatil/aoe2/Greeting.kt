package com.kshitijpatil.aoe2

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class Greeting {
    private val client = HttpClient()
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    suspend fun getHtml(): String {
        val response = client.get("https://ktor.io/docs")
        return response.bodyAsText()
    }
}
