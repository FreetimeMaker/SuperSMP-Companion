package com.freetime.ssmp.data.api

interface ServerApi {
    @GET("2/supersmp.fun")
    suspend fun getStatus(): ServerStatusResponse
}
