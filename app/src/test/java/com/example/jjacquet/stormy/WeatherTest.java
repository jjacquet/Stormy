package com.example.jjacquet.stormy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class WeatherTest {

    private static final double DELTA = 0.0;

    @Test
    public void temperatureIsCorrect() throws Exception {
        CurrentWeather currentWeather = new CurrentWeather();

        currentWeather.setTemperature(100.0);
        assertEquals(100.0, currentWeather.getTemperature(), DELTA);
        System.out.println(currentWeather.getTemperature());
    }
    

}