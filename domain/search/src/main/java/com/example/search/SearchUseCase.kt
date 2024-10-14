package com.example.search

class SearchUseCase(private val searchRepository: SearchRepository) {
    fun execute(): String {
        return searchRepository.getValue()
    }
}