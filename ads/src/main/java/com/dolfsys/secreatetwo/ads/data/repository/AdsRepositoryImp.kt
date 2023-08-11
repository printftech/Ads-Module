package com.dolfsys.secreatetwo.ads.data.repository

import android.util.Log
import com.dolfsys.secreatetwo.ads.data.remote.AdsApiCall
import com.dolfsys.secreatetwo.ads.domain.models.AdsRoot
import com.dolfsys.secreatetwo.ads.domain.repository.AdsRepository
import com.dolfsys.secreatetwo.ads.utils.LocalAdsObj
import com.dolfsys.secreatetwo.ads.utils.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AdsRepositoryImp @Inject constructor(
    val adsApiCall: AdsApiCall
): AdsRepository {


    override suspend fun getAddInfo(): Flow<Response<AdsRoot>> {
        return flow<Response<AdsRoot>> {

            var result:retrofit2.Response<AdsRoot>? = null
            try {
                if(LocalAdsObj.AdsStore == null){
                    Log.d("Adsapi","Calling api")
                    result = adsApiCall.getAds(LocalAdsObj.selectedApi)
                    LocalAdsObj.AdsStore = result
                }else{
                    Log.d("Adsapi","passing sotre value")
                    result = LocalAdsObj.AdsStore
                }
            }catch (e:Exception){
                emit(Response.error("An Exception occurs"))
            }
            if(result?.isSuccessful == true && result.body()?.data?.ads?.isNotEmpty() == true){
                emit(Response.Success(result.body()))
            }else{
                emit(Response.error(result?.errorBody().toString()))
            }
        }
    }
}