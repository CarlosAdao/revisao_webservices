package com.example.revisowebservices.service

import com.example.revisowebservices.enitities.Res
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import org.json.JSONArray
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Repository{

    @GET("characters")
    suspend fun getResults(
        @Query("offset")p1: Int,
        @Query("limit")p2: Int,
        @Query("ts") p3: String,
        @Query("apikey")p4: String,
        @Query("hash")p5: String
    ): Res

}

val urlApiMarvel = "https://gateway.marvel.com/v1/public/"
val urlApiPromo = "https://promoios.com.br/api/"
var urlRickMorty = "https://rickandmortyapi.com/api/"
var urlSortUser ="https://randomuser.me/api"

val retrofit = Retrofit.Builder()
    .baseUrl(urlApiMarvel)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val repository: Repository = retrofit.create(Repository::class.java)