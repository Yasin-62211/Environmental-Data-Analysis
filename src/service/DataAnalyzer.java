package service;

import model.WeatherData;
import java.util.ArrayList;

public class DataAnalyzer {

    public static double averageTemperature(ArrayList<WeatherData> data) {

        double sum = 0;

        for (WeatherData weather : data) {
            sum += weather.getTemperature();
        }

        return sum / data.size();
    }

    public static double averageRainfall(ArrayList<WeatherData> data) {

        double sum = 0;

        for (WeatherData weather : data) {
            sum += weather.getRainfall();
        }

        return sum / data.size();
    }
}