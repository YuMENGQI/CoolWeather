package com.android.byc.coolweather;

import com.android.byc.coolweather.Picture.Picture;
import com.android.byc.coolweather.Picture.PictureApi;
import com.android.byc.coolweather.gson.Weather;
import com.android.byc.coolweather.network.Network;
import com.android.byc.coolweather.network.WeatherApi;
import com.android.byc.coolweather.network.WeatherResponse;

import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void queryWeather() {
        String cityId = "CN101020600";
        String key = "f8c8dee47ed745c6bc109f1abfc13d13";
        Network network = Network.getInstance();
        WeatherApi weatherApi = network.getWeatherApi();
        Call<WeatherResponse> call = weatherApi.queryWithCity(cityId, key);
        try {
            Response<WeatherResponse> weatherResponse = call.execute();
            WeatherResponse response =  weatherResponse.body();
            List<Weather> list = response.heWeather;
            Weather weather = list.get(0);
            String status = weather.status;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryPicture(){
        String bing_pic = "";
        Network network = Network.getInstance();
        WeatherApi weatherApi = network.getWeatherApi();
        Call call = weatherApi.queryWithPicture();
        try {
            Response response = call.execute();
            Object o = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}