import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.WeatherData;

public class ReportGenerator {

    public static void saveData(ArrayList<WeatherData> weatherList) {

        try {

            FileWriter writer = new FileWriter("weather_data.txt");

            for (WeatherData weather : weatherList) {

                writer.write(
                        weather.getMonth() + ", "
                                + weather.getTemperature() + "°C, "
                                + weather.getRainfall() + " mm\n"
                );

            }

            writer.close();

            System.out.println("\nData saved successfully!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}