package szu.panda.observer.weather.subject;

import szu.panda.observer.weather.observer.Observer;

public interface Subject {

	/**
	 *
	 * @param o
	 */
	void registerObserver(Observer o);

	/**
	 *
	 * @param o
	 */
	void removeObserver(Observer o);

	/**
	 *
	 */
	void notifyObservers();
}
