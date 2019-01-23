package com.android.byc.coolweather.network;

import com.android.byc.coolweather.gson.Weather;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/23 10:02
 * @description
 */
public class WeatherResponse {
    @SerializedName("HeWeather")
    public List<Weather> heWeather;
}
