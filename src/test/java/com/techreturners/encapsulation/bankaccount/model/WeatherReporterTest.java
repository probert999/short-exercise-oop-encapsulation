package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class WeatherReporterTest {

  @Test
  public void testLondonWarm() {

    WeatherReporter testWeather = new WeatherReporter("London", 23.0);

    assertEquals(
        "Incorrect weather report!",
        "I am in London and it is ⛅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 73.4.",
        testWeather.getReport());
  }

  @Test
  public void testLondonCold() {

    WeatherReporter testWeather = new WeatherReporter("London", -5.0);

    assertEquals(
        "Incorrect weather report!",
        "I am in London and it is ⛅. It's too cold!. The temperature in Fahrenheit is 23.",
        testWeather.getReport());
  }

  @Test
  public void testLondonHot() {

    WeatherReporter testWeather = new WeatherReporter("London", 31.0);

    assertEquals(
        "Incorrect weather report!",
        "I am in London and it is ⛅. It's too hot!. The temperature in Fahrenheit is 87.8.",
        testWeather.getReport());
  }

  @Test
  public void testOtherLocation() {

    WeatherReporter testWeather = new WeatherReporter("Paris", 31.0);

    assertEquals(
        "Incorrect weather report!",
        "I am in Paris and it is 🔆. It's too hot!. The temperature in Fahrenheit is 87.8.",
        testWeather.getReport());
  }

  @Test
  public void testCapeTownWarm() {

    WeatherReporter testWeather = new WeatherReporter("Cape Town", 23.0);

    assertEquals(
        "Incorrect weather report!",
        "I am in Cape Town and it is ⛅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 73.4.",
        testWeather.getReport());
  }

  @Test
  public void testTemperatureConversion() {

    assertEquals(
        "Incorrect temperature conversion", 50, WeatherReporter.celsiusToFahrenheit(10), 0);

    assertEquals("Incorrect temperature conversion", 32, WeatherReporter.celsiusToFahrenheit(0), 0);

    assertEquals(
        "Incorrect temperature conversion", 14, WeatherReporter.celsiusToFahrenheit(-10), 0);
  }
}
