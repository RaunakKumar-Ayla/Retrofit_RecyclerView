package com.ms.retrofit_recyclerview.Interface

import com.ms.retrofit_recyclerview.DataClass.MyDataItem
import retrofit2.Call
import retrofit2.http.GET

interface MyInterface {

    @GET("/posts")
    fun getMyData() : Call<List<MyDataItem>>
}