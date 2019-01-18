package com.android.byc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 13:14
 * @description
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI  aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
