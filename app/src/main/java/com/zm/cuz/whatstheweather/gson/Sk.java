/**
  * Copyright 2019 bejson.com 
  */
package com.zm.cuz.whatstheweather.gson;

/**
 * Auto-generated: 2019-05-25 17:55:45
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Sk {

    private String temp;
    private String wind_direction;
    private String wind_strength;
    private String humidity;
    private String time;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_strength() {
        return wind_strength;
    }

    public void setWind_strength(String wind_strength) {
        this.wind_strength = wind_strength;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "sk:[temp = " + temp + ", wind_direction = " + wind_direction + ", wind_strength = " + wind_strength
                + ", humidity = " + humidity  + ", time = " + time + "]";
    }
}