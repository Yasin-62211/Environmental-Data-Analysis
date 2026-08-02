import java.util.ArrayList;
import java.util.Scanner;
import model.WeatherData;
import service.DataAnalyzer;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<WeatherData> weatherList = new ArrayList<>();

        System.out.print("How many months do you want to add? ");
        int n = input.nextInt();

        input.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nMonth " + i);

            System.out.print("Enter month name: ");
            String month = input.nextLine();

            System.out.print("Enter temperature: ");
            double temperature = input.nextDouble();

            System.out.print("Enter rainfall: ");
            double rainfall = input.nextDouble();

            input.nextLine();

            weatherList.add(
                    new WeatherData(month, temperature, rainfall)
            );
        }

        System.out.println("\n===== Result =====");

        System.out.println(
                "Average Temperature: "
                        + DataAnalyzer.averageTemperature(weatherList)
        );

        System.out.println(
                "Average Rainfall: "
                        + DataAnalyzer.averageRainfall(weatherList)
        );
        System.out.println("\n===== Weather Report =====");

        for (WeatherData weather : weatherList) {

            System.out.println(
                    "Month: " + weather.getMonth()
                            + " | Temperature: " + weather.getTemperature() + "°C"
                            + " | Rainfall: " + weather.getRainfall() + " mm"
            );
            if (weather.getRainfall() > 300) {

                System.out.println("Flood Risk: HIGH");

            } else if (weather.getRainfall() >= 200) {

                System.out.println("Flood Risk: MEDIUM");

            } else {

                System.out.println("Flood Risk: LOW");

            }

            System.out.println("------------------------");

            ReportGenerator.saveData(weatherList);
        }

    }
}