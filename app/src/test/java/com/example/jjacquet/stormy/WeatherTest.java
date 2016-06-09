package com.example.jjacquet.stormy;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is an example of unit testing my weather application and verying that the methods function and return data.
 */

public class WeatherTest extends MainActivity {

    private CurrentWeather currentWeather;

    @Before
    public void setUp() throws Exception {
        currentWeather = new CurrentWeather();
    }


    @Test
    public void temperatureIsPresent() throws Exception {
        currentWeather.setTemperature(100);
        assertNotNull(currentWeather.getTemperature());
        System.out.println(currentWeather.getTemperature());
    }

    @Test
    public void weatherIconIsPresent() throws Exception {
        currentWeather.setIcon("");
        assertNotNull(currentWeather.getIconId());
        System.out.println(currentWeather.getIconId());
    }

    @Test
    public void timeZoneIsPresent() throws Exception {
        currentWeather.setTimeZone("");
        System.out.println(currentWeather.getTimeZone());
    }

    @After
    public void tearDown() throws Exception {


    }
}

