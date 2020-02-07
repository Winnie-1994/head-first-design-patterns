package szu.panda.strategy.model.act.impl;

import szu.panda.strategy.model.act.QuackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
