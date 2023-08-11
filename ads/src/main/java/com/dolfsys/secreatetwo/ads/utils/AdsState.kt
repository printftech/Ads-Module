package com.dolfsys.secreatetwo.ads.utils

sealed class AdsState{

    object AdClosed : AdsState()
    object AdOpened : AdsState()
    object AdReady : AdsState()
}
