package com.android.byc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 13:11
 * @description
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
