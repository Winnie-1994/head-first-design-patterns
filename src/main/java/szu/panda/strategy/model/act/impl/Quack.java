package szu.panda.strategy.model.act.impl;

import szu.panda.strategy.model.act.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
