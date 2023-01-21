package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String,Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemperature() {
        double sum = 0.0;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }
    public double calculateMedianTemperature() {
        List<Double> temp = new LinkedList<>();
        double median = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temp.add(temperature.getValue());
        }
        try {
            Collections.sort(temp);

            if (temp.size() % 2 == 0) {
                median = (temp.get(temp.size() / 2 - 1) + temp.get(temp.size() / 2)) / 2;
            } else {
                median = temp.get((temp.size() - 1) / 2);
            }
        } catch (NullPointerException e) {
            return median;
        }
        return median;
    }

}
