package szu.panda.observer.weather.service;


import org.springframework.stereotype.Service;
import szu.panda.observer.weather.observer.CurrentConditionsDisplay;
import szu.panda.observer.weather.observer.ForecastDisplay;
import szu.panda.observer.weather.observer.StatisticsDisplay;
import szu.panda.observer.weather.subject.WeatherData;

@Service
public class WeatherStation {

	public void WeatherStation() {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay =
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
