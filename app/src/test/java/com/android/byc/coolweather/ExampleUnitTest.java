package com.android.byc.coolweather;

import com.android.byc.coolweather.gson.Weather;
import com.android.byc.coolweather.network.Network;

import org.junit.Test;

import java.io.IOException;

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
        Call<Weather> call = Network.getInstance().getWeatherApi().queryWithCity(cityId, key);
        try {
            Response<Weather> weatherResponse = call.execute();
            Weather weather =  weatherResponse.body();
            String status = weather.status;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}