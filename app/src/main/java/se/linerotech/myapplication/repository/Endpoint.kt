package se.linerotech.myapplication.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import se.linerotech.myapplication.models.AllBreeds
import se.linerotech.myapplication.models.Breed
import se.linerotech.myapplication.models.Message
import se.linerotech.myapplication.models.RandomImage

interface Endpoint {
    @GET("breeds/list/all")
    fun getListOfBreeds() : Call<AllBreeds>

    @GET("breeds/image/random/3")
    fun getRandomImages() : Call<RandomImage>

    @GET("breed/{breed}/images")
    fun getBreedImages(@Path("breed")breed: String) : Call<Breed>
}