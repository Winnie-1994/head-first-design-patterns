package szu.panda.observer.weather.subject;

import szu.panda.observer.weather.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
