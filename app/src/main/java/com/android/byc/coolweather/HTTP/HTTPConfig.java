package com.android.byc.coolweather.HTTP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/23 12:53
 * @description
 */
public class HTTPConfig {
    private boolean debug = false;
    private String userAgent = " ";
    private boolean agent = true;
    private String taName = "Http";
    private int connectTimeout = 10;
    private int writeTimeout = 10;
    private int readTimeout = 10;
    private List<NameValuePair> commonFiled = new ArrayList<>();
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public List<NameValuePair> getCommonFiled() {
        return commonFiled;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public boolean isAgent() {
        return agent;
    }

    public void setAgent(boolean agent) {
        this.agent = agent;
    }

    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public  boolean isDebug() {
        return debug;
    }

    public String getUserAgent() {
        return userAgent;
    }
    // 更新参数
    public void updateCommonFiled(String key, String value) {
        boolean result = true;
        for (int i =0; i < commonFiled.size(); i++) {
            NameValuePair nameValuePair = commonFiled.get(i);
            if (nameValuePair.getName().equals(key)) {
                commonFiled.set(i, new NameValuePair(key, value));
                result = false;
                break;
            }
        }
        if(result) {
            commonFiled.add(new NameValuePair(key, value));
            }
        }
        public void removeCommondFiled(String key) {
        for (int i = commonFiled.size() - 1; i >= 0; i--){
            if(commonFiled.get(i).equals("key")) {
                commonFiled.remove(i);
            }
        }
    }
    public void addCommonFiled (String key, String value) {
        commonFiled.add(new NameValuePair(key, value));
    }
}
