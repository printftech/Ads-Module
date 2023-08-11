package com.dolfsys.secreatetwo.ads.utils

sealed class AdsEvent{

    object onAdClose : AdsEvent()
    object onAdReady : AdsEvent()
    object onAdOpened : AdsEvent()

}
