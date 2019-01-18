package com.android.byc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 13:06
 * @description
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
