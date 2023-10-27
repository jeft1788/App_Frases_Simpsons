package com.xcheko51x.frasessimpson_ejemplo.network

import com.xcheko51x.frasessimpson_ejemplo.models.Personaje
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WebService {
    @GET("quotes?count=12")
    suspend fun obtenerPersonajes(): Response<List<Personaje>>

    @GET("quotes")
    suspend fun obtenerPersonaje(
        @Query("character") personaje: String
    ): Response<List<Personaje>>
}