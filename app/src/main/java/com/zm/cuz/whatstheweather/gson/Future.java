/**
  * Copyright 2019 bejson.com 
  */
package com.zm.cuz.whatstheweather.gson;

import java.io.Serializable;

/**
 * Auto-generated: 2019-05-25 17:55:45
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Future implements Serializable {

    private String temperature;
    private String weather;
    private Weather_id weather_id;
    public static class Weather_id {
        private String fa;
        private String fb;

        public String getFa() {
            return fa;
        }

        public void setFa(String fa) {
            this.fa = fa;
        }

        public String getFb() {
            return fb;
        }

        public void setFb(String fb) {
            this.fb = fb;
        }
    }
    private String wind;
    private String week;
    private String date;


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Weather_id getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(Weather_id weather_id) {
        this.weather_id = weather_id;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}