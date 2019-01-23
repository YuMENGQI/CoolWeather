package com.android.byc.coolweather.HTTP;

import com.google.gson.Gson;

import java.util.Map;

import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * Get请求封装
 */
public class HTTPCaller {
    private  static  HTTPCaller _instance = null;
    private OkHttpClient client;
    //以URL为KEY存储的请求
    private Map<String, Call> requestHandleMap = null;
    private CacheControl cacheControl = null;// 缓存控制器
    private Gson gson = null;
    private HTTPConfig httpConfig = new HTTPConfig();// 配置信息
}
