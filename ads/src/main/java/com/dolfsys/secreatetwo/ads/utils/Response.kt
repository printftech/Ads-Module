package com.dolfsys.secreatetwo.ads.utils

sealed class Response<T>(val videoList: T?= null, val errorMassage:String? = null) {

    class Success<T>(data:T?=null): Response<T>(videoList = data)
    class Loading<T>: Response<T>()
    class error<T>(errorMassage: String?): Response<T>(errorMassage = errorMassage)
}