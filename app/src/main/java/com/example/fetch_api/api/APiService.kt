package com.example.fetch_api.api

interface APiService {
    @GET("character")
    fun getMorty () : call<ResponseMorty>


}