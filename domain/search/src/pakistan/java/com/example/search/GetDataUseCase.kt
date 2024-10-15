package com.example.search

class GetDataUseCase {
    operator fun invoke(): Out {
        return Out("data")
    }

    data class Out(
        val data: String
    )
}