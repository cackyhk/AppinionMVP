package com.tsurkis.appinionmvp.remoteapi.opinionatedquotes

import com.tsurkis.appinionmvp.remoteapi.opinionatedquotes.responseobjects.RandomOpinionatedQuotesResponseObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpinionatedAPI {

    @GET("/v1/quotes")
    fun requestRandomOpinionatedQuotes(
            @Query("rand") isRandom: String,
            @Query("n") numberOfQuotes: Int
    ): Call<RandomOpinionatedQuotesResponseObject>
}