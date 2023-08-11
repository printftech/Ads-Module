package com.dolfsys.secreatetwo.ads.ads_hilt

import com.dolfsys.secreatetwo.ads.data.repository.AdsRepositoryImp
import com.dolfsys.secreatetwo.ads.domain.repository.AdsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAdsRepository(adsRepository: AdsRepositoryImp): AdsRepository

}