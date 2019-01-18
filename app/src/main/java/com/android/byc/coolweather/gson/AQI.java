package com.android.byc.coolweather.gson;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 13:02
 * @description
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
