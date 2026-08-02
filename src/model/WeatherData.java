package model;

public class WeatherData {

    private String month;
    private double temperature;
    private double rainfall;

    public WeatherData(String month, double temperature, double rainfall) {
        this.month = month;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    public String getMonth() {
        return month;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRainfall() {
        return rainfall;
    }
}