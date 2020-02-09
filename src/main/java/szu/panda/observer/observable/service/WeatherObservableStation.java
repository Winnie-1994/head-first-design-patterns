package szu.panda.observer.observable.service;

import szu.panda.observer.observable.observable.WeatherData;
import szu.panda.observer.observable.observer.CurrentConditionsDisplay;
import szu.panda.observer.observable.observer.ForecastDisplay;
import szu.panda.observer.observable.observer.StatisticsDisplay;

public class WeatherObservableStation {

	public static void weatherObservable(){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
