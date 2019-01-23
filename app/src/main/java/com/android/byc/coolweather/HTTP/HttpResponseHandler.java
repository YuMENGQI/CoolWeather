package com.android.byc.coolweather.HTTP;

import java.io.IOException;

import javax.security.auth.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/23 13:19
 * @description
 */
public abstract class HttpResponseHandler implements Callback {
    public HttpResponseHandler() {}

/*    public void onFailure(Call call, IOException e){
        onFailure(-1, e.getMessage().getBytes());
    }

    public void onResponse(Call call, Response response) throws IOException{
        int code = response.code();
        byte [] body = response.body().bytes();
        if (code > 299){
            onFailure(response.code(),body);
        } else {

        }
    }*/
}
