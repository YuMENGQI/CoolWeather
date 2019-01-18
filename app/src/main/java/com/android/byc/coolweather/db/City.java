package com.android.byc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/16 9:10
 * @description
 */
public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceCode) {
        this.provinceId = provinceCode;
    }
}
