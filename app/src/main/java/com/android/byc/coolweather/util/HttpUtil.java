package com.android.byc.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 9:24
 * @description
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
