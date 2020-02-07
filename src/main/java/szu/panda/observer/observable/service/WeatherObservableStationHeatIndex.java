package szu.panda.observer.observable.service;

import org.springframework.stereotype.Service;
import szu.panda.observer.observable.observable.WeatherData;
import szu.panda.observer.observable.observer.CurrentConditionsDisplay;
import szu.panda.observer.observable.observer.ForecastDisplay;
import szu.panda.observer.observable.observer.HeatIndexDisplay;
import szu.panda.observer.observable.observer.StatisticsDisplay;

@Service
public class WeatherObservableStationHeatIndex {

	public void WeatherObservableStationHeatIndex(){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
