package com.example.search

class GetDataUseCase {
    operator fun invoke(): Out {
        return Out("data", "id", "name")
    }

    data class Out(
        val data: String,
        val id: String,
        val name: String
    )
}