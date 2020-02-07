package szu.panda.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import szu.panda.observer.observable.service.WeatherObservableStation;
import szu.panda.observer.observable.service.WeatherObservableStationHeatIndex;
import szu.panda.observer.weather.service.WeatherStation;
import szu.panda.observer.weather.service.WeatherStationHeatIndex;

/**
 * @author : wuniting
 * @date :   2020-01-20
 * @description :
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestObserver {
    @Autowired
    WeatherStation weatherStation;

    @Autowired
    WeatherStationHeatIndex weatherStationHeatIndex;

    @Autowired
    WeatherObservableStation weatherObservableStation;

    @Autowired
    WeatherObservableStationHeatIndex weatherObservableStationHeatIndex;

    @Test
    public void TestWeatherObserver(){
//        weatherStation.WeatherObservableStation();
        weatherStationHeatIndex.WeatherStationHeatIndex();
    }

    @Test
    public void TestObservable(){
        weatherObservableStation.WeatherObservableStation();
        weatherObservableStationHeatIndex.WeatherObservableStationHeatIndex();
    }
}
