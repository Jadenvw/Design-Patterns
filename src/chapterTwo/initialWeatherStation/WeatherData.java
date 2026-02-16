package chapterTwo.initialWeatherStation;

public class WeatherData {
    // instance variable declarations
    float temp;
    float humidity;
    float pressure;


    public void measurementsChange() {
        // grab most recent measurements with getter methods
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // Update displays by calling its update method and passing new measurements
        // currentConditionsDisplay.update(temp, humidity, pressure);
        // statisticsDisplay.update(temp, humidity, pressure);
        // forecastDisplay.update(temp, humidity, pressure);
    }

    public float getTemperature() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // other WeatherData methods here
}
