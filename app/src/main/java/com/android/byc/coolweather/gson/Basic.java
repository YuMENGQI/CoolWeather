package com.android.byc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 12:58
 * @description
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
