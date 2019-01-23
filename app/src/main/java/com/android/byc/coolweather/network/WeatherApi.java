package com.android.byc.coolweather.network;

import com.android.byc.coolweather.gson.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/22 17:56
 * @description
 */
public interface WeatherApi {

    @GET("weather")
    Call<Weather> queryWithCity(
            @Query("cityid") String cityid,
            @Query("key") String key
    );
}
