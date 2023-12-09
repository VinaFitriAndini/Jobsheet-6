package com.example.fetch_api.api

object APiConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"

    fun getRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    fun getService() : APiService {
        return getRetrofit().create(APiService::class.java)
    }
}