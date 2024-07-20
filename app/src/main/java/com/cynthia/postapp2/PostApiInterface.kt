package com.cynthia.postapp2

import retrofit2.Call
import retrofit2.http.GET

interface PostApiInterface {
    @GET("/posts")
    fun fetchPost():Call<List<Post>>


}