package com.dolfsys.secreatetwo.ads.utils

import android.util.Log
import com.dolfsys.secreatetwo.ads.domain.models.AdsRoot
import retrofit2.Response

object LocalAdsObj {

    var AdsStore: Response<AdsRoot>? = null

    val ListOfAdsApis = listOf<String>(
        "https://awcindia.github.io/Ads/baate-jo-call-chat.json",
        "https://raw.githubusercontent.com/awcindia/awcindia.github.io/main/Ads/baate-jo-call-chat.json",
        "https://skytechapps.s3.ap-south-1.amazonaws.com/awcindia.github.io/Ads/baate-jo-call-chat.json",
    )

    var selectedIndex = 0
    var selectedApi = ListOfAdsApis[selectedIndex]
    fun setNextApi(){
        selectedIndex += 1
        if (selectedIndex != ListOfAdsApis.size){
            Log.d("RECALLINGAPI", "setNextApi: ")
            selectedApi = ListOfAdsApis[selectedIndex]
        }
    }

}