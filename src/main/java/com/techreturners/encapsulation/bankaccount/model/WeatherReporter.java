package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.Map;
import static java.util.Map.entry;

public class WeatherReporter {

  private final double HOT_TEMPERATURE = 30;
  private final double COLD_TEMPERATURE = 10;

  private final String DEFAULT_LOCATION_EMOJI = "🔆";
  private Map<String, String> locationEmojis =
      Map.ofEntries(entry("London", "⛅"), entry("Cape Town", "⛅"), entry("California", "🌅"));

  private final String location;
  private double temperature;

  public WeatherReporter(String location, double temperature) {
    this.location = location;
    this.temperature = temperature;
  }

  private double celsiusToFahrenheit() {
    return (9.0 / 5.0) * temperature + 32;
  }

  public String getReport() {
    return MessageFormat.format(
        "I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
        location, checkLocation(), checkTemperature(), celsiusToFahrenheit());
  }

  private String checkLocation() {
    return locationEmojis.getOrDefault(location, DEFAULT_LOCATION_EMOJI);
  }

  private String checkTemperature() {
    String temperatureComment = "Ahhh...it's just right 😊!";
    if (temperature > HOT_TEMPERATURE) {
      temperatureComment = "It's too hot!";
    } else if (temperature < COLD_TEMPERATURE) {
      temperatureComment = "It's too cold!";
    }
    return temperatureComment;
  }
}
