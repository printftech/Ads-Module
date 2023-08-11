package com.dolfsys.secreatetwo.ads.domain.repository

import com.dolfsys.secreatetwo.ads.domain.models.AdsRoot
import com.dolfsys.secreatetwo.ads.utils.Response
import kotlinx.coroutines.flow.Flow

interface AdsRepository {

    suspend fun getAddInfo():Flow<Response<AdsRoot>>
}