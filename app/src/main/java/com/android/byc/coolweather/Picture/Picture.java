package com.android.byc.coolweather.Picture;

import com.android.byc.coolweather.network.Network;
import com.android.byc.coolweather.network.WeatherApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/23 10:32
 * @description
 */
public class Picture {
    private static Picture picture;
    private Retrofit retrofit;
    private static PictureApi pictureApi;
    private Picture() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://guolin.tech/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        pictureApi = retrofit.create(PictureApi.class);
    }
public static Picture getInstance(){
        if (picture == null){
            picture = new Picture();
        }
        return picture;
    }
    public PictureApi getPictureApi(){
        return pictureApi;
    }
}
