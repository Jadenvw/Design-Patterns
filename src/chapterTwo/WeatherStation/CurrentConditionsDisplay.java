package chapterTwo.WeatherStation;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // The constructor is passed the subject which is used to register the display as an observer
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = (float) weatherData.getTemp();
        this.humidity = (float) weatherData.getHumidity();
        display();
        // When update() is called, we save the temp and humidity and call display()
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
