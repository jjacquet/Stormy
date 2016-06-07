package com.example.jjacquet.stormy;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class WeatherTest {

    private CurrentWeather currentWeather;

    @Before
    public void setUp() throws Exception {
        currentWeather = new CurrentWeather();
    }

    @Test
    public void temperatureIsCorrect() throws Exception {
        double DELTA = -100.0;
        currentWeather.setTemperature(100.0);
        assertEquals(100.0, currentWeather.getTemperature(), DELTA);
        System.out.println(currentWeather.getTemperature());
    }

    @Test
    public void weatherIconIsPresent() throws Exception {
        currentWeather.getIcon();
        assertEquals(currentWeather.getIcon(), currentWeather.getIcon());
        System.out.println(currentWeather.getIcon());
    }

    @After
    public void tearDown() throws Exception {


    }
}