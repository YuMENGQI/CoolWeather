package com.android.byc.coolweather.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/22 18:01
 * @description
 */
public class Network {
    private static Network network;
    private Retrofit retrofit;
    private static WeatherApi weatherApi;

    private Network() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://guolin.tech/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherApi = retrofit.create(WeatherApi.class);
    }

    public static Network getInstance() {
        if (network == null) {
            network = new Network();

        }

        return network;
    }

    public WeatherApi getWeatherApi() {
        return weatherApi;
    }
}
