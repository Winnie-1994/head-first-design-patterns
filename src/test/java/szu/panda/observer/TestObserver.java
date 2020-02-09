package szu.panda.observer;

import org.junit.Test;
import szu.panda.observer.observable.service.WeatherObservableStation;
import szu.panda.observer.observable.service.WeatherObservableStationHeatIndex;
import szu.panda.observer.weather.service.WeatherStationHeatIndex;

/**
 * @author : wuniting
 * @date :   2020-01-20
 * @description :
 */
public class TestObserver {

    @Test
    public void TestWeatherObserver(){
//        weatherStation.WeatherObservableStation();
        WeatherStationHeatIndex.weatherObserveHeatIndex();
    }

    @Test
    public void TestObservable(){
        WeatherObservableStation.weatherObservable();
        WeatherObservableStationHeatIndex.weatherObservableHeatIndex();
    }
}
