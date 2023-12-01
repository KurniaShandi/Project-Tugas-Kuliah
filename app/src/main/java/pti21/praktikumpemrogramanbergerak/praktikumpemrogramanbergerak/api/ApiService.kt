package pti21.praktikumpemrogramanbergerak.praktikumpemrogramanbergerak.api

import pti21.praktikumpemrogramanbergerak.praktikumpemrogramanbergerak.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}