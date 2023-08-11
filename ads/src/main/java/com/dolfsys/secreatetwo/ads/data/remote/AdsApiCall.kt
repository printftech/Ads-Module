package com.dolfsys.secreatetwo.ads.data.remote

import com.dolfsys.secreatetwo.ads.domain.models.AdsRoot
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface AdsApiCall {

    @GET
    suspend fun getAds(@Url adsApi:String):Response<AdsRoot>

}