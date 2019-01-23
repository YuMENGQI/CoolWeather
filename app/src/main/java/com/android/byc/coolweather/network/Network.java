package com.android.byc.coolweather.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/22 18:01
 * @description
 */
public class Network {
    public static Network network;
    public Retrofit retrofit;
    public WeatherApi weatherApi;

    public Network() {
        Gson gson = new GsonBuilder().setLenient().create();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://guolin.tech/api/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
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
